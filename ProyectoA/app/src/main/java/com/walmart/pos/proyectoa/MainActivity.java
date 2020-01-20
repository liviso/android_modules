package com.walmart.pos.proyectoa;

import android.os.Bundle;

import com.walmart.pos.libreria.Utilidades;

import androidx.appcompat.app.AppCompatActivity;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        Utilidades utilidades = new Utilidades();
    }
}
