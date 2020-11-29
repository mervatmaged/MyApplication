package com.example.myapplication;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.ArrayAdapter;
import android.widget.ListView;

import java.util.ArrayList;

public class MainActivity extends AppCompatActivity {
        ListView listView;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        listView = findViewById(R.id.LV);
        ArrayList<User> values = new ArrayList<>();
        values.add(new User("user 1" , "last 1" , 000000));
        values.add(new User("user 2" , "last 2" , 022000));
        values.add(new User("user 3" , "last 3" , 333000));
        values.add(new User("user 4" , "last 4" , 555000));
        values.add(new User("user 5" , "last 5" , 444400));
        values.add(new User("user 6" , "last 6" , 077770));
        values.add(new User("user 7" , "last 7" , 066660));
        values.add(new User("user 8" , "last 8" , 044440));
        values.add(new User("user 9" , "last 9" , 006560));

        ItemUser itemUser = new ItemUser(this,R.layout.item_user,values);
        listView.setAdapter(itemUser);
    }
}