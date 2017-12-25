package mydemo.edu.com.myapplicationdemo.activity.glide;

import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v7.app.AppCompatActivity;
import android.widget.ImageView;

import com.bumptech.glide.Glide;
import com.bumptech.glide.load.engine.DiskCacheStrategy;

import butterknife.BindView;
import butterknife.ButterKnife;
import mydemo.edu.com.myapplicationdemo.R;

/**
 * Created by Administrator on 2017/12/21.
 */

public class MyGlideActivity extends AppCompatActivity {


    @BindView(R.id.img)
    ImageView img;

    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_my_glide);
        ButterKnife.bind(this);

        initView();

    }

    private void initView() {
        Glide.with(MyGlideActivity.this).load(R.drawable.clock).skipMemoryCache(false).diskCacheStrategy(DiskCacheStrategy.NONE).fitCenter().into(img);

    }
}
