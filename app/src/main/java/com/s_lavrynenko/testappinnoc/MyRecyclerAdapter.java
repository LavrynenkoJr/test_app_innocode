package com.s_lavrynenko.testappinnoc;

import android.content.Context;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import org.w3c.dom.Text;

import java.util.List;


public class MyRecyclerAdapter extends RecyclerView.Adapter<MyRecyclerAdapter.ViewHolder> {
    private List<Charge> itemCharge;
    private Context mContext;
    private Charge[] charges;

    public MyRecyclerAdapter(Charge[] charges) {
        this.charges = charges;
        this.itemCharge = itemCharge;
        //this.mContext = context;
    }




    public static class ViewHolder extends RecyclerView.ViewHolder {
        // each data item is just a string in this case
        public TextView mTextView;
        public TextView mTextView2;

        public ViewHolder(View itemLayoutView) {
            super(itemLayoutView);
            mTextView = (TextView) itemLayoutView.findViewById(R.id.textView);
            mTextView2 = (TextView) itemLayoutView.findViewById(R.id.textView2);
        }


    }


    @Override
    public ViewHolder onCreateViewHolder(ViewGroup parent, int viewType) {
        View v = LayoutInflater.from(parent.getContext())
                .inflate(R.layout.text_item, parent, false);

        return new ViewHolder(v);
    }

    @Override
    public void onBindViewHolder(ViewHolder holder, int position) {

        holder.mTextView.setText(charges[position].getName());
        holder.mTextView2.setText(charges[position].getPrice());
    }

    @Override
    public int getItemCount() {

        return charges.length;
    }


}
