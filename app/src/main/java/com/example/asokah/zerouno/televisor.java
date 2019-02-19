package com.example.asokah.zerouno;

import android.content.Intent;
import android.graphics.Paint;
import android.graphics.Typeface;
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
import android.widget.ImageButton;
import android.widget.ImageView;
import android.widget.TextView;
import android.widget.Toast;

import java.io.IOException;

public class televisor extends AppCompatActivity
        implements NavigationView.OnNavigationItemSelectedListener {

    public ImageView btn_input;
    public ImageView btn_onOff;
    public ImageView btn_mute;
    public ImageView btn_anterior;

    public Button btn_ch0;
    public Button btn_ch1;
    public Button btn_ch2;
    public Button btn_ch3;
    public Button btn_ch4;
    public Button btn_ch5;
    public Button btn_ch6;
    public Button btn_ch7;
    public Button btn_ch8;
    public Button btn_ch9;

    public ImageButton btn_volumeUp;
    public ImageButton btn_volumeDw;
    public ImageButton btn_canalUp;
    public ImageButton btn_canalDw;

    public ImageButton btn_flechaUp;
    public ImageButton btn_flechaDw;
    public ImageButton btn_flechaRight;
    public ImageButton btn_flechaLeft;
    public Button btn_botonOk;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_televisor);

        btn_input = findViewById(R.id.input_tv);
        btn_input.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                try {
                    if (linkeador.ira( "tv?c=1" ) ) {
                        // todo ok.
                    }else{
                        // falla no conecto.
                        notificacion();
                    }
                }catch (IOException e) {
                    // fallo otra cosa.
                }
            }
        });

        btn_onOff = findViewById(R.id.onOff_tv);
        btn_onOff.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                try{
                    if (linkeador.ira("tv?c=power")){
                        //todo ok.

                     }else {
                        //falla no contecto
                        notificacion();
                    }
                }catch(IOException e){
                    //fallo otra cosa
                }
            }
        });

        btn_mute = findViewById(R.id.mute);
        btn_mute.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                try{
                    if (linkeador.ira("tv?=mute")){
                        //todo ok

                }else{
                        //falla no contecto
                        notificacion();
                    }
                }catch (IOException e){

                }
            }
        });

        btn_anterior = findViewById(R.id.can_ant);
        btn_anterior.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                try{
                    if (linkeador.ira("tv?=")){
                    }else{
                        notificacion();
                    }
                }catch (IOException e) {

                }
            }
        });

        btn_ch0 = findViewById(R.id.canal0);
        btn_ch0.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                try{
                    if (linkeador.ira("tv?=0")){
                    }else{
                        notificacion();
                    }
                }catch (IOException e) {

                }
            }
        });

        btn_ch1 = findViewById(R.id.canal1);
        btn_ch1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                try{
                    if (linkeador.ira("tv?=1")){
                    }else{
                        notificacion();
                    }
                }catch (IOException e) {

                }
            }
        });

        btn_ch2 = findViewById(R.id.canal2);
        btn_ch2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                try{
                    if (linkeador.ira("tv?=2")){
                    }else{
                        notificacion();
                    }
                }catch (IOException e) {

                }
            }
        });

        btn_ch3 = findViewById(R.id.canal3);
        btn_ch3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                try{
                    if (linkeador.ira("tv?=3")){
                    }else{
                        notificacion();
                    }
                }catch (IOException e) {

                }
            }
        });

        btn_ch4 = findViewById(R.id.canal4);
        btn_ch4.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                try{
                    if (linkeador.ira("tv?=4")){
                    }else{
                        notificacion();
                    }
                }catch (IOException e) {

                }
            }
        });

        btn_ch5 = findViewById(R.id.canal5);
        btn_ch5.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                try{
                    if (linkeador.ira("tv?=5")){
                    }else{
                        notificacion();
                    }
                }catch (IOException e) {

                }
            }
        });

        btn_ch6 = findViewById(R.id.canal6);
        btn_ch6.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                try{
                    if (linkeador.ira("tv?=6")){
                    }else{
                        notificacion();
                    }
                }catch (IOException e) {

                }
            }
        });

        btn_ch7 = findViewById(R.id.canal7);
        btn_ch7.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                try{
                    if (linkeador.ira("tv?=7")){
                    }else{
                        notificacion();
                    }
                }catch (IOException e) {

                }
            }
        });

        btn_ch8 = findViewById(R.id.canal8);
        btn_ch8.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                try{
                    if (linkeador.ira("tv?=8")){
                    }else{
                        notificacion();
                    }
                }catch (IOException e) {

                }
            }
        });

        btn_ch9 = findViewById(R.id.canal9);
        btn_ch9.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                try{
                    if (linkeador.ira("tv?=9")){
                    }else{
                        notificacion();
                    }
                }catch (IOException e) {

                }
            }
        });

        btn_volumeUp = findViewById(R.id.volumeUp);
        btn_volumeUp.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                try{
                    if (linkeador.ira("tv?=volumeup")){
                    }else{
                        notificacion();
                    }
                }catch (IOException e) {

                }
            }
        });

        btn_volumeDw = findViewById(R.id.volumeDw);
        btn_volumeDw.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                try{
                    if (linkeador.ira("tv?=volumedown")){
                    }else{
                        notificacion();
                    }
                }catch (IOException e) {

                }
            }
        });

        btn_canalUp = findViewById(R.id.canalUp);
        btn_canalUp.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                try {
                    if (linkeador.ira("tv?=channelup")) {
                    } else {
                        notificacion();
                    }
                }catch (IOException e){

                }
            }
        });

        btn_canalDw = findViewById(R.id.canalDw);
        btn_canalDw.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                try {
                    if (linkeador.ira("tv?=channeldown")) {
                    } else {
                        notificacion();
                    }
                }catch (IOException e){

                }
            }
        });

        btn_flechaUp = findViewById(R.id.flechaUp);
        btn_flechaUp.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                try {
                    if (linkeador.ira("tv?=up")) {
                    } else {
                        notificacion();
                    }
                }catch (IOException e){

                }
            }
        });

        btn_flechaDw = findViewById(R.id.flechaDw);
        btn_flechaDw.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                try {
                    if (linkeador.ira("tv?=down")) {
                    } else {
                        notificacion();
                    }
                }catch (IOException e){

                }
            }
        });

        btn_flechaLeft = findViewById(R.id.flechaLeft);
        btn_flechaLeft.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                try {
                    if (linkeador.ira("tv?=left")) {
                    } else {
                        notificacion();
                    }
                }catch (IOException e){

                }
            }
        });

        btn_flechaRight= findViewById(R.id.flechaRight);
        btn_flechaRight.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                try {
                    if (linkeador.ira("tv?=right")) {
                    } else {
                        notificacion();
                    }
                }catch (IOException e){

                }
            }
        });

        btn_botonOk = findViewById(R.id.botonOk);
        btn_flechaLeft.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                try {
                    if (linkeador.ira("tv?=ok")) {
                    } else {
                        notificacion();
                    }
                }catch (IOException e){

                }
            }
        });


        Toolbar toolbar = (Toolbar) findViewById(R.id.toolbar);
        setSupportActionBar(toolbar);

        DrawerLayout drawer = (DrawerLayout) findViewById(R.id.drawer_layout);
        ActionBarDrawerToggle toggle = new ActionBarDrawerToggle(
                this, drawer, toolbar, R.string.navigation_drawer_open, R.string.navigation_drawer_close);
        drawer.addDrawerListener(toggle);
        toggle.syncState();

        NavigationView navigationView = (NavigationView) findViewById(R.id.nav_view);
        navigationView.setNavigationItemSelectedListener(this);

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
        getMenuInflater().inflate(R.menu.televisor, menu);
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
            // Handle the camera action


        } else if (id == R.id.nav_luces) {

            Intent intent = new Intent(televisor.this, luces.class);
            startActivity(intent);

        } else if (id == R.id.nav_proyector) {

            Intent intent = new Intent(televisor.this, proyector.class);
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
