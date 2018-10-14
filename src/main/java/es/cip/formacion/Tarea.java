package es.cip.formacion;

import java.io.IOException;
import java.net.ConnectException;
import java.net.HttpURLConnection;
import java.net.MalformedURLException;
import java.net.URL;

public class Tarea {

    public void startTomcat() {
        System.out.println("Arrancamos Tomcat! \n");
        /*Usamos Process builder para abrir una ventana de comando en Windows y ejecutamos las sentencias para
        arrancar Tomcat*/
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
        //Lo mismo para arrancar pero usando "shutdown" para parar el servicio
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

    /*Metodo para ver el estado: se intenta a conectar a la pagina por defecto del servidor, localhost:8080
    en caso de haber conexion se obtiene un codigo de respuesta 200 signfica que la conexion es correcta */
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
            System.out.println("Si el codigo de respuesta es 200, tenemos conexion!");
        } catch (ConnectException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();

        }
    }
}
