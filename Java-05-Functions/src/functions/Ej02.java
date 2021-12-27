/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package functions;

import java.util.Scanner;

/**
 *
 * @author Brais
 */
public class Ej02 {

    public static Scanner teclado = new Scanner(System.in);

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        menu();
    }

    public static void menu() {
        int num = -1;
        while (num != 0) {
            System.out.println("------------Menú------------");
            System.out.println("-  1. Area del círculo     -");
            System.out.println("-  2. Area del cuadrado    -");
            System.out.println("-  3. Area del triangulo   -");
            System.out.println("-  0. Salir                -");
            System.out.println("----------------------------");
            num = teclado.nextInt();
            switch (num) {
                case 1:
                    System.out.println("Introduce el radio del círculo: ");
                    System.out.println("El area es: " + circulo(teclado.nextFloat()));
                    break;
                case 2:
                    System.out.println("Introduce el lado del cuadrado: ");
                    System.out.println("El area es: " + cuadrado(teclado.nextFloat()));
                    break;
                case 3:
                    System.out.println("Introduce la base y altura del triangulo: ");
                    System.out.println("El area es: " + triangulo(teclado.nextFloat(), teclado.nextFloat()));
                    break;
                case 0:
                    System.out.println("Saliendo...");
                    break;
                default:
                    System.out.println("Opcion no válida");
                    break;

            }
        }

    }

    public static double circulo(float radio) {
        double area;
        area = Math.PI * Math.pow(radio, 2);
        return area;
    }

    public static double cuadrado(float l) {
        double area;
        area = Math.pow(l, 2);
        return area;
    }

    public static double triangulo(float b, float h) {
        double area;
        area = b * h / 2;
        return area;
    }

}
