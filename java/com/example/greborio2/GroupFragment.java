package com.example.greborio2;

import android.content.Intent;
import android.os.Bundle;
import android.support.annotation.NonNull;
import android.support.annotation.Nullable;
import android.support.v4.app.Fragment;
import android.support.v7.widget.GridLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.ImageButton;
import android.widget.LinearLayout;

import java.util.ArrayList;

public class GroupFragment extends Fragment {
    private GroupAdapter iAdapter;
    private RecyclerView rv;

    @Nullable
    @Override
    public View onCreateView(@NonNull LayoutInflater inflater, @Nullable final ViewGroup container, @Nullable Bundle savedInstanceState){
        View v = inflater.inflate(R.layout.fragment_group,container,false);
        rv = v.findViewById(R.id.group_rv);

        //create team button
        Button btn2 = v.findViewById(R.id.create_team);
        btn2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent myIn = new Intent(getContext(),CreateTeam.class);
                startActivity(myIn);
            }
        });

        ArrayList<GroupItem> itemList = new ArrayList<>();
        itemList.add(new GroupItem("Ονομα ","Προιον"));
        itemList.add(new GroupItem("Ονομα","Προιον"));
        itemList.add(new GroupItem("Ονομα ","Προιον"));
        itemList.add(new GroupItem("Ονομα","Προιον"));
        itemList.add(new GroupItem("Ονομα ","Προιον"));
        itemList.add(new GroupItem("Ονομα","Προιον"));
        itemList.add(new GroupItem("Ονομα ","Προιον"));
        itemList.add(new GroupItem("Ονομα","Προιον"));

        iAdapter = new GroupAdapter(getActivity(),itemList);

        //filter button
        ImageButton btn = v.findViewById(R.id.filterG);
        btn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent activity2Intent = new Intent(getContext(), filterActivity.class);
                startActivity(activity2Intent);
            }
        });



        rv.setLayoutManager(new GridLayoutManager(getContext(),2));
        rv.setAdapter(iAdapter);
        return v;
    }

}
