package com.shatha.qamarlist;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;

class CustomAdapter extends ArrayAdapter<String>{

   CustomAdapter(Context context,String[] date1)
   {
       super(context,R.layout.custom_row,date1);
   }


    @Override

    public View getview(int position, View converterView, ViewGroup parent)
    {
        LayoutInflater qamarinflater =LayoutInflater.from(getContext());
         View customview=qamarinflater.inflate(R.layout.custom_row,parent,false);
    }

}
