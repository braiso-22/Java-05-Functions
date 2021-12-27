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
public class Ej10 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        float saldo = 500f;
        saldo = ingresar(saldo, 400f);
        if (ingresar(saldo, 400f) > 1000f) {
            System.out.println("Ya tienes más de 1000 euros: " + saldo);
        } else {
            System.out.println("No tienes más de 1000 euros: " + saldo);
        }
    }

    static float ingresar(float saldo, float increm) {
        return saldo + increm;
    }
    
    /*Mostrará "Ya tienes más de 1000 euros: 900", esto pasa porque ahora 
    no se está usando una variable global por lo que no se están sumando los 400
    del if al saldo del main si no que al saldo de la función*/
}
