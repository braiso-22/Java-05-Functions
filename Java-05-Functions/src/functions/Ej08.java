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
public class Ej08 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);
        int num, num2, div, div2;
        System.out.println("Introduce 2 numeros y te digo"
                + " cual tiene más divisores");
        num = teclado.nextInt();
        num2 = teclado.nextInt();
        System.out.print("El que más tiene es: ");
        div = cantidadDivisores(num);
        div2 = cantidadDivisores(num2);
        if (div > div2) {
            System.out.println(num);
        } else {
            System.out.println(num2);
        }
    }

    public static int cantidadDivisores(int num) {
        int suma = 0;
        if (num >= 0) {
            for (int i = 1; i <= num; i++) {
                if (num % i == 0) {

                    suma += 1;
                }
            }
            return suma;
        }
        return 0;
    }

}
