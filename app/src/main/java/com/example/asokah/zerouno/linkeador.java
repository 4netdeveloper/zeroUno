package com.example.asokah.zerouno;

import android.util.Log;

import java.io.BufferedOutputStream;
import java.io.ByteArrayOutputStream;
import java.io.EOFException;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.net.HttpURLConnection;
import java.net.URL;

public class linkeador {

    private static String mRPiAddress = "no";

    public linkeador(){
        // constructor.. debe existir para no fallar la app..
    }

    public static void setmRpiAddress( String host ){
        mRPiAddress = host;
    }

    public static boolean ira (String url) throws IOException {


        if (!mRPiAddress.equals("no")){

            String mRPiPort = ":8080/";
            Log.d("linkeador", "ejecuto: url: "+ mRPiAddress + mRPiPort + url);

            HttpURLConnection urlConnection = null;

            try{
                //construir datos a enviar
                String urla = mRPiAddress + mRPiPort + url;
                URL urlb = new URL(mRPiAddress + mRPiPort + url);



                urlConnection = (HttpURLConnection) urlb.openConnection();

                //activar metodo post
                urlConnection.setDoOutput(true);
                urlConnection.setFixedLengthStreamingMode(urla.getBytes().length);
                urlConnection.setRequestProperty( mRPiAddress + mRPiPort,url);

                OutputStream out = new BufferedOutputStream(urlConnection.getOutputStream());

            }catch (EOFException e){
                urlConnection.disconnect();
                Log.d("linkeador", "ERROR al ejecutra la solicitud: " + mRPiAddress + mRPiPort + url);
                return false;
            }
            return true; // todo se ejecuto correctamente.
        }
        else{
            // no se ha descubierto el host de la raspberry.
            Log.d("linkeador","no esta el host o no ha sido descubierto aun");
            return false;
        }
    }

    private static String readStream(InputStream is) {
        // leyendo la respuesta de la raspberry.
        try {
            ByteArrayOutputStream bo = new ByteArrayOutputStream();
            int i = is.read();
            while (i != -1) { bo.write(i); i = is.read(); }
            return bo.toString();
        } catch (IOException e) {
            return "";
        }
    }

}
