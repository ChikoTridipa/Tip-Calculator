package com.learn.tipcalculatorjava;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.Button;
import android.widget.EditText;
import android.widget.RadioGroup;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    private RadioGroup theServices;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        Button submitCalc;
        EditText totalHarga;
        TextView text;

        totalHarga = (EditText) findViewById(R.id.input001);
        totalHarga.getText().toString();

        int totalHargaInt = Integer.parseInt(totalHarga);

        theServices = findViewById(R.id.theServices);
        theServices.setOnCheckedChangeListener(new RadioGroup.OnCheckedChangeListener() {
            @Override
            public void onCheckedChanged(RadioGroup radioGroup, int i) {
                int totalDiskon;
                switch () {
                    case R.id.button_amazing:
                        totalDiskon = 20;
                        break;
                    case R.id.button_good:
                        totalDiskon = 18;
                        break;
                    case R.id.button_okay:
                        totalDiskon = 15;
                        break;
                }
            }
        });
    }
}