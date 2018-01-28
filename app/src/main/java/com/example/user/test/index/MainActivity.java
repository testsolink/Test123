package com.example.user.test.index;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

import com.example.user.test.advance.AdvanceActivity;
import com.example.user.test.basic.BasicActivity;
import com.example.user.test.R;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        Button basic = (Button) findViewById(R.id.basic);
        Button advance = (Button) findViewById(R.id.advance);

        basic.setOnClickListener(new View.OnClickListener() {
            @Override
                public void onClick(View v) {
                Intent intent = new Intent(MainActivity.this,BasicActivity.class);
                startActivity(intent);
            }
        });
        advance.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(MainActivity.this,AdvanceActivity.class);
                startActivity(intent);
            }
        });
    }
}
