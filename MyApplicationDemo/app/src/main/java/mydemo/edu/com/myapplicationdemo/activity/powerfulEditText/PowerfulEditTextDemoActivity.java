package mydemo.edu.com.myapplicationdemo.activity.powerfulEditText;

import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.design.widget.Snackbar;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.Button;

import mydemo.edu.com.myapplicationdemo.R;

/**
 * Created by Administrator on 2017/9/30.
 */

public class PowerfulEditTextDemoActivity extends AppCompatActivity  {
    Button btn;

    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_powerful_edittext);
        initView();
    }

    private void initView() {
        btn = (Button) findViewById(R.id.btn);
        btn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Snackbar.make(view, "data deleted", Snackbar.LENGTH_LONG)
                        .setAction("Undo", new View.OnClickListener(){
                            @Override
                            public void onClick(View v) {
                            }
                        })
                        .show();
            }
        });
    }


}

