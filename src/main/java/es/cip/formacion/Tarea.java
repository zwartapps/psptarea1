package es.cip.formacion;

import java.io.IOException;
import java.net.ConnectException;
import java.net.HttpURLConnection;
import java.net.MalformedURLException;
import java.net.URL;

public class Tarea {

    public void startTomcat() {
        System.out.println("Arrancamos Tomcat! \n");
        ProcessBuilder builder = new ProcessBuilder(
                "cmd.exe", "/c", "cd \"D:\\apache-tomcat-9.0.12\\bin\" && startup.bat");
        builder.redirectErrorStream(true);
        Process p = null;
        try {
            p = builder.start();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    public void stopTomcat() {
        System.out.println("Paramos Tomcat! \n");
        ProcessBuilder builder = new ProcessBuilder(
                "cmd.exe", "/c", "cd \"D:\\apache-tomcat-9.0.12\\bin\" && shutdown.bat");
        builder.redirectErrorStream(true);
        Process p = null;
        try {
            p = builder.start();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    public void statusTomcat() {
        HttpURLConnection.setFollowRedirects(true); // defaults to true
        String url = "http://localhost:8080";
        URL request_url = null;
        try {
            request_url = new URL(url);
        } catch (MalformedURLException e) {
            e.printStackTrace();
        }
        HttpURLConnection http_conn = null;
        try {
            http_conn = (HttpURLConnection) request_url.openConnection();
        } catch (ConnectException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        }
        http_conn.setConnectTimeout(100000);
        http_conn.setReadTimeout(100000);
        http_conn.setInstanceFollowRedirects(true);
        try {
            System.out.println(String.valueOf(http_conn.getResponseCode()));
            System.out.println("Si hay un numero de respuesta, tenemos conexion!");
        } catch (ConnectException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();

        }
    }
}
