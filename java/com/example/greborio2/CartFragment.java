package com.example.greborio2;

import android.os.Bundle;
import android.support.annotation.NonNull;
import android.support.annotation.Nullable;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ListView;
import android.widget.TextView;

import java.util.ArrayList;

public class CartFragment extends Fragment{
        private ListView listview;
        private ItemAdapter iAdapter;

        @Nullable
        @Override
        public View onCreateView(@NonNull LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {
            View view =  inflater.inflate(R.layout.fragment_cart,container,false);
            listview = (ListView) view.findViewById(R.id.cart_view);

            ArrayList<Item> itemList = new ArrayList<>();
            itemList.add(new Item("Μηλα",0.80,R.drawable.fresh_apple_500x500,14,12));
            itemList.add(new Item("Λαδι",  0.90,R.drawable.oil,25,15));


            iAdapter = new ItemAdapter(getActivity(),itemList,1);
            listview.setAdapter(iAdapter);

            double total=0;
            for(int i = 0; i < itemList.size();i++){
                total=total+itemList.get(i).getPrice()*itemList.get(i).getCartquanity();
            }

            TextView total_cost= view.findViewById(R.id.Total_Cost);
            total_cost.setText("Συνολικο κοστος:"+total+"$");


            return view;
        }


}

