/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package repaso;

/**
 *
 * @author CFGS
 */
public class NumDivisibles {

    public static void main(String[] args) {

        int num1 = 1;

        while (num1 < 100) {
            if (num1 % 2 == 0 && num1 % 3 == 0) {

                System.out.println("Es divisible entre 2 y 3");

            }
        }

}

}
