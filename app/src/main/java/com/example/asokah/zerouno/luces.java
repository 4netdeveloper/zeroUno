package com.example.asokah.zerouno;

import android.content.Intent;
import android.os.Bundle;
import android.support.design.widget.FloatingActionButton;
import android.support.design.widget.Snackbar;
import android.view.View;
import android.support.design.widget.NavigationView;
import android.support.v4.view.GravityCompat;
import android.support.v4.widget.DrawerLayout;
import android.support.v7.app.ActionBarDrawerToggle;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.Toolbar;
import android.view.Menu;
import android.view.MenuItem;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.Toast;

import java.io.IOException;


public class luces extends AppCompatActivity
        implements NavigationView.OnNavigationItemSelectedListener {

    public Button btn_luz1;
    public Button btn_luz2;
    public Button btn_luz3;
    public Button btn_luz4;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_luces);
        Toolbar toolbar = (Toolbar) findViewById(R.id.toolbar);
        setSupportActionBar(toolbar);

        FloatingActionButton fab = (FloatingActionButton) findViewById(R.id.fab);
        fab.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Snackbar.make(view, "Replace with your own action", Snackbar.LENGTH_LONG)
                        .setAction("Action", null).show();
            }
        });

        DrawerLayout drawer = (DrawerLayout) findViewById(R.id.drawer_layout);
        ActionBarDrawerToggle toggle = new ActionBarDrawerToggle(
                this, drawer, toolbar, R.string.navigation_drawer_open, R.string.navigation_drawer_close);
        drawer.addDrawerListener(toggle);
        toggle.syncState();

        NavigationView navigationView = (NavigationView) findViewById(R.id.nav_view);
        navigationView.setNavigationItemSelectedListener(this);

        btn_luz1 = (Button) findViewById(R.id.luz1);
        btn_luz1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                try {
                    if (linkeador.ira("gp?c=1")){
                        //todo ok
                    }else{
                        notificacion();
                    }
                }catch (IOException e){
                    //fallo otra cosa
                }
            }
        });

        btn_luz2 = (Button) findViewById(R.id.luz2);
        btn_luz2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                try {
                    if (linkeador.ira("gp?c=2")){
                        //todo ok
                    }else{
                        notificacion();
                    }
                }catch (IOException e){
                    //fallo otra cosa
                }
            }
        });

        btn_luz3 = (Button) findViewById(R.id.luz3);
        btn_luz3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                try {
                    if (linkeador.ira("gp?c=3")){
                        //todo ok
                    }else{
                        notificacion();
                    }
                }catch (IOException e){
                    //fallo otra cosa
                }
            }
        });

        btn_luz4 = (Button) findViewById(R.id.luz4);
        btn_luz4.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                try {
                    if (linkeador.ira("gp?c=4")){
                        //todo ok
                    }else{
                        notificacion();
                    }
                }catch (IOException e){
                    //fallo otra cosa
                }
            }
        });
    }

    public void notificacion(){
        Toast.makeText(this, "La aplicación no está conectándose!", Toast.LENGTH_SHORT).show();
    }

    @Override
    public void onBackPressed() {
        DrawerLayout drawer = (DrawerLayout) findViewById(R.id.drawer_layout);
        if (drawer.isDrawerOpen(GravityCompat.START)) {
            drawer.closeDrawer(GravityCompat.START);
        } else {
            super.onBackPressed();
        }
    }

    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        // Inflate the menu; this adds items to the action bar if it is present.
        getMenuInflater().inflate(R.menu.luces, menu);
        return true;
    }

    @Override
    public boolean onOptionsItemSelected(MenuItem item) {
        // Handle action bar item clicks here. The action bar will
        // automatically handle clicks on the Home/Up button, so long
        // as you specify a parent activity in AndroidManifest.xml.
        int id = item.getItemId();

        //noinspection SimplifiableIfStatement
        if (id == R.id.action_settings) {
            return true;
        }

        return super.onOptionsItemSelected(item);
    }

    @SuppressWarnings("StatementWithEmptyBody")
    @Override
    public boolean onNavigationItemSelected(MenuItem item) {
        // Handle navigation view item clicks here.
        int id = item.getItemId();

        if (id == R.id.nav_televisor) {
            Intent intent = new Intent(luces.this, televisor.class);
            startActivity(intent);

        } else if (id == R.id.nav_luces) {


        } else if (id == R.id.nav_proyector) {

            Intent intent = new Intent(luces.this, proyector.class);
            startActivity(intent);

        } else if (id == R.id.nav_salir) {


            Toast.makeText(this, "App cerrada", Toast.LENGTH_SHORT).show();
            finish();
            Intent intent = new Intent(Intent.ACTION_MAIN);
            intent.addCategory(Intent.CATEGORY_HOME);
            intent.setFlags(Intent.FLAG_ACTIVITY_NEW_TASK);
            startActivity(intent);

        } else if (id == R.id.nav_share) {


        } else if (id == R.id.nav_send) {

        }

        DrawerLayout drawer = (DrawerLayout) findViewById(R.id.drawer_layout);
        drawer.closeDrawer(GravityCompat.START);
        return true;
    }
}
