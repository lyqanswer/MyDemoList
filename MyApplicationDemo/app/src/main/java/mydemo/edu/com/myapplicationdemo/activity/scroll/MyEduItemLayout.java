package mydemo.edu.com.myapplicationdemo.activity.scroll;

/**
 * Created by Administrator on 2016/12/12.
 */


import android.content.Context;
import android.content.res.TypedArray;
import android.util.AttributeSet;
import android.view.View;
import android.widget.RelativeLayout;
import android.widget.TextView;

import mydemo.edu.com.myapplicationdemo.R;

/**
 *
 * @author lyq
 *
 */
public class MyEduItemLayout extends RelativeLayout {
    // 图片，标题
    private String mImageView;
    private String mTitle;
    private Context mContext;

    public MyEduItemLayout(Context context, AttributeSet attrs) {
        this(context, attrs, 0);
        mContext = context;
    }

    public MyEduItemLayout(Context context, AttributeSet attrs, int defStyle) {
        super(context, attrs, defStyle);
        mContext = context;
        View.inflate(context, R.layout.layout_item_myedu, this);

        TypedArray a = context.obtainStyledAttributes(attrs, R.styleable.MyEduClickableLayout, defStyle, 0);
        mImageView = a.getString(R.styleable.MyEduClickableLayout_primary_img);
        mTitle = a.getString(R.styleable.MyEduClickableLayout_title_text);
        a.recycle();

        init();
    }

    /**
     * 初始化
     */
    private void init() {
//        ImageView imgPrimary = (ImageView) findViewById(R.id.img);
        TextView tvTitle = (TextView) findViewById(R.id.tv_name);
//        if (mImageView != null) {
//            imgPrimary.setImageBitmap(BitmapParseUtil.parse(mImageView, mContext));
//        }
        if (mTitle != null) {
            tvTitle.setText(mTitle);
        }
    }
}
