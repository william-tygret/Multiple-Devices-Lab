package com.example.williamtygret.multdevice;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.ArrayAdapter;
import android.widget.ListView;

import java.util.ArrayList;

public class MainActivity extends AppCompatActivity {

    ListView mListView;
    ArrayList<String> mArrayList;
    ArrayAdapter<String> mArrayAdapter;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.bonus);

//        mListView = (ListView)findViewById(R.id.listView2);
//
//
//        mArrayList = new ArrayList<String>();
//        mArrayList.add("one");
//        mArrayList.add("two");
//        mArrayList.add("three");
//
//        mArrayAdapter = new ArrayAdapter<String>(MainActivity.this,android.R.layout.simple_list_item_1,mArrayList);
//        mListView.setAdapter(mArrayAdapter);

    }
}
