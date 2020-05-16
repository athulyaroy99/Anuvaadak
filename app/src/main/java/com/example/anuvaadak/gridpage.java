package com.example.anuvaadak;

import android.app.Activity;
import android.os.Bundle;
import android.widget.GridView;

public class gridpage extends Activity {

    GridView gridview;

    public static String[] osNameList = {
            "About",
            "Language",
            "Camera",
            "Message",

    };
    public static int[] osImages = {
            R.mipmap.about,
            R.mipmap.l,
            R.mipmap.camera,
            R.mipmap.message,
           };

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.grid_page);
        gridview = (GridView) findViewById(R.id.customgrid);
        gridview.setAdapter(new CustomAdapter(gridpage.this, osNameList, osImages));
    }

}

