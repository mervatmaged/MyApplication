package com.example.myapplication;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;

import java.lang.reflect.Constructor;
import java.util.ArrayList;
import java.util.List;
public class ItemUser extends ArrayAdapter<User> {
    Context context;
    int resouce;
    public ItemUser(@NonNull Context context, int resource, @NonNull ArrayList<User> objects) {
        super(context, resource, objects);
        this.context = context;
        this.resouce = resource;
    }

    @NonNull
    @Override
    public View getView(int position, @Nullable View convertView, @NonNull ViewGroup parent) {
        convertView = LayoutInflater.from(context).inflate(resouce,parent,false);
        TextView tvname = convertView.findViewById(R.id.tvName);
        TextView tvPhone = convertView.findViewById(R.id.tvPhone);
        User currentUser = getItem(position);
        tvname.setText(currentUser.getFristName()+" "+currentUser.getLastName());
        tvPhone.setText(String.valueOf(currentUser.getPhone()));

        return convertView;
    }
}
