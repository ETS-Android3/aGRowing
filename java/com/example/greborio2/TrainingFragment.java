package com.example.greborio2;

import android.os.Bundle;
import android.support.annotation.NonNull;
import android.support.annotation.Nullable;
import android.support.v4.app.Fragment;
import android.support.v4.app.FragmentTransaction;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.Toast;

public class TrainingFragment extends Fragment  {
    @Nullable
    @Override
    public View onCreateView(@NonNull LayoutInflater inflater, @Nullable final ViewGroup container, @Nullable Bundle savedInstanceState) {
        View v = inflater.inflate(R.layout.fragment_training,container,false);

        Button bt = v.findViewById(R.id.become_trainer);

        bt.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View v){
                Toast toast = Toast.makeText(getContext(),"email sent with the details",Toast.LENGTH_SHORT);
                toast.show();
            }
        });

        Button bt2 = v.findViewById(R.id.find_trainer);
        final Fragment newFragment = new TrainersFragment();
        final FragmentTransaction transaction = getFragmentManager().beginTransaction();


        bt2.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View v){
                transaction.replace(R.id.fragment_container_P,newFragment);
                transaction.addToBackStack(null);
                transaction.commit();
            }
        });





        return v;
    }
}