package com.shatha.qamarlist;


import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.widget.ArrayAdapter;
import android.widget.ListAdapter;
import android.widget.ListView;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        String [] data1 ={"5-2-2017","5-2-2017","5-2-2017","4-2-2017","3-2-2017","3-2-2017","2-2-2017"};
        String [] action1 ={"Blocked","Allow","Blocked","Blocked","Blocked","Allow","Blocked"};
        String [] event1 ={"5-2-2017","5-2-2017","5-2-2017","4-2-2017","3-2-2017","3-2-2017","2-2-2017"};
        ListAdapter list1adapter= new ArrayAdapter<String>(this, android.R.layout.simple_list_item_1,data1);
        ListView list1 =(ListView)findViewById(R.id.qamarlistview) ;
        list1.setAdapter(list1adapter);





    }


}