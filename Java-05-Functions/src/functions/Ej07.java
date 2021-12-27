/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package functions;

/**
 *
 * @author Brais
 */
public class Ej07 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {

        System.out.println("Los numeros primos del 1 al 1000 son: ");
        for (int i = 1; i < 1000; i++) {
            if (cantidadDivisores(i) == 2) {
                System.out.print(i + " ");
            }
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
