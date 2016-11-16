package com.example.android.myhooray;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        //TextView 1
        TextView txtViewOne = (TextView)findViewById(R.id.fairy_tale);
        txtViewOne.setOnClickListener(new View.OnClickListener() {
            @Override
                public void onClick(View view) {
                    Intent txtIntent = new Intent(MainActivity.this, Fairytale.class);
                    startActivity(txtIntent);
            }
        });

        //TextView 2
        TextView txtViewTwo = (TextView)findViewById(R.id.video);
        txtViewTwo.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent txtIntent = new Intent(MainActivity.this, Video.class);
                startActivity(txtIntent);
            }
        });

        //TextView 3
        TextView txtViewThree = (TextView)findViewById(R.id.teacher);
        txtViewThree.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent txtIntent = new Intent(MainActivity.this, Teacher.class);
                startActivity(txtIntent);
            }
        });

        //TextView 4
        TextView txtViewFour = (TextView)findViewById(R.id.my_class);
        txtViewFour.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent txtIntent = new Intent(MainActivity.this, myClass.class);
                startActivity(txtIntent);
            }
        });

    }
}
