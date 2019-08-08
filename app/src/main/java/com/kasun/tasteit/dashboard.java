package com.kasun.tasteit;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageButton;
import android.widget.ImageView;
import android.widget.TextView;

public class dashboard extends AppCompatActivity {

    TextView txtbtn;
    TextView txtbtn2;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_dashboard);

        txtbtn = (TextView) findViewById(R.id.arr);
        txtbtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(dashboard.this, category_list.class);
                startActivity(intent);

            }
        });

        txtbtn2 = (TextView) findViewById(R.id.arr1);
        txtbtn2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent1 = new Intent(dashboard.this, add_pet.class);
                startActivity(intent1);
            }
        });
    }
}