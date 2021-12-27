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
public class Ej03 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);
        int año, mes, dia, total = 0;
        //Primera parte
        System.out.println("Introduce un año y un mes y te digo los días que tiene");
        System.out.println(CalcularDiasMes(teclado.nextInt(), teclado.nextInt()));

        //segunda parte
        System.out.println("Introduce una fecha y te digo cuanto ha pasado "
                + "desde el 1 de enero de ese año \nAÑO MES DIA");
        año = teclado.nextInt();
        mes = teclado.nextInt();
        dia = teclado.nextInt();
        for (int i = 1; i < mes; i++) {
            total += CalcularDiasMes(año, i);

        }
        total += dia;
        System.out.println(total);
    }

    public static int CalcularDiasMes(int year, int mes) {
        int dia = 0, febrero = 28;

        if (bisiesto(year)) {
            febrero = 29;
        }
        switch (mes) {
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
