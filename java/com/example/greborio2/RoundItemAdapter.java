package com.example.greborio2;

import android.content.Context;
import android.support.annotation.NonNull;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

import java.util.ArrayList;

public class RoundItemAdapter extends RecyclerView.Adapter<RoundItemAdapter.ViewHolder>{
    ArrayList<Item> add_models;
    Context context;

    public RoundItemAdapter(Context context,ArrayList<Item> add_models){
        this.add_models=add_models;
        this.context=context;
    }
    @NonNull
    @Override
    public RoundItemAdapter.ViewHolder onCreateViewHolder(@NonNull ViewGroup viewGroup, int i) {
        View view = LayoutInflater.from(viewGroup.getContext()).inflate(R.layout.product_card,viewGroup,false);
        return new ViewHolder(view);
    }

    @Override
        public void onBindViewHolder(@NonNull RoundItemAdapter.ViewHolder viewHolder, int i) {
            viewHolder.imageView.setImageResource(add_models.get(i).getmImageDrawable() );
            viewHolder.textView.setText(add_models.get(i).getName());
        }

        @Override
        public int getItemCount() {return add_models.size();}

        public class ViewHolder extends RecyclerView.ViewHolder{
            ImageView imageView;
            TextView textView;


            public ViewHolder(@NonNull View itemView) {
                super(itemView);
                imageView = itemView.findViewById(R.id.product_image);
                textView = itemView.findViewById(R.id.product_title);
            }
    }

}

