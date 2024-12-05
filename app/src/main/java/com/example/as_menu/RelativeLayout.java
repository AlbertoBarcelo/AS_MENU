package com.example.as_menu;

import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.widget.EditText;
import android.widget.Toast;

import androidx.appcompat.app.AppCompatActivity;

public class RelativeLayout extends AppCompatActivity {
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.relative_layout);

        EditText urlField = findViewById(R.id.entry);

        // Configurar botón "OK" para abrir el navegador
        findViewById(R.id.ok).setOnClickListener(v -> {
            String url = urlField.getText().toString();
            if (url.isEmpty()) {
                Toast.makeText(this, "Please enter a URL", Toast.LENGTH_SHORT).show();
            } else {
                // Añadir "http://" si no está incluido en la URL
                if (!url.startsWith("http://") && !url.startsWith("https://")) {
                    url = "http://" + url;
                }
                Intent intent = new Intent(Intent.ACTION_VIEW, Uri.parse(url));
                startActivity(intent);
            }
        });

        // Configurar botón "Cancel" para mostrar un mensaje
        findViewById(R.id.cancel).setOnClickListener(v ->
                Toast.makeText(this, "Cancelled", Toast.LENGTH_SHORT).show());
    }
}