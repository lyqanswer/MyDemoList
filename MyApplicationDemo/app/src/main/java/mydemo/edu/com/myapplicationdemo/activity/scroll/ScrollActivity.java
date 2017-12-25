package mydemo.edu.com.myapplicationdemo.activity.scroll;

/**
 * Created by Administrator on 2017/12/22.
 */

import android.app.Activity;
import android.os.Bundle;
import android.view.View;
import android.widget.LinearLayout;
import android.widget.Toast;

import java.util.ArrayList;
import java.util.List;

import mydemo.edu.com.myapplicationdemo.R;
import mydemo.edu.com.myapplicationdemo.activity.scroll.wheelview.DensityUtil;
import mydemo.edu.com.myapplicationdemo.activity.scroll.wheelview.OnWheelChangedListener;
import mydemo.edu.com.myapplicationdemo.activity.scroll.wheelview.OnWheelScrollListener;
import mydemo.edu.com.myapplicationdemo.activity.scroll.wheelview.StringWheelAdapter;
import mydemo.edu.com.myapplicationdemo.activity.scroll.wheelview.WheelView;


public class ScrollActivity extends Activity implements OnWheelScrollListener, OnWheelChangedListener {
    WheelView wvTest;
    StringWheelAdapter wheelAdapter;
    List<String> testDatas;
    LinearLayout layout;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_scroll);
        initData();
        initView();
    }

    private void initData() {
        // 构造测试数据
        testDatas = new ArrayList<String>();
        for (int i = 0; i < 10; i++) {
            testDatas.add("test-data" + i);
        }
        wheelAdapter = new StringWheelAdapter(testDatas);
    }


    private void initView() {
        wvTest = (WheelView) findViewById(R.id.wv_test);
        wvTest.setVisibleItems(9);// 设置显示数
        wvTest.setAdapter(wheelAdapter);
        wvTest.setCurrentItem(testDatas.size() / 2);
        wvTest.setCyclic(true);// 设置可以滚动

        wvTest.setITEMS_TEXT_COLOR(this.getResources().getColor(R.color.colorPrimaryDark));
        wvTest.setVALUE_TEXT_COLOR(this.getResources().getColor(R.color.colorAccent));
        wvTest.TEXT_SIZE = DensityUtil.dip2px(this, 30);
        wvTest.CURRENT_TEXT_SIZE = DensityUtil.dip2px(this, 35);

        wvTest.addScrollingListener(this);
        wvTest.addChangingListener(this);
        AddAndSubTestView addAndSubTestView = null;
        layout = (LinearLayout) findViewById(R.id.linearLayout);
        for (int i = 1; i < 4; i++) {
            addAndSubTestView = new AddAndSubTestView(ScrollActivity.this, 20, "单选");
            layout.addView(addAndSubTestView);
        }
//        AddAndSubTestView addAndSubTestView = new AddAndSubTestView(MainActivity.this, 20, "单选");
//        layout.addView(addAndSubTestView);
        addAndSubTestView.setOnNumChangeListener(new AddAndSubTestView.OnNumChangeListener() {
            @Override
            public void onNumChange(View view, int num) {

            }
        });

    }

    @Override
    public void onScrollingStarted(WheelView wheel) {
        // 滚动开始，加入自己的处理
    }

    @Override
    public void onScrollingFinished(WheelView wheel) {
        // 滚动完成，加入自己的处理
        Toast.makeText(this, "wvTest" + wvTest.getCurrentItem(), Toast.LENGTH_LONG).show();
    }

    @Override
    public void onChanged(WheelView wheelView, int oldValue, int newValue) {
        // 滚动中，加入自己的处理
    }


}

