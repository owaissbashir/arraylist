package com.example.android;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.util.TypedValue;
import android.widget.ArrayAdapter;
import android.widget.GridView;
import android.widget.LinearLayout;
import android.widget.ListView;
import android.widget.TextView;

import java.util.ArrayList;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        ArrayList<String> words= new ArrayList<String>();
        words.add("ali");
        words.add("ahmed");
        words.add("sohail");
        words.add("afnan");
        words.add("maryam");
        words.add("ali");
        words.add("ahmed");
        words.add("sohail");
        words.add("afnan");
        words.add("maryam");
        words.add("ali");
        words.add("ahmed");
        words.add("sohail");
        words.add("afnan");
        words.add("maryam");
        words.add("ali");
        words.add("ahmed");
        words.add("sohail");
        words.add("afnan");
        words.add("maryam");
        words.add("ali");
        words.add("ahmed");
        words.add("sohail");
        words.add("afnan");
        words.add("maryam");
        words.add("ali");
        words.add("ahmed");
        words.add("sohail");
        words.add("afnan");
        words.add("maryam");
        words.add("ali");
        words.add("ahmed");
        words.add("sohail");
        words.add("afnan");
        words.add("maryam");
        words.add("ali");
        words.add("ahmed");
        words.add("sohail");
        words.add("afnan");
        words.add("maryam");

//        LinearLayout rootview=findViewById(R.id.rootview);
//        TextView wordview1=new TextView(this);
//        wordview1.setText(words.get(0));
//        rootview.addView(wordview1);
//
//        TextView wordview2=new TextView(this);
//        wordview2.setText(words.get(1));
//        rootview.addView(wordview2);
//        int count=0;
//        while(count<40)
//        {
//            TextView wordview=new TextView(this);
//            wordview.setTextSize(TypedValue.COMPLEX_UNIT_SP,40);
//            wordview.setText(words.get(count));
//            rootview.addView(wordview);
//            count= count+1;
//        }
        ArrayAdapter<String> itemsAdapter= new ArrayAdapter<>(this, android.R.layout.simple_list_item_1,words);
        GridView listview=findViewById(R.id.list);
        listview.setAdapter(itemsAdapter);


    }
}