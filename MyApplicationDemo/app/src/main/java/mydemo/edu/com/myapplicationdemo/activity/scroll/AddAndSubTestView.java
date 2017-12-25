package mydemo.edu.com.myapplicationdemo.activity.scroll;

import android.content.Context;
import android.text.Editable;
import android.text.Selection;
import android.text.TextWatcher;
import android.util.AttributeSet;
import android.util.Log;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.RelativeLayout;
import android.widget.TextView;
import android.widget.Toast;

import mydemo.edu.com.myapplicationdemo.R;


/**
 * @author lyq
 */
public class AddAndSubTestView extends RelativeLayout {
    View mView;
    int total;
    String title;
    Button btnAdd;
    Button btnSub;
    TextView tvTitle;
    TextView tvTotal;
    EditText etNum;
    int num;          //editText中的数值
    OnNumChangeListener onNumChangeListener;
    Context mContext;

    public AddAndSubTestView(Context context, AttributeSet attrs) {
        super(context, attrs);
        mView = View.inflate(context, R.layout.view_add_sub, this);
        initView();
    }

    public AddAndSubTestView(Context context, int total, String title) {
        super(context);
        this.total = total;
        this.title = title;
        this.mContext = context;
        mView = View.inflate(context, R.layout.view_add_sub, this);
        initView();
        initData();
    }


    private void initView() {
        tvTitle = (TextView) findViewById(R.id.tv_title);
        tvTotal = (TextView) findViewById(R.id.tv_total);
        btnAdd = (Button) findViewById(R.id.btn_add);
        btnSub = (Button) findViewById(R.id.btn_sub);
        etNum = (EditText) findViewById(R.id.et_num);
        btnAdd.setTag("+");
        btnSub.setTag("-");
        etNum.setText(String.valueOf(num));
        Editable editable = etNum.getText();
        Selection.setSelection(editable, editable.length());
        btnAdd.setOnClickListener(new OnButtonClickListener());
        btnSub.setOnClickListener(new OnButtonClickListener());
        etNum.addTextChangedListener(new OnTextChangeListener());
    }

    private void initData() {
        tvTitle.setText(title);
        tvTotal.setText(String.valueOf(total));
    }

    /**
     * 加减按钮事件监听器
     *
     * @author lyq
     */
    class OnButtonClickListener implements OnClickListener {

        @Override
        public void onClick(View v) {
            String numString = etNum.getText().toString();
            if (numString == null || numString.equals("")) {
                num = 0;
                etNum.setText("0");
            } else {
                if (v.getTag().equals("+")) {
                    if (++num < 0)  //先加，再判断
                    {
                        num--;
                        Toast.makeText(mContext, "请输入一个大于0的数字",
                                Toast.LENGTH_SHORT).show();
                    } else {
                        if (num <= Integer.parseInt(tvTotal.getText().toString())) {
                            etNum.setText(String.valueOf(num));
                            if (onNumChangeListener != null) {
                                onNumChangeListener.onNumChange(AddAndSubTestView.this, num);
                            }

                        } else {
                            etNum.setText(String.valueOf(total));
                            if (onNumChangeListener != null) {
                                onNumChangeListener.onNumChange(AddAndSubTestView.this, total);
                            }
                            Toast.makeText(mContext, "请输入在正确会范围内的数字",
                                    Toast.LENGTH_SHORT).show();
                        }

                    }
                } else if (v.getTag().equals("-")) {
                    if (--num < 0)  //先减，再判断
                    {
                        num++;
                        Toast.makeText(mContext, "请输入一个大于0的数字",
                                Toast.LENGTH_SHORT).show();
                    } else {
                        if (num <= Integer.parseInt(tvTotal.getText().toString())) {
                            etNum.setText(String.valueOf(num));
                            if (onNumChangeListener != null) {
                                onNumChangeListener.onNumChange(AddAndSubTestView.this, num);
                            }
                        }
                    }
                }
            }
        }
    }


    /**
     * EditText输入变化事件监听器
     *
     * @author lyq
     */
    class OnTextChangeListener implements TextWatcher {

        @Override
        public void afterTextChanged(Editable s) {
            String numString = s.toString();
            if (numString == null || numString.equals("")) {
                num = 0;
                if (onNumChangeListener != null) {
                    onNumChangeListener.onNumChange(AddAndSubTestView.this, num);
                }
            } else {
                int numInt = Integer.parseInt(numString);
                if (numInt < 0) {
                    Toast.makeText(mContext, "请输入一个大于0的数字",
                            Toast.LENGTH_SHORT).show();
                } else if (numInt > total) {
                    etNum.setText(String.valueOf(0));
                    if (onNumChangeListener != null) {
                        onNumChangeListener.onNumChange(AddAndSubTestView.this, 0);
                    }
                    Toast.makeText(mContext, "请输入在正确会范围内的数字",
                            Toast.LENGTH_SHORT).show();
                } else {
                    //设置EditText光标位置 为文本末端
                    etNum.setSelection(etNum.getText().toString().length());
                    int len = etNum.getText().toString().length();
                    Log.d("OnTextChangeListener", "AddAndSubTestView" + numString);
                    if (len == 2 & numString.equals("00")) {
                        num = 0;
                        etNum.setText(String.valueOf(0));
                        if (onNumChangeListener != null) {
                            onNumChangeListener.onNumChange(AddAndSubTestView.this, num);
                        }
                        Toast.makeText(mContext, "请输入在正确会范围内的数字",
                                Toast.LENGTH_SHORT).show();
                        return;
                    } else {
                        num = numInt;
                        if (onNumChangeListener != null) {
                            onNumChangeListener.onNumChange(AddAndSubTestView.this, num);
                        }
                    }

                }
            }
        }

        @Override
        public void beforeTextChanged(CharSequence s, int start, int count,
                                      int after) {

        }

        @Override
        public void onTextChanged(CharSequence s, int start, int before,
                                  int count) {

        }

    }


    public interface OnNumChangeListener {
        /**
         * 输入框中的数值改变事件
         *
         * @param view 整个AddAndSubView
         * @param num  输入框的数值
         */
        void onNumChange(View view, int num);

    }

    /**
     * 设置EditText文本变化监听
     *
     * @param onNumChangeListener
     */
    public void setOnNumChangeListener(OnNumChangeListener onNumChangeListener) {
        this.onNumChangeListener = onNumChangeListener;
    }

    /**
     * 获取editText中的值
     *
     * @return
     */
    public int getNum() {
        if (etNum.getText().toString() != null && !etNum.getText().toString().equals("")) {
            return Integer.parseInt(etNum.getText().toString());
        } else {
            return 0;
        }
    }

    public void refresh(int total) {
        this.total = total;
        tvTotal.setText(String.valueOf(total));

        if (etNum.getText() != null && !etNum.getText().toString().equals("")) {
            if (total < Integer.parseInt(etNum.getText().toString())) {
                etNum.setText(0 + "");
            }
        }
    }
}
