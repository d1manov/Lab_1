package com.example.lab_1;

import androidx.appcompat.app.AppCompatActivity;

import android.annotation.SuppressLint;
import android.opengl.Visibility;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {
    private Button button;
    private ImageView invision;
    private ImageView image;
    private TextView name;
    private TextView group;
    @SuppressLint("MissingInflatedId")
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        button = findViewById(R.id.button);
        name = findViewById(R.id.name);
        group = findViewById(R.id.group);
        invision = findViewById(R.id.invision);
        image = findViewById(R.id.image);
        button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if (name.getVisibility() == View.VISIBLE && group.getVisibility() == View.VISIBLE) {
                    name.setVisibility(View.INVISIBLE);
                    group.setVisibility(View.INVISIBLE);
                }
                else {
                    name.setVisibility(View.VISIBLE);
                    group.setVisibility(View.VISIBLE);
                }
            }
        });

        invision.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if (image.getVisibility() == View.VISIBLE) {
                    image.setVisibility(View.INVISIBLE);
                }
                else {
                    image.setVisibility(View.VISIBLE);
                }
            }
        });
    }
}