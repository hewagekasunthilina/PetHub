package com.kasun.tasteit;

import androidx.annotation.NonNull;
import androidx.appcompat.app.AppCompatActivity;

import android.app.ProgressDialog;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

import com.google.firebase.database.DataSnapshot;
import com.google.firebase.database.DatabaseError;
import com.google.firebase.database.DatabaseReference;
import com.google.firebase.database.FirebaseDatabase;
import com.google.firebase.database.ValueEventListener;

public class insert_pet extends AppCompatActivity {

    EditText familyname, model, age, nickname, dob, breed,gender;
    Button addpet;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_insert_pet);

        setTitle("Add New Pet");

        familyname = (EditText) findViewById(R.id.familyname);
        model = (EditText) findViewById(R.id.model);
        age = (EditText) findViewById(R.id.age);
        nickname = (EditText) findViewById(R.id.nickname);
        dob = (EditText) findViewById(R.id.dob);
        breed = (EditText) findViewById(R.id.breed);
        gender = (EditText) findViewById(R.id.gender);

        addpet = (Button) findViewById(R.id.addpet);

        //Init Firebase
        final FirebaseDatabase database = FirebaseDatabase.getInstance();
        final DatabaseReference table_Pet = database.getReference("Pet");

        addpet.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                final ProgressDialog mDialog = new ProgressDialog(insert_pet.this);
                mDialog.setMessage("Please Waiting...");
                mDialog.show();

                table_Pet.addValueEventListener(new ValueEventListener() {
                    @Override
                    public void onDataChange(@NonNull DataSnapshot dataSnapshot) {

                        //Check if already user phone in the database
                        if(dataSnapshot.child(nickname.getText().toString()).exists())
                        {
                            mDialog.dismiss();
                            Toast.makeText(insert_pet.this, "Data Added Successfully!", Toast.LENGTH_SHORT).show();
                        }

                        else
                        {
                            mDialog.dismiss();
                            Pet pet = new Pet(familyname.getText().toString(),model.getText().toString(),age.getText().toString(),nickname.getText().toString(),dob.getText().toString(),breed.getText().toString(),gender.getText().toString());
                            table_Pet.child(nickname.getText().toString()).setValue(pet);

                            Toast.makeText(insert_pet.this, "Data Added Successfully!", Toast.LENGTH_SHORT).show();
                            finish();

                        }

                    }

                    @Override
                    public void onCancelled(@NonNull DatabaseError databaseError) {

                    }
                });
            }
        });

    }
}


