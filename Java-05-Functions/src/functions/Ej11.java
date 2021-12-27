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
public class Ej11 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        float saldo = 500f;
        ingresar(saldo, 600f);
        if (saldo > 1000f) {
            System.out.println("Ya tienes más de 1000 euros: " + saldo);
        } else {
            System.out.println("No tienes más de 1000 euros: " + saldo);
        }
    }

    static void ingresar(float saldo, float increm) {
        saldo += increm;
    }

    /*Mostrará "No tienes más de 1000 euros: 500" porque aunque hay una función
    que suma a saldo, suma al saldo de ingresar y no al del main y además es una
    función void, lo que significa que no tendrá un return de datos*/
}
