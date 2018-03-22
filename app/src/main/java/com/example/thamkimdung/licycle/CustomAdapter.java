package com.example.thamkimdung.licycle;

import android.app.Activity;
import android.content.Context;
import android.content.res.Resources;
import android.util.Log;
import android.util.TypedValue;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.GridView;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.TextView;

import java.util.ArrayList;

/**
 * Created by ThamKimDung on 3/20/2018.
 */

public class CustomAdapter extends BaseAdapter {
    Context context;
    private int layout;
    private ArrayList<HinhAnh> hinhAnhArrayList;

    public CustomAdapter(Context context, int layout, ArrayList<HinhAnh> hinhAnhArrayList) {
        this.context = context;
        this.layout = layout;
        this.hinhAnhArrayList = hinhAnhArrayList;
    }

    @Override
    public int getCount() {
        return hinhAnhArrayList.size();
    }

    @Override
    public Object getItem(int i) {
        return null;
    }

    @Override
    public long getItemId(int i) {
        return 0;
    }

    @Override
    public View getView(int i, View view, ViewGroup viewGroup) {
        LayoutInflater inflater= (LayoutInflater) context.getSystemService(Context.LAYOUT_INFLATER_SERVICE);
        view=inflater.inflate(R.layout.list_item,null);
//        LinearLayout.LayoutParams layoutParams = new LinearLayout.LayoutParams(LinearLayout.LayoutParams.MATCH_PARENT, LinearLayout.LayoutParams.MATCH_PARENT);
//        layoutParams.width=76;
//        layoutParams.height=87;
//        view.setLayoutParams(layoutParams);
//        view.setLayoutParams(new ViewGroup.LayoutParams(
//                ViewGroup.LayoutParams.MATCH_PARENT,
//                ViewGroup.LayoutParams.MATCH_PARENT));


        ImageView imageView=view.findViewById(R.id.imgView);
        TextView textView=view.findViewById(R.id.tvView);

        imageView.setImageResource(hinhAnhArrayList.get(i).getImgid());
        textView.setText(hinhAnhArrayList.get(i).getText());
        Log.e("TAG","TAG");
        return  view;

    }

}
