package com.example.greborio2;



import android.graphics.Typeface;
import android.os.Bundle;
import android.support.annotation.NonNull;
import android.support.annotation.Nullable;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.LinearLayout;
import android.widget.ListView;
import android.widget.TextView;


import java.util.ArrayList;

public class TrainersFragment extends Fragment {

    private TrainersAdapter iAdapter;
    private LinearLayout linearLayout;

    @Nullable
    @Override
    public View onCreateView(@NonNull LayoutInflater inflater, @Nullable final ViewGroup container, @Nullable Bundle savedInstanceState) {

        View view =  inflater.inflate(R.layout.fragment_trainers,container,false);
        linearLayout = view.findViewById(R.id.trainers);

        ArrayList<Trainer> itemList = new ArrayList<>();
        itemList.add(new Trainer("Κωσταντινος ",400,R.drawable.man6,"Αρτα","Ρυζιου"));
        itemList.add(new Trainer("Αντωνης",200,R.drawable.man6,"Αττικη","Ρυζιου"));
        itemList.add(new Trainer("Γιαννης",500,R.drawable.man6,"Ξανθη","Ρυζιου"));
        itemList.add(new Trainer("Δημητρης",800,R.drawable.man6,"Πρεβεζα","Ρυζιου"));
        itemList.add(new Trainer("Κωσταντινος ",400,R.drawable.man6,"Πατρα","Ρυζιου"));
        itemList.add(new Trainer("Αντωνης",200,R.drawable.man6,"Βολος","Ρυζιου"));
        itemList.add(new Trainer("Γιαννης",500,R.drawable.man6,"Τρικαλα","Ρυζιου"));
        itemList.add(new Trainer("Δημητρης",800,R.drawable.man6,"Ναυπλιο","Ρυζιου"));


        iAdapter = new TrainersAdapter(getActivity(),itemList);

        LinearLayout.LayoutParams params = new LinearLayout.LayoutParams(LinearLayout.LayoutParams.WRAP_CONTENT, LinearLayout.LayoutParams.WRAP_CONTENT);
        TextView tx4 = new TextView(getContext());
        tx4.setText("Εκπαιδευτες: 13");
        tx4.setTextSize(18);
        tx4.setTypeface(null, Typeface.BOLD);
        tx4.setPadding(5,5,5,5);
        tx4.setLayoutParams(params);
        linearLayout.addView(tx4);

        for(int i=0;i<itemList.size();i++){
            View item = iAdapter.getView(i, null,null);
            linearLayout.addView(item);

        }





        return view;
    }


}