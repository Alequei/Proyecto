package com.example.proyecto;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.v7.widget.CardView;
import android.view.View;

public class MainActivity extends AppCompatActivity implements View.OnClickListener {
    private CardView horarios,ruta,ubicaciones;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        horarios=(CardView) findViewById(R.id.horario);
        ruta=(CardView) findViewById(R.id.rutas);
        ubicaciones=(CardView) findViewById(R.id.ubicacion);
        //Add click listener to the cards
        horarios.setOnClickListener(this);
        ruta.setOnClickListener(this);
        ubicaciones.setOnClickListener(this);
    }

    @Override
    public void onClick(View v) {
        Intent i;
        switch (v.getId()) {
            case R.id.horario: i = new Intent(this,Horario.class);
            startActivity(i);
            break;
            case R.id.rutas: i = new Intent(this,Rutas.class);
                startActivity(i);
                break;
            case R.id.ubicacion: i = new Intent(this,Ubicacion.class);
                startActivity(i);
                break;
                default:break;
        }
    }
}
