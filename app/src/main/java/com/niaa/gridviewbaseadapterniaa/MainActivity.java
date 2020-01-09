package com.niaa.gridviewbaseadapterniaa;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.GridView;
import java.util.ArrayList;

public class MainActivity extends AppCompatActivity {

    GridView gvdatos;
    ArrayList<String> arreglo = new ArrayList<>();

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        gvdatos = findViewById(R.id.gvdatos);
        contenido contenidoobj = new contenido(arreglo,this);
        gvdatos.setAdapter(contenidoobj);

        arreglo.add("Jorge");
        arreglo.add("Pedro");
        arreglo.add("Jose");
        arreglo.add("Perla");
        arreglo.add("Daniela");
        arreglo.add("Gabriela");
        arreglo.add("Fernanda");
        arreglo.add("Carlos");
        arreglo.add("Mauricio");
        arreglo.add("Ricardo");
    }
}
