package com.kasun.tasteit.ViewHolder;

import android.view.View;
import android.widget.ImageView;
import android.widget.TextView;


import androidx.recyclerview.widget.RecyclerView;

import com.kasun.tasteit.R;

public class MenuViewHolder extends RecyclerView.ViewHolder implements View.OnClickListener{

        public TextView txtMenuName;
        public ImageView imageView;

        public MenuViewHolder(View itemView){
            super(itemView);

            txtMenuName = (TextView)itemView.findViewById(R.id.txtFullName);

        }
        @Override
        public void onClick(View view){

        }
    }
