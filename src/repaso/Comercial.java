/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package repaso;

import java.util.Scanner;

/**
 *
 * @author CFGS
 */
public class Comercial {

    public static void main(String[] args) {

        int ventas = 1;

        double sumaFinal = 0;

        Scanner sc = new Scanner(System.in);

        System.out.println("Introduce el número de ventas: ");

        ventas = sc.nextInt();

        for (int i = 1; i <= ventas; i++) {

            System.out.println("Introduce cantidad: " + i);

            double precio = sc.nextDouble();

            sumaFinal = sumaFinal + precio;
            //sumaFinal += precio;

        }

        System.out.println("La cantidad total es: " + sumaFinal);

    }

}
