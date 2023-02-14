/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.ej12xo;

import java.util.Scanner;

/**
 *
 * @author Usuario
 */
public class Ej12XO {

    public static void main(String[] args) {
       // crear dos contadores para almacenar los correctos e inc
       // do while(minetras que la var caracter !&&&&&), dentro ifs
       //var que aloje el valor &&&&&
       
       Scanner leer = new Scanner(System.in);

        String FDE = "&&&&&"; 
        String cadena = ""; // se puede poner el lector aca 
        // y llamarlo en el do con otra var tambien
        int x = 0; 
        int y = 0;

        System.out.println("Simule el funcionamiento de un dispositivo RS232");

        do {
            System.out.print("Ingrese la sequencia: ");
            cadena = leer.next().toUpperCase();

            if (cadena.length() <= 5 && !cadena.equals(FDE)) {

                if (cadena.startsWith("X") && cadena.endsWith("O")) {
                    x++;
                } else {
                    y++;
                }
                
            }else{
                System.out.println("Maximo 5 caracteres!");
            }
            if (cadena.equals(FDE)) {
                System.out.println("");
                System.out.println("Finalizo la simulacion! (ref.&&&&&)");
            }
        } while (!FDE.equals(cadena));

        System.out.println("Sequencias correctas: " + x);
        System.out.println("Sequencias incorrectas: " + y);

    }
       
    
}
