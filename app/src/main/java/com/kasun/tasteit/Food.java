package com.kasun.tasteit;

import androidx.appcompat.app.AppCompatActivity;


import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;



public class Food extends AppCompatActivity {

    Button btndogfood, btnaddpetfood;


    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_food);

        btndogfood = (Button)findViewById(R.id.btndogfood);
        btndogfood.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent dogfood;
                dogfood = new Intent(Food.this, Dogfood.class);
                startActivity(dogfood);

            }
        });
        btnaddpetfood = (Button)findViewById(R.id.btnaddpetfood);
        btnaddpetfood.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent addfood = new Intent(Food.this, Addpetfood.class);
                startActivity(addfood);

            }
        });

    }



}