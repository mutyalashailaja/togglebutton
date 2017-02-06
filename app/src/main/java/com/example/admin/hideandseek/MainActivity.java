package com.example.admin.hideandseek;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageView;
import android.widget.ToggleButton;

public class MainActivity extends AppCompatActivity {

    ImageView tv;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        tv=(ImageView)findViewById(R.id.imageView);

        ToggleButton toggleButton = (ToggleButton) findViewById(R.id.toggleButton);
        toggleButton.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {
                if (((ToggleButton) v).isChecked())
                    tv.setVisibility(View.VISIBLE);
                else
                    tv.setVisibility(View.GONE);
            }


        });
    }
    }

