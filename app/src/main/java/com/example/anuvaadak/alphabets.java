package com.example.anuvaadak;

import android.app.Activity;
import android.os.Bundle;
import android.widget.GridView;

public class alphabets extends Activity {

    GridView gridview;
    public static String[] NameList = {
            "A",
            "B",
            "C",
            "D",
            "E",
            "F",
            "G",
            "H",
            "I",
            "J",
            "K",
            "L",
            "M",
            "N",
            "O",
            "P",
            "Q",
            "R",
            "S",
            "T",
            "U",
            "V",
            "W",
            "X",
            "Y",




    };
    public static int[] Images = {
            R.mipmap.a,
            R.mipmap.b,
            R.mipmap.c,
            R.mipmap.d,
            R.mipmap.e,
            R.mipmap.ff,
            R.mipmap.g,
            R.mipmap.h,
            R.mipmap.ii,
            R.mipmap.j,
            R.mipmap.k,
            R.mipmap.la,
            R.mipmap.m,
            R.mipmap.n,
            R.mipmap.o,
            R.mipmap.p,
            R.mipmap.q,
            R.mipmap.r,
            R.mipmap.s,
            R.mipmap.t,
            R.mipmap.u,
            R.mipmap.v,
            R.mipmap.w,
            R.mipmap.x,
            R.mipmap.y,





    };




    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.alpha_page);
        gridview = (GridView) findViewById(R.id.custom);
        gridview.setAdapter(new alphaAdapter(alphabets.this,NameList,Images));
    }


    }
