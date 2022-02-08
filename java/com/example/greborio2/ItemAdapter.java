package com.example.greborio2;
import android.content.Context;
import android.support.annotation.NonNull;
import android.support.annotation.Nullable;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.view.View;
import android.view.LayoutInflater;
import java.math.BigDecimal;

import android.widget.ImageButton;
import android.widget.ImageView;
import android.widget.TextView;

import java.util.ArrayList;
import java.util.List;


public class ItemAdapter extends ArrayAdapter<Item> {
    private Context mContext;
    private List<Item> itemList = new ArrayList<>();
    private int code;


    private static class ViewHandler{
        ImageButton clickButton;
    }

    public ItemAdapter(@NonNull Context context,  ArrayList<Item> list,int code){
        super(context,0,list);
        mContext=context;
        itemList=list;
        this.code=code;
    }

    @NonNull
    @Override
    public View getView(int position, @Nullable View convertView, @NonNull ViewGroup parent){
        final ViewHandler holder;
        View listitem = convertView;
        if(listitem==null){
            listitem =LayoutInflater.from(mContext).inflate(R.layout.activity_listview,parent,false);
            holder = new ViewHandler();
            if (code==0) {
                ImageButton im =  listitem.findViewById(R.id.buy);
                im.setVisibility(im.GONE);
            }else{
                ImageButton im = listitem.findViewById(R.id.buy);
            }
            listitem.setTag(holder);
        }

        Item currentItem = itemList.get(position);


        View test = listitem.findViewById(R.id.imageView_poster);
        test.setBackgroundResource(currentItem.getmImageDrawable());

        TextView name = (TextView) listitem.findViewById(R.id.textView);
        name.setText(currentItem.getName());

        if(code==0||code==2) {

            TextView price = (TextView) listitem.findViewById(R.id.price);
            price.setText("Τιμη:" + Double.toString(currentItem.getPrice()) + "$");

            TextView quanity = listitem.findViewById(R.id.quanity);
            quanity.setText("Ποσοτητα:" + Double.toString(currentItem.getQuanity()));

        }

        if(code==1){

            BigDecimal a = new BigDecimal(currentItem.getPrice());
            BigDecimal b = new BigDecimal(currentItem.getCartquanity());

            TextView price = (TextView) listitem.findViewById(R.id.price);
            price.setText("Κοστος:" + a.multiply(b) + "$");

            TextView quanity = listitem.findViewById(R.id.quanity);
            quanity.setText("Ποσοτητα:" +currentItem.getCartquanity());

        }



        return  listitem;
    }
}
