package com.felepo.asteroids;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    //Método para iniciar una actividad diferente al MainActivity
    protected void ejectutarInfo( View view )
    {
        //Se crea una intención para decir que la nueva actividad se ejectuta desde
        //ActivityMain(this) hacía InfoActivity
        Intent i = new Intent(this, InfoActivity.class);
        startActivity(i);
    }
}
