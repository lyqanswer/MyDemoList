package mydemo.edu.com.myapplicationdemo.activity.recyclerView;

import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;

import java.util.ArrayList;

import mydemo.edu.com.myapplicationdemo.R;
import mydemo.edu.com.myapplicationdemo.activity.recyclerView.adapter.MyRecyclerViewAdapter;
import mydemo.edu.com.myapplicationdemo.activity.recyclerView.decoration.RecyclerViewItemDecoration;


/**
 * Created by Administrator on 2017/9/30.
 * <p>
 * 瀑布流简单demo，还需添加
 */

public class RecyclerViewActivity extends AppCompatActivity {
    RecyclerView recyclerView;
    private ArrayList<String> stringList = new ArrayList<String>();
    private MyRecyclerViewAdapter myRecyclerViewAdapter;

    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_recyclerview);
        initView();
    }

    private void initView() {
        recyclerView = (RecyclerView) findViewById(R.id.recyclerView);
        initAdapter();
        // 新建一个线性布局管理器,并且设置排布方向为竖直方向
        LinearLayoutManager linearLayoutManager = new LinearLayoutManager(this);
        linearLayoutManager.setOrientation(LinearLayoutManager.VERTICAL);
        RecyclerViewItemDecoration myItemDecoration = new RecyclerViewItemDecoration(RecyclerViewActivity.this, linearLayoutManager.getOrientation());
        recyclerView.setLayoutManager(linearLayoutManager); // 设置子项排布方向
        recyclerView.addItemDecoration(myItemDecoration);
        recyclerView.setAdapter(myRecyclerViewAdapter); // 设置适配器
    }

    public void initAdapter() { // 初始化显示的数据和适配器
        String str = null;
        for (int i = 0; i < 20; i++) {
            str = "项目" + (i + 1);
            stringList.add(str);
        }
        myRecyclerViewAdapter = new MyRecyclerViewAdapter(this, stringList);
    }
}
