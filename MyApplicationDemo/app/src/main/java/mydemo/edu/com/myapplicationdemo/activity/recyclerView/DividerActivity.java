package mydemo.edu.com.myapplicationdemo.activity.recyclerView;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;

import java.util.ArrayList;
import java.util.List;

import mydemo.edu.com.myapplicationdemo.R;
import mydemo.edu.com.myapplicationdemo.activity.recyclerView.adapter.TestAdapter;
import mydemo.edu.com.myapplicationdemo.activity.recyclerView.decoration.TestDividerItemDecoration;

/**
 * Created by Administrator on 2017/10/12.
 */

public class DividerActivity extends AppCompatActivity {
    RecyclerView mRecyclerView;
    List<String> data;
    TestAdapter mAdapter;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_divider);
        mRecyclerView = (RecyclerView) findViewById(R.id.divider_recyclerview);
        initDatas();
        mAdapter = new TestAdapter(data);
        mRecyclerView.setAdapter(mAdapter);
        LinearLayoutManager layoutmanager = new LinearLayoutManager(this);
        layoutmanager.setOrientation(LinearLayoutManager.VERTICAL);
        mRecyclerView.setLayoutManager(layoutmanager);
        mRecyclerView.addItemDecoration(new TestDividerItemDecoration());
    }

    private void initDatas() {
        data = new ArrayList<>();
        for (int i = 0; i < 56; i++) {
            data.add(i + " test ");
        }
    }
}
