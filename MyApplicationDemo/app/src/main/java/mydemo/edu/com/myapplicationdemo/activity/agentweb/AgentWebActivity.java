package mydemo.edu.com.myapplicationdemo.activity.agentweb;

import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v7.app.AppCompatActivity;
import android.widget.LinearLayout;

import com.just.library.AgentWeb;

import mydemo.edu.com.myapplicationdemo.R;

/**
 * Created by Administrator on 2017/10/10.
 */

public class AgentWebActivity extends AppCompatActivity {
    AgentWeb a;

    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_agent_web);
        initView();

    }

    private void initView() {
        LinearLayout mLinearLayout = (LinearLayout) findViewById(R.id.rl);
        a = AgentWeb.with(this)//传入Activity
                .setAgentWebParent(mLinearLayout, new LinearLayout.LayoutParams(-1, -1))//传入AgentWeb 的父控件 ，如果父控件为 RelativeLayout ， 那么第二参数需要传入 RelativeLayout.LayoutParams
                .useDefaultIndicator()// 使用默认进度条
                .defaultProgressBarColor() // 使用默认进度条颜色
//                .setReceivedTitleCallback(mCallback) //设置 Web 页面的 title 回调
                .createAgentWeb()//
                .ready()
                .go("http://www.jd.com");
    }
    }
