package com.example.arjun27.androidui;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.ImageView;

import com.squareup.picasso.Picasso;

public class MainActivity extends AppCompatActivity {


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);


        ImageView imageView=(ImageView)findViewById(R.id.imageView2);

        Picasso.get().load(R.drawable.screenshot).into(imageView);

    }
}
