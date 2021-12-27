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
public class Ej04 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);
        int año, mes, dia, mes2, dia2, total = 0, total2 = 0;

        System.out.println("Introduce una fecha AÑO MES DIA");
        año = teclado.nextInt();
        mes = teclado.nextInt();
        dia = teclado.nextInt();
        System.out.println("Introduce otra fecha del mismo año y te digo cuantos días han pasado "
                + "entre la primera y la segunda \nMES DIA");
        mes2 = teclado.nextInt();
        dia2 = teclado.nextInt();
        for (int i = 1; i < mes; i++) {
            total += CalcularDiasMes(año, i);

        }
        total += dia;
        for (int i = 1; i < mes2; i++) {
            total2 += CalcularDiasMes(año, i);

        }
        total2 += dia2;
        System.out.println("Han pasado " + Math.abs(total - total2) + " días");
    }

    public static int CalcularDiasMes(int AAAA, int MM) {
        int dia = 0, febrero = 28;

        if (bisiesto(AAAA)) {
            febrero = 29;
        }
        switch (MM) {
            case 1:
            case 3:
            case 5:
            case 7:
            case 8:
            case 10:
            case 12:
                dia = 31;
                break;

            case 4:
            case 6:
            case 9:
            case 11:
                dia = 30;
                break;

            case 2:
                dia = febrero;
                break;
            default:
                System.out.println("Mes incorrecto");
                break;
        }
        return dia;
    }

    public static boolean bisiesto(int AAAA) {
        boolean bisiesto = AAAA % 100 != 0 && AAAA % 4 == 0 || AAAA % 400 == 0;

        return bisiesto;
    }

}
