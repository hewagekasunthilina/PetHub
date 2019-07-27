package com.kasun.tasteit.ViewHolder;

import android.view.View;
import android.widget.ImageView;
import android.widget.TextView;


import androidx.recyclerview.widget.RecyclerView;

import com.kasun.tasteit.Interface.ItemClickListner;
import com.kasun.tasteit.R;

public class MenuViewHolder extends RecyclerView.ViewHolder implements View.OnClickListener{

        public TextView txtMenuName;
        public ImageView imageView;

        private ItemClickListner itemClickListner;

        public MenuViewHolder(View itemView){
            super(itemView);

            txtMenuName = (TextView)itemView.findViewById(R.id.menu_name);
            imageView = (ImageView)itemView.findViewById(R.id.imageView);

            itemView.setOnClickListener(this);

        }

        public void setItemClickListner(ItemClickListner itemClickListner){
            this.itemClickListner = itemClickListner;
        }

        @Override
        public void onClick(View view){
            itemClickListner.onClick(view,getAdapterPosition(),false);
        }
    }
