package com.example.as_menu;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.Toast;
import androidx.appcompat.app.AppCompatActivity;

public class Overlap extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.overlap); // Asociar el XML llamado overlap.xml

        // Referencia al botón grande
        Button bigButton = findViewById(R.id.bigButton);
        bigButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Toast.makeText(Overlap.this, "Big Button Clicked!", Toast.LENGTH_SHORT).show();
            }
        });

        // Referencia al botón pequeño
        Button smallButton = findViewById(R.id.smallButton);
        smallButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Toast.makeText(Overlap.this, "Small Button Clicked!", Toast.LENGTH_SHORT).show();
            }
        });
    }
}
