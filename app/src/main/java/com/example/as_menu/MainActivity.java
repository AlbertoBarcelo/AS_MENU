package com.example.as_menu;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import androidx.appcompat.app.AppCompatActivity;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        // Botón para abrir la actividad Form
        Button btnForm = findViewById(R.id.btnForm);
        btnForm.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                startActivity(new Intent(MainActivity.this, Form.class));
            }
        });

        // Botón para abrir la actividad Linear Layout
        Button btnLinearLayout = findViewById(R.id.btnLinearLayout);
        btnLinearLayout.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                startActivity(new Intent(MainActivity.this, LinearLayout.class));
            }
        });

        // Botón para abrir la actividad Overlap
        Button btnOverlap = findViewById(R.id.btnOverlap);
        btnOverlap.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                startActivity(new Intent(MainActivity.this, Overlap.class));
            }
        });

        // Botón para abrir la actividad Radio Group
        Button btnRadioGroup = findViewById(R.id.btnRadioGroup);
        btnRadioGroup.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                startActivity(new Intent(MainActivity.this, RadioGroupp.class));
            }
        });

        // Botón para abrir la actividad Relative Layout
        Button btnRelativeLayout = findViewById(R.id.btnRelativeLayout);
        btnRelativeLayout.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                startActivity(new Intent(MainActivity.this, RelativeLayout.class));
            }
        });
    }
}
