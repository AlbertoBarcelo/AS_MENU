package com.example.as_menu;

import android.os.Bundle;
import android.view.Gravity;
import android.widget.CheckBox;
import android.widget.LinearLayout;
import android.widget.RadioGroup;
import android.widget.Toast;
import androidx.appcompat.app.AppCompatActivity;

public class RadioGroupp extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.radio_group); // Vincula el archivo XML

        // Referencias al RadioGroup para la orientación y la alineación
        RadioGroup orientationGroup = findViewById(R.id.orientationgroup);
        RadioGroup alignmentGroup = findViewById(R.id.alignmentgroup);

        // Referencia al Layout dinámico
        LinearLayout alignmentLayout = findViewById(R.id.alignmentgroup);

        // Referencia al CheckBox
        CheckBox checkBox = findViewById(R.id.checkbox);

        // Listener para cambiar la orientación
        orientationGroup.setOnCheckedChangeListener((group, checkedId) -> {
            if (checkedId == R.id.radiohorizontal) {
                alignmentLayout.setOrientation(LinearLayout.HORIZONTAL); // Cambia a horizontal
            } else if (checkedId == R.id.radiovertical) {
                alignmentLayout.setOrientation(LinearLayout.VERTICAL); // Cambia a vertical
            }
            alignmentLayout.requestLayout(); // Actualiza el diseño
        });

        // Listener para cambiar la alineación
        alignmentGroup.setOnCheckedChangeListener((group, checkedId) -> {
            if (checkedId == R.id.radioleft) {
                alignmentLayout.setGravity(Gravity.START); // Alinea a la izquierda
            } else if (checkedId == R.id.radiocenter) {
                alignmentLayout.setGravity(Gravity.CENTER); // Centra el contenido
            } else if (checkedId == R.id.radioright) {
                alignmentLayout.setGravity(Gravity.END); // Alinea a la derecha
            }
            alignmentLayout.requestLayout(); // Actualiza el diseño
        });

        // Listener para el CheckBox
        checkBox.setOnCheckedChangeListener((buttonView, isChecked) -> {
            if (isChecked) {
                Toast.makeText(this, "Checkbox is Checked", Toast.LENGTH_SHORT).show();
            } else {
                Toast.makeText(this, "Checkbox is Unchecked", Toast.LENGTH_SHORT).show();
            }
        });
    }
}
