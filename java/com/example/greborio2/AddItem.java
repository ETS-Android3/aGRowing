package com.example.greborio2;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.LinearLayout;
import android.widget.ListView;
import android.widget.Toast;

import java.util.ArrayList;

public class AddItem extends AppCompatActivity {
    private LinearLayout linearLayout;
    private ItemAdapter iAdapter;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_add_item);

        linearLayout = (LinearLayout) findViewById(R.id.add_item_list);


        final ArrayList<Item> itemList = new ArrayList<>();
        itemList.add(new Item("Γαλα",0.7,R.drawable.milk,3));
        itemList.add(new Item("Μηλα",0.4,R.drawable.fresh_apple_500x500,3));
        itemList.add(new Item("Μηλα",0.4,R.drawable.fresh_apple_500x500,3));

        iAdapter = new ItemAdapter(this,itemList,2);
        int j = 0;
        for(int i =0;i<itemList.size();i++) {
            View item = iAdapter.getView(i, null, null);
            linearLayout.addView(item);

            item.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View v) {
                    Intent activity2Intent = new Intent(AddItem.this, EditItem.class);
                    activity2Intent.putExtra("Product_Name","kdkd");
                    startActivity(activity2Intent);
                }
            });
        }

    }

    public void Delete(View view) {

    }
}
