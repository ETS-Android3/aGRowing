package com.example.greborio2;

import android.content.Context;
import android.support.annotation.NonNull;
import android.support.annotation.Nullable;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.view.View;
import android.view.LayoutInflater;
import android.widget.ImageButton;
import android.widget.ImageView;
import android.widget.TextView;
import java.util.ArrayList;
import java.util.List;


public class TrainersAdapter extends ArrayAdapter<Trainer> {
    private Context mContext;
    private List<Trainer> itemList = new ArrayList<>();




    public TrainersAdapter(@NonNull Context context,  ArrayList<Trainer> list){
        super(context,0,list);
        mContext=context;
        itemList=list;

    }

    @NonNull
    @Override
    public View getView(int position, @Nullable View convertView, @NonNull ViewGroup parent){
        View listitem = convertView;
        if(listitem==null){
            listitem =LayoutInflater.from(mContext).inflate(R.layout.listview_trainers,parent,false);

        }

        Trainer currentItem = itemList.get(position);

        ImageView image = (ImageView) listitem.findViewById(R.id.imageView_poster);
        image.setImageResource(currentItem.getImg());

        TextView name = (TextView) listitem.findViewById(R.id.textView);
        name.setText(currentItem.getName());

        TextView price = (TextView) listitem.findViewById(R.id.price);
        price.setText("Τιμη:" + (currentItem.getPrice()) + "$");

        TextView quanity = listitem.findViewById(R.id.quanity);
        quanity.setText("Τοποθεσια:" + currentItem.getLocation());

        TextView sp = listitem.findViewById(R.id.speciality);
        sp.setText("Ειδικοτητα:" + currentItem.getSpeciality());

        return  listitem;
    }
}

