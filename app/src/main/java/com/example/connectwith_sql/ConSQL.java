package com.example.connectwith_sql;

import android.annotation.SuppressLint;
import android.os.StrictMode;
import android.util.Log;

import java.sql.Connection;
import java.sql.DriverManager;

public class ConSQL {
    Connection con;
    @SuppressLint("NewApi")
    public Connection conclass(){
        String ip= "172.1.2.0", port="1433", db="mytestdp", username="sa", password="Jackson@9087";

        StrictMode.ThreadPolicy a = new StrictMode.ThreadPolicy.Builder().permitAll().build();
        StrictMode.setThreadPolicy(a);
        String ConnectURL= null;

        try
        {
            Class.forName("net.sourceforge.jtds.jdbc.Driver");
            ConnectURL ="jdbc:jtds:sqlserver://"+ip+":"+port+";"+"databasename="+db+";user="+username+";password="+password+";";
            con = DriverManager.getConnection(ConnectURL);
        } catch (Exception e){
            Log.e("Error is", e.getMessage());
        }
        return con;
    }
}
