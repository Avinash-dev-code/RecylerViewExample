package com.example.recylerviewtopic;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.GridLayoutManager;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.content.res.TypedArray;
import android.icu.lang.UCharacter;
import android.media.Image;
import android.os.Bundle;

public class MainActivity extends AppCompatActivity {
    int image[]={R.drawable.download,R.drawable.linus,R.drawable.images,R.drawable.elson,R.drawable.larry,R.drawable.download,R.drawable.linus,R.drawable.images,R.drawable.elson,R.drawable.larry};

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        RecyclerView Programminglist=(RecyclerView)findViewById(R.id.programminglist);

        Programminglist.setLayoutManager(new LinearLayoutManager(this));

        String lanaguages[]={"Sergey brin","Linus Torvalds","Sunder Pichaie","Larry Elson","Larry Page","Sergey brin","Linus Torvalds","Sunder Pichaie","Larry Elson","Larry Page"};

        Programminglist.setAdapter(new ProgrammingAdapter(lanaguages, image));






    }
}