package mydemo.edu.com.myapplicationdemo.activity.expandabletextview;

import android.graphics.Color;
import android.os.Bundle;
import android.support.v4.widget.SwipeRefreshLayout;
import android.support.v7.app.AppCompatActivity;

import mydemo.edu.com.myapplicationdemo.R;

/**
 * Created by Administrator on 2017/9/30.
 */

public class RunningTextViewDemoActivity extends AppCompatActivity {

    private SwipeRefreshLayout srlRoot;
    private NumberRunningTextView tvMoney;
    private NumberRunningTextView tvNum;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_running_textview);

        initView();
        initListener();

        tvMoney.setContent("1354.00");
        tvNum.setContent("200");
    }

    private void initView(){
        srlRoot = (SwipeRefreshLayout) findViewById(R.id.srl_root);
        tvMoney = (NumberRunningTextView) findViewById(R.id.tv_money);
        tvNum = (NumberRunningTextView) findViewById(R.id.tv_num);

        srlRoot.setColorSchemeColors(Color.parseColor("#ff7300"));
    }

    private void initListener() {
        srlRoot.setOnRefreshListener(new SwipeRefreshLayout.OnRefreshListener() {
            @Override
            public void onRefresh() {
                tvMoney.setContent("1454.00");
                tvNum.setContent("300");
                srlRoot.setRefreshing(false);
            }
        });

    }
}
