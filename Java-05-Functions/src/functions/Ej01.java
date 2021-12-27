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
public class Ej01 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);
        double num1, num2, num3;
        long x, y;

        //Parte 1
        System.out.println("introduce un número:");

        if (par(Integer.parseInt(teclado.nextLine()))) {
            System.out.println("Tu número es par");
        } else {
            System.out.println("Tu número es impar");
        }

        //Parte 2
        System.out.println("Introduce 3 numeros con decimales:");
        num1 = Double.parseDouble(teclado.nextLine());
        num2 = Double.parseDouble(teclado.nextLine());
        num3 = Double.parseDouble(teclado.nextLine());

        if (mayor(num1, num2, num3) != 0) {
            System.out.println("Mayor es " + mayor(num1, num2, num3));
        }

        //Parte 3
        System.out.println("Introduce 2 numeros long: ");
        x = Long.parseLong(teclado.nextLine());
        y = Long.parseLong(teclado.nextLine());

        System.out.println("El total de la suma de los numeros entre " + x + " y "
                + y + " es " + sumaIntervalo(x, y));

        //Parte 4
        System.out.println("Introduce una cadena y te digo cuantos 0 tiene: ");

        System.out.println("Tiene " + contarCeros(teclado.nextLine()));

        //Parte 5
        System.out.println("Introduce 2 numeros para generar "
                + "uno aleatorio entre ellos");
        System.out.println(aleatorio(Integer.parseInt(teclado.nextLine()), Integer.parseInt(teclado.nextLine())));
    }

    //1
    public static boolean par(int x) {
        return x % 2 == 0;
    }

    //2
    public static double mayor(double x, double y, double z) {
        if (x > y) {
            if (x > z) {
                return x;
            } else {
                return z;
            }
        } else if (y > z) {
            return y;
        } else if (y < z) {
            return z;

        } else {
            System.out.println("Son iguales");
            return 0;
        }
    }

    //3
    public static long sumaIntervalo(long x, long y) {
        long z = 0;
        if (x > y) {
            z = x;
            x = y;
            y = z;
        }

        for (long i = x; i <= y; i++) {
            z += i;
        }

        return z;
    }

    //4
    public static int contarCeros(String cadena) {
        int counter = 0;
        for (int i = 0; i <= cadena.length() - 1; i++) {
            if (cadena.charAt(i) == '0') {
                counter += 1;
            }
        }
        return counter;
    }

    //5
    public static int aleatorio(int x, int y) {
        int z;
        if (x < 1 || y < 1) {
            return -1;
        }
        if (x > y) {
            z = x;
            x = y;
            y = z;
        }
        int rnd = (int) (Math.random() * (y - x)) + x;
        return rnd;
    }

}
