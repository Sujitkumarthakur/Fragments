package com.example.fragments;

import androidx.appcompat.app.AppCompatActivity;
import androidx.fragment.app.FragmentTransaction;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.LinearLayout;

import com.example.fragments.Fragments1.FirstFragment;
import com.example.fragments.Fragments1.SecondFragment;

public class MainActivity extends AppCompatActivity {
    Button butt1;
    Button butt2;
    LinearLayout linearlayout;
    @Override

    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        butt1=findViewById(R.id.button1);
        butt2=findViewById(R.id.button2);
        linearlayout=findViewById(R.id.linearlayout);

        butt1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                FirstFragment FirstFragment= new FirstFragment();
                FragmentTransaction transaction=getSupportFragmentManager().beginTransaction();
                transaction.replace(R.id.linearlayout,FirstFragment);
                transaction.commit();
            }
        });

        butt2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                SecondFragment SecondFragment= new SecondFragment();
                FragmentTransaction transaction=getSupportFragmentManager().beginTransaction();
                transaction.replace(R.id.linearlayout,SecondFragment);
                transaction.commit();
            }
        });

    }
}