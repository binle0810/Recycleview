package com.example.buoi6_recyclerv;

import android.view.View;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

public class MyviewHolder extends RecyclerView.ViewHolder {
    ImageView image;
    TextView txtTieude,txtTomtat;

    public MyviewHolder(@NonNull View itemView) {
        super(itemView);
        image=itemView.findViewById(R.id.imageView);
        txtTieude=itemView.findViewById(R.id.txtTiede);
        txtTomtat=itemView.findViewById(R.id.txtTomtat);
    }
}
