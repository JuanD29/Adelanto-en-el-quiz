package edu.unal.poo.segundopunto.vista;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.FileInputStream;
import java.util.Scanner;
import javax.swing.JOptionPane;

public class Vista2 {

    public static void main(String[] args) {

        try {
            String linea1;
            String linea2;
            String linea3;
            char[] carlinea1;
            char[] carlinea2;
            char[] carlinea3;
            FileInputStream fis = new FileInputStream("Colección de videos.txt");
            InputStreamReader isr = new InputStreamReader(fis, "utf8");
            BufferedReader br = new BufferedReader(isr);

            while ((linea1 = br.readLine()) != null && ((linea2 = br.readLine()) != null && (linea3 = br.readLine()) != null)) {

                carlinea1 = linea1.toCharArray();
                carlinea2 = linea2.toCharArray();
                carlinea3 = linea3.toCharArray();
                mostrarInfoVideo(carlinea1, carlinea2, carlinea3);
            }

            fis.close();

        } catch (Exception e) {

        }
    }

    public static void mostrarInfoVideo(char[] carlinea1, char[] carlinea2, char[] carlinea3) {
        System.out.println("Digite opción");
        Scanner opcion = new Scanner(System.in);
        if (opcion.equals("1")) {
            System.out.println(carlinea1);
        }

        if (opcion.equals("2")) {
            System.out.println(carlinea2);
        }

        if (opcion.equals("3")) {
            System.out.println(carlinea3);
        }
    }
}
