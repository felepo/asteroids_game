package com.felepo.asteroids;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.v7.widget.Toolbar;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;

public class MainActivity extends AppCompatActivity
{
    private Toolbar toolbar;

    @Override
    protected void onCreate(Bundle savedInstanceState)
    {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        //Registrar el toolbar
        toolbar = (Toolbar) findViewById(R.id.tool_bar);
        //Activar el toolbar
        setSupportActionBar(toolbar);
    }

    //Método para iniciar una actividad diferente al MainActivity
    protected void ejecutarInfo( View view )
    {
        //Se crea una intención para decir que la nueva actividad se ejectuta desde
        //ActivityMain(this) hacía InfoActivity
        Intent i = new Intent(this, InfoActivity.class);
        startActivity(i);
    }

    //Método para salir de la aplcación
    public void salirApp(View view)
    {
        finish();
    }

    //Código para activar el menú XML
    @Override
    public boolean onCreateOptionsMenu(Menu miMenu)
    {
        getMenuInflater().inflate(R.menu.menu_activity, miMenu);

        return true;
    }

    //Establecer acciones al pulsar algún botón
    @Override
    public boolean onOptionsItemSelected(MenuItem opcion_menu)
    {
        int id = opcion_menu.getItemId();

        if( id == R.id.configuracion )
        {
            return true;
        }

        if( id == R.id.info )
        {
            ejecutarInfo(null);

            return true;
        }

        return super.onOptionsItemSelected(opcion_menu);
    }
}
