package com.example.listviewpractice;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.TextView;

import java.util.ArrayList;

/**
 * Created by 淳中 on 2017/5/1.
 */
public class ScoreArrayAdapter extends ArrayAdapter<ScoreItem> {
    Context context;
    public ScoreArrayAdapter(Context context, ArrayList<ScoreItem> items) {
        super(context, 0,items);
        this.context=context;
    }
    public View getView(int position,View convertView,ViewGroup parent)
    {
        LayoutInflater inflater = LayoutInflater.from(context);
        LinearLayout itemlayout = null;
        if(convertView == null) {
            itemlayout = (LinearLayout)inflater.inflate(R.layout.listitem, null);
        } else {
            itemlayout = (LinearLayout) convertView;
        }

        ScoreItem item = (ScoreItem)getItem(position);
        TextView tv_name = (TextView)itemlayout.findViewById(R.id.textView);
        tv_name.setText(item.teamOneName);
        TextView tv_score = (TextView)itemlayout.findViewById(R.id.textView2);
        tv_score.setText(String.valueOf(item.teamOneScroe));
        ImageView iv = (ImageView)itemlayout.findViewById(R.id.imageView);
        iv.setImageResource(item.teamOneImage);

        TextView tv_name2 = (TextView)itemlayout.findViewById(R.id.textView3);
        tv_name2.setText(item.teamTwoName);
        TextView tv_score2 = (TextView)itemlayout.findViewById(R.id.textView4);
        tv_score2.setText(String.valueOf(item.teamTwoScroe));
        ImageView iv2 = (ImageView)itemlayout.findViewById(R.id.imageView2);
        iv2.setImageResource(item.teamTwoImage);
        return itemlayout;

    }
}
