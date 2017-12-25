package mydemo.edu.com.myapplicationdemo.activity;

import android.app.ListActivity;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.ArrayAdapter;
import android.widget.ListView;

import mydemo.edu.com.myapplicationdemo.activity.agentweb.AgentWebActivity;
import mydemo.edu.com.myapplicationdemo.activity.alarm.AlarmActivity;
import mydemo.edu.com.myapplicationdemo.activity.bean.DemoBean;
import mydemo.edu.com.myapplicationdemo.activity.cart.CartActivity;
import mydemo.edu.com.myapplicationdemo.activity.expandabletextview.ExpandableTextViewDemoActivity;
import mydemo.edu.com.myapplicationdemo.activity.expandabletextview.RunningTextViewDemoActivity;
import mydemo.edu.com.myapplicationdemo.activity.glide.MyGlideActivity;
import mydemo.edu.com.myapplicationdemo.activity.infinitecardview.InfiniteCardViewActivity;
import mydemo.edu.com.myapplicationdemo.activity.linkScrollMsky.MyActivity;
import mydemo.edu.com.myapplicationdemo.activity.piechartview.PieChartViewDemoActivity;
import mydemo.edu.com.myapplicationdemo.activity.powerfulEditText.PowerfulEditTextDemoActivity;
import mydemo.edu.com.myapplicationdemo.activity.recyclerView.MyRecyclerActivity;
import mydemo.edu.com.myapplicationdemo.activity.recyclerView.RecyclerViewActivity;
import mydemo.edu.com.myapplicationdemo.activity.scroll.ScrollActivity;
import mydemo.edu.com.myapplicationdemo.activity.topActivity.TopActivity;


//主页功能列表
public class MainActivity extends ListActivity {

    private DemoBean[] mDatas = {
            new DemoBean("RecyclerViewActivity", RecyclerViewActivity.class),
            new DemoBean("TopActivity", TopActivity.class),
            new DemoBean(" PowerfulEditTextDemoActivity", PowerfulEditTextDemoActivity.class),
            new DemoBean(" ExpandableTextViewDemoActivity", ExpandableTextViewDemoActivity.class),
            new DemoBean(" RunningTextViewDemoActivity", RunningTextViewDemoActivity.class),
            new DemoBean(" InfiniteCardViewActivity", InfiniteCardViewActivity.class),
            new DemoBean(" AgentWebActivity", AgentWebActivity.class),
            new DemoBean(" PieChartViewDemoActivity", PieChartViewDemoActivity.class),
            new DemoBean(" MyRecyclerActivity", MyRecyclerActivity.class),
            new DemoBean(" MyGlideActivity", MyGlideActivity.class),
            new DemoBean("AlarmActivity", AlarmActivity.class),
            new DemoBean(" MyActivity", MyActivity.class),
            new DemoBean(" CartActivity", CartActivity.class),
            new DemoBean(" ScrollActivity", ScrollActivity.class)
    };

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

        ArrayAdapter<DemoBean> adapter = new ArrayAdapter<DemoBean>(this, android.R.layout.simple_list_item_1, mDatas);
        setListAdapter(adapter);
    }

    @Override
    protected void onListItemClick(ListView l, View v, int position, long id) {
        //为条目设置点击事件
        DemoBean dataBean = mDatas[position];
        startActivity(new Intent(this, dataBean.clazz));//跳转到对应的activity
    }
}
