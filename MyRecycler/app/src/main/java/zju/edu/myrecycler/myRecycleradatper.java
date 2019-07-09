package zju.edu.myrecycler;

import android.content.Context;
import android.graphics.Color;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

import java.util.List;

/**
 * Created by user on 2017-07-26.
 */
public class myRecycleradatper extends RecyclerView.Adapter<myRecycleradatper.MyViewHolder> {
    private List<filelist> mDatas;

    public myRecycleradatper(Context context, List<filelist> datas){
        this. mDatas=datas;
    }

    @Override
    public int getItemCount() {
        return mDatas.size();
    }
    @Override
    public MyViewHolder onCreateViewHolder(ViewGroup parent, int viewType) {
        View view = LayoutInflater.from(parent.getContext()).inflate(R.layout.item_view, parent, false);
        MyViewHolder holder= new MyViewHolder(view);
        return holder;
    }

    @Override
    public void onBindViewHolder(MyViewHolder holder, final int position) {
        filelist da=mDatas.get(position);
        holder.tv.setText(da.getName());
        holder.msg.setText(da.getZt());
        holder.iv.setImageResource(da.getPicID());
        holder.th.setText(da.getHot());
    }

    class MyViewHolder extends RecyclerView.ViewHolder {
        TextView tv;
        TextView msg;
        ImageView iv;
        TextView th;
        View v;
        public MyViewHolder(View view) {
            super(view);
            tv=(TextView) view.findViewById(R.id.txt_xs);
            msg=(TextView)view.findViewById(R.id.txt_msg);
            iv=(ImageView) view.findViewById(R.id.txt_iv);
            th=(TextView) view.findViewById(R.id.txt_hot);
            v=view;
        }
    }
}