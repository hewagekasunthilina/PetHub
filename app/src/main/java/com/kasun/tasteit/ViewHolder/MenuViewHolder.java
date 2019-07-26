package com.kasun.tasteit.ViewHolder;

import android.view.View;
import android.widget.ImageView;
import android.widget.TextView;

import android.support.v7.widget.RecyclerView;

    public class MenuViewHolder extends RecyclerView.ViewHolder implements View.OnClickListener{

        public TextView txtMenuName;
        public ImageView imageView;

        public MenuViewHolder(View itemView){
            super(itemView);

        }
        @Override
        public void onClick(View view){

        }
    }
