package es.cip.formacion;

import java.io.IOException;
import java.net.ConnectException;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Tarea tarea = new Tarea();
        int select;
        do {
            System.out.println("1\t Arrancar Tomcat");
            System.out.println("2\t Parar Tomcat");
            System.out.println("3\t Ver estado Tomcat");
            System.out.println("4\t Salir");
            System.out.println(" Por favor elige una opcion: ");
            Scanner scanner = new Scanner(System.in);
            select = scanner.nextInt();

            switch (select) {
                case 1:
                    tarea.startTomcat();
                    break;
                case 2:
                    tarea.stopTomcat();
                    break;
                case 3:
                    tarea.statusTomcat();
                    break;
                case 4:
                    System.exit(0);
                    break;
                default:
                    System.out.println("No es una entrada válida, por favor pulse del 1-4");
                    break;
            }
        } while (select != 4);
    }
}

