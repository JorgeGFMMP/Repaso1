
package repaso;

import java.util.Scanner;


/**
*
* @author CFGS
*/

public class Repaso {

    
    public static void main(String[] args) {
       
    double radio = 0;
    
    double pi = 3.14;
    
    Scanner sc = new Scanner(System.in);
    
    System.out.println("Introduzca el radio: ");
    
    radio =  sc.nextDouble();
    
    double area = pi * (radio * radio);
    
    System.out.println("El area del circulo es: " + area);
    
        
        
    } //Fin del Main
    
   
   
}//Fin de la clase Repaso
