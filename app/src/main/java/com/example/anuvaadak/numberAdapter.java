package com.example.anuvaadak;

import android.content.Context;
import android.content.Intent;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.AdapterView;
import android.widget.BaseAdapter;
import android.widget.ImageView;
import android.widget.TextView;


import static com.example.anuvaadak.number.Imag;
import static com.example.anuvaadak.number.Name;

public class numberAdapter extends BaseAdapter {

    String [] result;
    Context context;
    int[] imageId;
    private static LayoutInflater inflater = null;

    public numberAdapter(number number, String[] osNameList, int[] osImages) {
        // TODO Auto-generated constructor stub
        result=Name;
        context = number;
        imageId = Imag;
        inflater = (LayoutInflater) context.
                getSystemService(Context.LAYOUT_INFLATER_SERVICE);

    }

    @Override
    public int getCount() {
        // TODO Auto-generated method stub
        return result.length;
    }

    @Override
    public Object getItem(int position) {
        // TODO Auto-generated method stub
        return position;
    }

    @Override
    public long getItemId(int position) {
        // TODO Auto-generated method stub
        return position;
    }

    public class Holder {
        TextView os_text;
        ImageView os_img;
    }

    @Override
    public View getView(final int position, View convertView, ViewGroup parent) {
        // TODO Auto-generated method stub
        Holder holder = new Holder();
        View rowView;

        rowView = inflater.inflate(R.layout.number_gridlayout, null);
        //holder.os_text =(TextView) rowView.findViewById(R.id.os_texts);
        holder.os_img = (ImageView) rowView.findViewById(R.id.images2);

        //holder.os_text.setText(result[position]);
        holder.os_img.setImageResource(imageId[position]);

        /*rowView.setOnClickListener(new OnClickListener() {

            @Override
            public void onClick(View v) {
                // TODO Auto-generated method stub
                Toast.makeText(context, "You Clicked "+result[position], Toast.LENGTH_SHORT).show();
            }
        });*/
        final int finalI = position;
        /*rowView.setOnClickListener(new OnClickListener() {

            @Override

            public void onClick(View v) {
                if(finalI==0){
                    Intent intent = new Intent(context, about.class);
                    context.startActivity(intent);
                }
                else if(finalI==1){
                    Intent intent = new Intent(context, language.class);
                    context.startActivity(intent);
                }
                else if(finalI==2){
                    Intent intent = new Intent(context, camera.class);
                    context.startActivity(intent);
                }
                else if(finalI==3){
                    Intent intent = new Intent(context, mess.class);
                    context.startActivity(intent);
                }
            }

        });
        */
        return rowView;
    }

}
