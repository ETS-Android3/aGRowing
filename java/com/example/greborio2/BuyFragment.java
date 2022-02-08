package com.example.greborio2;



import android.content.Intent;
import android.graphics.Typeface;
import android.os.Bundle;
import android.support.annotation.NonNull;
import android.support.annotation.Nullable;
import android.support.v4.app.Fragment;
import android.support.v7.widget.DefaultItemAnimator;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageButton;
import android.widget.LinearLayout;
import android.widget.TextView;


import java.util.ArrayList;

public class BuyFragment extends Fragment {
            private LinearLayout linearLayout;
            private ItemAdapter iAdapter;
            private TrainersAdapter prAdapter;
            private RecyclerView adds;
            private RecyclerView personal_choices;
            private ArrayList<Add_Model> adds_models;
            private AddAdapter addAdapter;
            private RoundItemAdapter personal_choices_adapter;
            private RoundItemAdapter top_choices_adapter;
            private RecyclerView top_choices;

            @Nullable
            @Override
            public View onCreateView(@NonNull final LayoutInflater inflater, @Nullable final ViewGroup container, @Nullable Bundle savedInstanceState) {

                final View view =  inflater.inflate(R.layout.fragment_buy,container,false);
                linearLayout = view.findViewById(R.id.list_fragment);

                ImageButton btn = view.findViewById(R.id.filterB);
                btn.setOnClickListener(new View.OnClickListener() {
                    @Override
                    public void onClick(View v) {
                        Intent activity2Intent = new Intent(getContext(), filterActivity.class);
                        startActivity(activity2Intent);
                    }
                });


                //product list
                ArrayList<Item> itemList = new ArrayList<>();
                itemList.add(new Item("Γαλα",0.7,R.drawable.milk,3));
                itemList.add(new Item("Μηλα",0.4,R.drawable.fresh_apple_500x500,3));
                itemList.add(new Item("Λαδι",0.9,R.drawable.oil,7));
                itemList.add(new Item("Γαλα",0.7,R.drawable.milk,19));
                itemList.add(new Item("Μηλα",0.4,R.drawable.fresh_apple_500x500,14));
                itemList.add(new Item("Λαδι",0.9,R.drawable.oil,23));
                itemList.add(new Item("Γαλα",0.7,R.drawable.milk,8));
                itemList.add(new Item("Μηλα",0.4,R.drawable.fresh_apple_500x500,16));
                itemList.add(new Item("Λαδι",0.9,R.drawable.oil,12));

                //producer list
                ArrayList<Trainer> prList = new ArrayList<>();
                prList.add(new Trainer("Κωσταντινος ",400,R.drawable.man6,"Αρτα","Ρυζιου"));
                prList.add(new Trainer("Αντωνης",200,R.drawable.man6,"Αρτα","Ρυζιου"));
                prList.add(new Trainer("Γιαννης",500,R.drawable.man6,"Αρτα","Ρυζιου"));
                prList.add(new Trainer("Δημητρης",800,R.drawable.man6,"Αρτα","Ρυζιου"));
                prList.add(new Trainer("Κωσταντινος ",400,R.drawable.man6,"Αρτα","Ρυζιου"));
                prList.add(new Trainer("Αντωνης",200,R.drawable.man6,"Αρτα","Ρυζιου"));
                prList.add(new Trainer("Γιαννης",500,R.drawable.man6,"Αρτα","Ρυζιου"));
                prList.add(new Trainer("Δημητρης",800,R.drawable.man6,"Αρτα","Ρυζιου"));

                LinearLayout.LayoutParams params = new LinearLayout.LayoutParams(LinearLayout.LayoutParams.WRAP_CONTENT, LinearLayout.LayoutParams.WRAP_CONTENT);

                iAdapter = new ItemAdapter(getActivity(),itemList,0);
                prAdapter = new TrainersAdapter(getActivity(),prList);

                TextView tx4 = new TextView(getContext());
                tx4.setText("Διαθεσιμοι Παραγωγοι: 13");
                tx4.setTextSize(18);
                tx4.setTypeface(null, Typeface.BOLD);
                tx4.setPadding(5,5,5,5);
                tx4.setLayoutParams(params);
                linearLayout.addView(tx4);

                for(int i =0;i<prList.size();i++) {
                    View item = prAdapter.getView(i, null, null);
                    linearLayout.addView(item);
                    TextView tx = item.findViewById(R.id.speciality);
                    tx.setVisibility(View.GONE);
                    TextView tx2 = item.findViewById(R.id.price);
                    tx2.setVisibility(View.GONE);
                    item.setOnClickListener(new View.OnClickListener() {
                        @Override
                        public void onClick(View v) {
                            Intent activity2Intent = new Intent(getContext(), Grower.class);
                            startActivity(activity2Intent);
                        }
                    });
                }

                int images[] = {R.drawable.farmer,R.drawable.farmer_vector,R.drawable.farmer_vector,R.drawable.farmer_vector};

                adds = view.findViewById(R.id.ads);
                adds_models = new ArrayList<>();
                for(int i=0;i<images.length;i++){
                    Add_Model add = new Add_Model(images[i],"News Title","Context");
                    adds_models.add(add);
                }

                LinearLayoutManager layoutManager = new LinearLayoutManager(view.getContext(),LinearLayoutManager.HORIZONTAL,false);
                LinearLayoutManager layoutManager2 = new LinearLayoutManager(view.getContext(),LinearLayoutManager.HORIZONTAL,false);
                LinearLayoutManager layoutManager3 = new LinearLayoutManager(view.getContext(),LinearLayoutManager.HORIZONTAL,false);
                adds.setLayoutManager(layoutManager);
                adds.setItemAnimator(new DefaultItemAnimator());

                addAdapter = new AddAdapter(view.getContext(),adds_models);
                adds.setAdapter(addAdapter);

                personal_choices = view.findViewById(R.id.choices_for_you);
                personal_choices.setLayoutManager(layoutManager2);
                personal_choices.setItemAnimator(new DefaultItemAnimator());

                personal_choices_adapter = new RoundItemAdapter(view.getContext(),itemList);
                personal_choices.setAdapter(personal_choices_adapter);

                top_choices = view.findViewById(R.id.best_products);
                top_choices.setLayoutManager(layoutManager3);
                top_choices.setItemAnimator(new DefaultItemAnimator());

                top_choices_adapter = new RoundItemAdapter(view.getContext(),itemList);
                top_choices.setAdapter(top_choices_adapter);

                return view;
            }


}

