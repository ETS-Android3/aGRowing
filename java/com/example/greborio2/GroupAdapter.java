package com.example.greborio2;

import android.content.Context;
import android.support.annotation.NonNull;

import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import android.widget.TextView;

import java.util.ArrayList;


public class GroupAdapter extends RecyclerView.Adapter<GroupAdapter.MyViewHolder> {
    private Context mContext;
    private ArrayList<GroupItem> itemList = new ArrayList<>();

    public GroupAdapter(Context context, ArrayList<GroupItem> list){

        mContext=context;
        itemList=list;

    }
    @NonNull
    @Override
    public MyViewHolder onCreateViewHolder(@NonNull ViewGroup viewGroup, int i) {
        View view;
        LayoutInflater mInflater = LayoutInflater.from(mContext);
        view = mInflater.inflate(R.layout.group_item,viewGroup,false);

        return new MyViewHolder(view);
    }

    @Override
    public void onBindViewHolder(@NonNull GroupAdapter.MyViewHolder myViewHolder, int i) {
        myViewHolder.name.setText(itemList.get(i).getName());
        myViewHolder.img.setBackgroundResource(itemList.get(i).getImage());
        myViewHolder.type.setText(itemList.get(i).getType());
    }

    @Override
    public int getItemCount() {
        return itemList.size();
    }


    public static class MyViewHolder extends RecyclerView.ViewHolder{

        TextView name;
        View img;
        TextView type;


        public MyViewHolder(View view){
            super(view);

            name= view.findViewById(R.id.group_name);
            img=view.findViewById(R.id.group_logo);
            type=view.findViewById(R.id.group_type);
        }
    }
}
