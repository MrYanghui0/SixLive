package com.example.dell.sixlive.Adater;

import android.content.Context;
import android.support.v7.widget.RecyclerView;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import com.example.dell.sixlive.Bean.LoadurlBean;
import com.example.dell.sixlive.R;
import com.facebook.drawee.view.SimpleDraweeView;

import java.util.List;

public class BriefintroductionAdater extends RecyclerView.Adapter<BriefintroductionAdater.Holder> {
    private List<LoadurlBean.RetBean.ListBean> list;
    private Context context;

    public BriefintroductionAdater(List<LoadurlBean.RetBean.ListBean> list, Context context) {
        this.list = list;
        this.context = context;
    }


    @Override
    public Holder onCreateViewHolder(ViewGroup parent, int viewType) {
        View view = View.inflate(context, R.layout.briefintroductioon_item1, null);
        Holder holder = new Holder(view);
        return holder;
    }

    @Override
    public void onBindViewHolder(Holder holder, int position) {
        String pic = list.get(0).getChildList().get(position).getPic();
        String title = list.get(0).getChildList().get(position).getTitle();
        holder.im.setImageURI(pic);
        holder.tv.setText(title);
    }

    @Override
    public int getItemCount() {
        return 6;
    }

    class Holder extends RecyclerView.ViewHolder {

        private final SimpleDraweeView im;
        private final TextView tv;

        public Holder(View itemView) {
            super(itemView);
            im = itemView.findViewById(R.id.mar_im);
            tv = itemView.findViewById(R.id.mar_tv);
        }
    }
}
