package com.example.androidbti.exemploaulafloatingandsnack;

import android.graphics.Color;
import android.support.design.widget.FloatingActionButton;
import android.support.design.widget.Snackbar;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        FloatingActionButton fab = findViewById(R.id.fab);
        fab.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                //Toast.makeText(MainActivity.this, "Clicou em FABiana", Toast.LENGTH_SHORT).show();
                //Snackbar.make(findViewById(R.id.coordinator), "clicou em Fabiana", Snackbar.LENGTH_SHORT).show();
                final Snackbar snackbar = Snackbar.make(findViewById(R.id.coordinator), "clicou em Fabiana", Snackbar.LENGTH_SHORT);
                snackbar.setAction("Fechar FABiana", new View.OnClickListener() {
                    @Override
                    public void onClick(View view) {
                        snackbar.dismiss();
                    }
                });
                snackbar.show();
            }
        });
    }
}
