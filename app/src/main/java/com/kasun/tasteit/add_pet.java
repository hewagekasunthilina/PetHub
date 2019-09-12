package com.kasun.tasteit;

import androidx.appcompat.app.AppCompatActivity;

import android.annotation.SuppressLint;
import android.app.DatePickerDialog;
import android.graphics.Color;
import android.graphics.drawable.ColorDrawable;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.DatePicker;
import android.widget.EditText;

import com.google.android.material.textfield.TextInputLayout;
import com.rengwuxian.materialedittext.MaterialEditText;

import java.util.Calendar;

public class add_pet extends AppCompatActivity {

    EditText etDate;
    DatePickerDialog.OnDateSetListener setListner;

    TextInputLayout familyname, breed, model, gender, nickname, age;
    Button addpet;

    @SuppressLint("WrongViewCast")
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_add_pet);

        familyname = (TextInputLayout) findViewById(R.id.familyname);
        breed = (TextInputLayout) findViewById(R.id.breed);
        model = (TextInputLayout) findViewById(R.id.model);
        gender = (TextInputLayout) findViewById(R.id.gender);
        nickname = (TextInputLayout) findViewById(R.id.nickname);
        age = (TextInputLayout) findViewById(R.id.age);





















        etDate = findViewById(R.id.et_date);

        Calendar calendar = Calendar.getInstance();

        final int year = calendar.get(Calendar.YEAR);
        final int month = calendar.get(Calendar.MONTH);
        final int day = calendar.get(Calendar.DAY_OF_MONTH);

        etDate.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                DatePickerDialog datePickerDialog = new DatePickerDialog(add_pet.this, android.R.style.Theme_Holo_Light_Dialog_MinWidth,setListner,year,month,day);
                datePickerDialog.getWindow().setBackgroundDrawable(new ColorDrawable(Color.TRANSPARENT));
                datePickerDialog.show();
            }
        });

        setListner = new DatePickerDialog.OnDateSetListener() {
            @Override
            public void onDateSet(DatePicker view, int year, int month, int dayOfMonth) {
                month = month + 1;
                String date = day + "/" + month + "/" + year;
                etDate.setText(date);
            }
        };
    }
}
