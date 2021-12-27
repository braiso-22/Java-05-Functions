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
public class Ej09 {

    public static int saldo = 0;

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        boolean ok = false;
        ingresar(30);
        retirar(10);
        if (retirar(10) == false) {
            System.out.println("No se puede retirar tanto");
        }
        System.out.println("Saldo final: " + saldo);
    }

    static void ingresar(int i) {
        saldo += i;
    }

    static boolean retirar(int i) {
        if (i > saldo) {
            return false;
        }

        saldo -= i;
        return true;

    }
    /*Uno de los errores que tiene es que en el if está quitando dinero del 
    saldo y otro fallo en el código es que no se comprueba que no se introducen
    numeros negativos 
    
    El resultado en este caso será 10 en vez de 20 como se esperaría */
}
