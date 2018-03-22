package com.example.thamkimdung.licycle;

import android.app.Activity;
import android.content.Intent;
import android.content.SharedPreferences;
import android.content.res.Resources;
import android.graphics.Bitmap;
import android.os.AsyncTask;
import android.provider.MediaStore;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;
import android.util.TypedValue;
import android.view.View;
import android.widget.Button;
import android.widget.CheckBox;
import android.widget.EditText;
import android.widget.GridView;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.TextView;
import android.widget.Toast;

import java.util.ArrayList;

public class MainActivity extends AppCompatActivity {
   ImageView imageView;
   TextView  textView;
   GridView gridView;
   CustomAdapter customAdapter;
   ArrayList<HinhAnh> hinhAnhArrayList = new ArrayList<>();
   LinearLayout item;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        gridView=findViewById(R.id.gridView);
        imageView=findViewById(R.id.imgView);
        item=findViewById(R.id.item);
        textView=findViewById(R.id.tvView);
        hinhAnhArrayList.add(new HinhAnh(R.drawable.a,"Hinh 1"));
        hinhAnhArrayList.add(new HinhAnh(R.drawable.b,"Hinh 2"));
        hinhAnhArrayList.add(new HinhAnh(R.drawable.e,"Hinh 5"));
        hinhAnhArrayList.add(new HinhAnh(R.drawable.f,"Hinh 6"));
        hinhAnhArrayList.add(new HinhAnh(R.drawable.g,"Hinh 7"));
        customAdapter = new CustomAdapter(this,R.id.gridView,hinhAnhArrayList);
        gridView.setAdapter(customAdapter);
        LinearLayout.LayoutParams lp = new LinearLayout.LayoutParams(60,60);
        item.setLayoutParams(lp);




    }
   }
