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
public class Ej05 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);
        int num=1;
        while(num<21 && num>0){
            System.out.println("Introduce un número y te digo su factorial\nMin:1 Max:20");
            num=teclado.nextInt();
            if(num<21 && num>0)System.out.println(Factoriales20(num));
        }
        
    }
    
    public static long Factoriales20(int num){
        long factorial=1;
        
        for(int i=2;i<=num;i++){
            factorial *=i;
        }
            
        return factorial;
    }
    
}
