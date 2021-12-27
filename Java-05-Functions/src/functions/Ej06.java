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
public class Ej06 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);
        System.out.println("Introduce un numero y te digo cuantos"
                + " divisores tiene");
        System.out.println(cantidadDivisores(Integer.parseInt(teclado.nextLine())));
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
