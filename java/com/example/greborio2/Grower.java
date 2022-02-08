 package com.example.greborio2;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.LinearLayout;
import android.widget.TextView;

import java.util.ArrayList;


 public class Grower extends AppCompatActivity {

     LinearLayout  linearLayout;
     ItemAdapter iAdapter;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_grower);
        linearLayout = findViewById(R.id.grower_profile);

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


        iAdapter = new ItemAdapter(this,itemList,0);
        TextView tx = findViewById(R.id.items_quantity);
        tx.setText(tx.getText()+" "+String.valueOf(itemList.size()) );

        for (int i=0;i<itemList.size();i++){

            View item = iAdapter.getView(i, null, null);
            linearLayout.addView(item);
            item.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View v) {
                    Intent activity2Intent = new Intent(Grower.this, Add_item_page.class);
                    startActivity(activity2Intent);
                }
            });
        }


    }
}
