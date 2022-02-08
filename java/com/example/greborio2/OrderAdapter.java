package com.example.greborio2;

import android.content.Context;
import android.support.annotation.NonNull;
import android.support.annotation.Nullable;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.TextView;
import java.util.ArrayList;
import java.util.List;

public class OrderAdapter extends ArrayAdapter<Order> {
    private Context mContext;
    private List<Order> itemList = new ArrayList<>();




    public OrderAdapter(@NonNull Context context, ArrayList<Order> list){
        super(context,0,list);
        mContext=context;
        itemList=list;

    }

    @NonNull
    @Override
    public View getView(int position, @Nullable View convertView, @NonNull ViewGroup parent){
        View listitem = convertView;
        if(listitem==null){
            listitem = LayoutInflater.from(mContext).inflate(R.layout.order_list,parent,false);

        }

        Order currentItem = itemList.get(position);



        TextView name = (TextView) listitem.findViewById(R.id.order_product);
        name.setText(currentItem.getProduct());

        TextView price = (TextView) listitem.findViewById(R.id.order_price);
        price.setText("Τιμη:" + (currentItem.getPrice()) + "$");

        TextView quanity = listitem.findViewById(R.id.order_quanity);
        quanity.setText("Ποσοτητα:" + currentItem.getQuanity());

        TextView date = listitem.findViewById(R.id.order_date);
        date.setText("Ημερομηνια:" + currentItem.getDate());

        TextView cond = listitem.findViewById(R.id.order_condition);
        cond.setText(currentItem.getCondition());

        TextView address = listitem.findViewById(R.id.order_location);
        address.setText(currentItem.getAddress());

        return  listitem;
    }
}
