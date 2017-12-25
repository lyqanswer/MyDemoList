package mydemo.edu.com.myapplicationdemo.activity.recyclerView.adapter;

import android.content.Context;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;
import android.widget.Toast;

import java.util.ArrayList;

import mydemo.edu.com.myapplicationdemo.R;

public class MyRecyclerViewAdapter extends RecyclerView.Adapter<MyViewHolder> {

    private Context myContext = null;
    private ArrayList<String> textViewList = null;

    public MyRecyclerViewAdapter(Context context, ArrayList<String> list) {
        myContext = context;
        textViewList = list;
    }

    @Override
    public MyViewHolder onCreateViewHolder(ViewGroup parent, int viewType) {
        View view = LayoutInflater.from(parent.getContext()).inflate(R.layout.recyclerview_item_layout, parent, false);
        view.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Toast.makeText(myContext, ((TextView) v.findViewById(R.id.textView)).getText(), Toast.LENGTH_SHORT).show();
            }
        });
        MyViewHolder myViewHolder = new MyViewHolder(view);
        return myViewHolder;
    }

    @Override
    public void onBindViewHolder(MyViewHolder holder, int position) {
        holder.textView.setText(textViewList.get(position));
    }

    @Override
    public int getItemCount() {
        return textViewList.size();
    }
}

class MyViewHolder extends RecyclerView.ViewHolder {

    public TextView textView;

    public MyViewHolder(View itemView) {
        super(itemView);
        textView = (TextView) itemView.findViewById(R.id.textView);
    }
};
