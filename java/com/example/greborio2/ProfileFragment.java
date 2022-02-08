package com.example.greborio2;

import android.os.Bundle;
import android.support.annotation.NonNull;
import android.support.annotation.Nullable;
import android.support.v4.app.Fragment;
import android.support.v4.content.res.ResourcesCompat;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.Toast;

public class ProfileFragment extends Fragment {

    @Nullable
    @Override
    public View onCreateView(@NonNull LayoutInflater inflater, @Nullable final ViewGroup container, @Nullable Bundle savedInstanceState) {
        View v = inflater.inflate(R.layout.fragment_profile,container,false);
        ImageView im = (ImageView)v.findViewById(R.id.imageView);
        Button bt = v.findViewById(R.id.pw_change);

        bt.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View v){
                Toast toast = Toast.makeText(getContext(),"email sent",Toast.LENGTH_SHORT);
                toast.show();
            }
        });

        im.setImageDrawable(ResourcesCompat.getDrawable(getResources(),R.drawable.ic_person_outline_black_24dp,null));
        return v;
    }
}
