package mydemo.edu.com.myapplicationdemo.activity.recyclerView;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;

import java.util.ArrayList;
import java.util.List;

import mydemo.edu.com.myapplicationdemo.R;
import mydemo.edu.com.myapplicationdemo.activity.recyclerView.adapter.TestAdapter;
import mydemo.edu.com.myapplicationdemo.activity.recyclerView.decoration.GroupInfo;
import mydemo.edu.com.myapplicationdemo.activity.recyclerView.decoration.StickySectionDecoration;

/**
 * Created by Administrator on 2017/10/12.
 */

public class StickyHeaderActivity extends AppCompatActivity {
    RecyclerView mRecyclerView;
    List<String> data;
    TestAdapter mAdapter;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_header);
        mRecyclerView = (RecyclerView) findViewById(R.id.header_recyclerview);

        initDatas();

        mAdapter = new TestAdapter(data);
        mRecyclerView.setAdapter(mAdapter);
        LinearLayoutManager layoutmanager = new LinearLayoutManager(this);
        layoutmanager.setOrientation(LinearLayoutManager.VERTICAL);
        mRecyclerView.setLayoutManager(layoutmanager);
        StickySectionDecoration.GroupInfoCallback callback = new StickySectionDecoration.GroupInfoCallback() {
            @Override
            public GroupInfo getGroupInfo(int position) {

                /**
                 * 分组逻辑，这里为了测试每5个数据为一组。大家可以在实际开发中
                 * 替换为真正的需求逻辑
                 */
                int groupId = position / 5;
                int index = position % 5;
                GroupInfo groupInfo = new GroupInfo(groupId, groupId + "");
                groupInfo.setGroupLength(5);
                groupInfo.setPosition(index);
                return groupInfo;
            }
        };
        mRecyclerView.addItemDecoration(new StickySectionDecoration(this, callback));
    }

    /**
     * 初始化测试数据
     */
    private void initDatas() {
        data = new ArrayList<>();
        for (int i = 0; i < 56; i++) {
            data.add(i + " test ");
        }
    }
}
