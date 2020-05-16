package com.example.anuvaadak;

import android.app.Activity;
import android.os.Bundle;
import android.widget.GridView;

public class number extends Activity {

    GridView gridview;
    public static String[] Name = {
            "0",
            "1",
            "2",
            "3",
            "4",
            "5",
            "6",
            "7",
            "8",
            "9",



    };
    public static int[] Imag = {
            R.mipmap.op,
            R.mipmap.one,
            R.mipmap.two,
            R.mipmap.three,
            R.mipmap.four,
            R.mipmap.five,
            R.mipmap.six,
            R.mipmap.seven,
            R.mipmap.eight,
            R.mipmap.nine,





    };




    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.number_page);
        gridview = (GridView) findViewById(R.id.custom2);
        gridview.setAdapter(new numberAdapter(number.this,Name,Imag));
    }


}
