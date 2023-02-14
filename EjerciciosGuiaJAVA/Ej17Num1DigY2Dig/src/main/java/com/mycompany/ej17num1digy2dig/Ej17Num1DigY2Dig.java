/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.ej17num1digy2dig;

import java.util.Scanner;

/**
 *
 * @author Usuario
 */
public class Ej17Num1DigY2Dig {
/*17. Recorrer un vector de N enteros contabilizando cuántos números son de 1 dígito, cuántos
de 2 dígitos, etcétera (hasta 5 dígitos).*/
    public static void main(String[] args) {
     
        Scanner leer = new Scanner(System.in);
        //int n = leer.nextInt();
        int n1 = 0, n2 = 0, n3 = 0, n4 = 0, n5 = 0;
        System.out.println("Ingrese la cantidad de numeros: ");
        int n = leer.nextInt();
        int[] nums = new int[n];
        //int[] vector = {1, 12, 123, 1234, 12345};
        
        for (int i=0 ; i< n ; i++){
            System.out.println("Ingrese el numero "+(i+1)+":");
            nums[i]= leer.nextInt();
            if (nums[i]<10){
            n1++;
        } else if (nums[i]<100){
            n2++;
        } else if (nums[i]<1000){
            n3++;
        } else if (nums[i]<10000){
            n4++;
        } else if (nums[i]<100000){
            n5++;
        } else{
                System.out.println("El numero ingresado supera los 5 digitos.");
        }
        }
            
        System.out.println("Numeros de 1 digito: "+n1);
        System.out.println("Numeros de 2 digito: "+n2);
        System.out.println("Numeros de 3 digito: "+n3);
        System.out.println("Numeros de 4 digito: "+n4);
        System.out.println("Numeros de 5 digito: "+n5);
        
    }
    
}
