package com.example.user.test.basic;

import android.app.ListActivity;
import android.app.TabActivity;
import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

import com.example.user.test.R;
import com.example.user.test.about_view.AboutViewActivity;
import com.example.user.test.grid_view.GridViewActivity;
import com.example.user.test.tab_view.TabVIewActivity;

import java.io.LineNumberReader;

public class BasicActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_basic);

        Button grid = (Button) findViewById(R.id.grid);
        Button list = (Button) findViewById(R.id.list);
        Button tab = (Button) findViewById(R.id.tab);
        final Button about = (Button) findViewById(R.id.about);

        grid.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(BasicActivity.this, GridViewActivity.class);
                startActivity(intent);
            }
        });
        list.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(BasicActivity.this, ListActivity.class);
                startActivity(intent);
            }
        });
        tab.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(BasicActivity.this,TabVIewActivity.class);
                startActivity(intent);
            }
        });
        about.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(BasicActivity.this,AboutViewActivity.class);
                startActivity(intent);
            }
        });
    }
}
