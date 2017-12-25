package mydemo.edu.com.myapplicationdemo.activity.recyclerView;

import android.content.Intent;
import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.Button;
import android.widget.LinearLayout;

import mydemo.edu.com.myapplicationdemo.R;

/**
 * Created by Administrator on 2017/10/12.
 * <p>
 * 所有相关recyclerView 相关demo集合
 */

public class MyRecyclerActivity extends AppCompatActivity implements View.OnClickListener {

    Button btnDivider;
    Button btnDivider1;
    Button btnDivider2;
    Button btnDivider3;
    Button btnDivider4;
    Button btnDivider5;
    LinearLayout activityMain;

    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_my_recycler);
        initView();
    }

    private void initView() {
        btnDivider = (Button) findViewById(R.id.btn_divider);
        btnDivider1 = (Button) findViewById(R.id.btn_divider1);
        btnDivider2 = (Button) findViewById(R.id.btn_divider2);
        btnDivider3 = (Button) findViewById(R.id.btn_divider3);
        btnDivider4 = (Button) findViewById(R.id.btn_divider4);
        btnDivider5 = (Button) findViewById(R.id.btn_divider5);

        btnDivider.setOnClickListener(this);
        btnDivider1.setOnClickListener(this);
        btnDivider2.setOnClickListener(this);
        btnDivider3.setOnClickListener(this);
        btnDivider4.setOnClickListener(this);
        btnDivider5.setOnClickListener(this);
    }


    @Override
    public void onClick(View view) {

        switch (view.getId()) {
            case R.id.btn_divider:
                Intent intent = new Intent(MyRecyclerActivity.this, DividerActivity.class);
                startActivity(intent);

                break;
            case R.id.btn_divider1:
                Intent intent1 = new Intent(MyRecyclerActivity.this, ColorDividerActivity.class);
                startActivity(intent1);

                break;
            case R.id.btn_divider2:
                Intent intent2 = new Intent(MyRecyclerActivity.this, TimelineActivity.class);
                startActivity(intent2);

                break;
            case R.id.btn_divider3:
                Intent intent3 = new Intent(MyRecyclerActivity.this, BookRankActivity.class);
                startActivity(intent3);

                break;
            case R.id.btn_divider4:
                Intent intent4 = new Intent(MyRecyclerActivity.this, HeaderActivity.class);
                startActivity(intent4);
            case R.id.btn_divider5:
                Intent intent5 = new Intent(MyRecyclerActivity.this, StickyHeaderActivity.class);
                startActivity(intent5);

                break;

            default:
                break;
        }
    }
}
