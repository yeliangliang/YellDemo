package com.yell.supportdesignmodel.base;

import android.support.design.widget.TextInputEditText;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import com.yell.supportdesignmodel.R;

public class ModelRecyclerAdapter extends
        RecyclerView.Adapter<ModelRecyclerAdapter.ViewHolder> {


    @Override
    public ViewHolder onCreateViewHolder(ViewGroup parentViewGroup, int i) {
        View item = LayoutInflater.from(parentViewGroup.getContext()).inflate(
                R.layout.adapter_recyclerview, parentViewGroup, false);
        item.setLayoutParams(new RecyclerView.LayoutParams(ViewGroup.LayoutParams.MATCH_PARENT,
                ViewGroup.LayoutParams.WRAP_CONTENT));
        return new ViewHolder(item);

    }

    @Override
    public void onBindViewHolder(ViewHolder viewHolder, final int position) {
        //在这里动态的设置hint，TextInputLayout会不起作用
//        viewHolder.edt.setHint("TextInputEditText  "+position);
    }

    @Override
    public int getItemCount() {
        return 60;
    }


    public class ViewHolder extends RecyclerView.ViewHolder {

        private final TextInputEditText edt;

        public ViewHolder(View itemView) {
            super(itemView);
            edt = (TextInputEditText) itemView
                    .findViewById(R.id.edit);
        }
    }

}