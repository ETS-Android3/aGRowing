package com.example.greborio2;

import android.os.Bundle;
import android.support.annotation.NonNull;
import android.support.annotation.Nullable;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.LinearLayout;
import android.widget.Spinner;

import java.util.ArrayList;

public class OrderFragment extends Fragment {

    LinearLayout linearLayout;
    OrderAdapter iAdapter;

    @Nullable
    @Override
    public View onCreateView(@NonNull LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {
        View view = inflater.inflate(R.layout.fragment_orders,container,false);
        linearLayout = view.findViewById(R.id.order_history);

        ArrayList<Order> itemList = new ArrayList<>();
        itemList.add(new Order("27/4/2020 ","Διεθυηνση...","Μηλα","27.5$","Σε εξελιξη","30.0 κιλα"));
        itemList.add(new Order("27/4/2020 ","Διεθυηνση...","Μηλα","27.5$","Σε εξελιξη","30.0 κιλα"));
        itemList.add(new Order("27/4/2020 ","Διεθυηνση...","Μηλα","27.5$","Σε εξελιξη","30.0 κιλα"));
        itemList.add(new Order("27/4/2020 ","Διεθυηνση...","Μηλα","27.5$","Σε εξελιξη","30.0 κιλα"));
        itemList.add(new Order("27/4/2020 ","Διεθυηνση...","Μηλα","27.5$","Σε εξελιξη","30.0 κιλα"));
        itemList.add(new Order("27/4/2020 ","Διεθυηνση...","Μηλα","27.5$","Σε εξελιξη","30.0 κιλα"));


        iAdapter = new OrderAdapter(getActivity(),itemList);

        for(int i=0;i<itemList.size();i++){
            View item = iAdapter.getView(i, null,null);
            linearLayout.addView(item);

        }



        Spinner spinner = view.findViewById(R.id.spinner_reorder);
        ArrayAdapter<CharSequence> adapter = ArrayAdapter.createFromResource(view.getContext(),R.array.order_by,android.R.layout.simple_spinner_item);
        adapter.setDropDownViewResource(android.R.layout.simple_spinner_dropdown_item);
        spinner.setAdapter(adapter);

        return view;
    }
}
