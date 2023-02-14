/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.ejfunciones;

import java.util.Scanner;

/**
 *
 * @author Usuario
 */
public class EjFunciones {
    
    //se escriben fuera del main
    public static void ingresoDeDatos()
    {
        System.out.println("Hola buenas tardes");
    }
    
    
    public static void main(String[] args) {
        Scanner leer = new Scanner(System.in);
        System.out.println("Ingrese una frase para cambiar sus vocales: ");
        String frase = leer.nextLine();
        
        // las funciones cuamdo reciben argumentos
        //se debe especificar cual es
        
        String retorno = frase2(frase);
        System.out.println(retorno);
    }
    
    public static String frase2(String frase) {
        
        frase=frase.toLowerCase();
        String frase2="";
        
        for (int i = 0; i < frase.length(); i++) {
             char controlador = frase.charAt(i); // asi se escribe la variable char
            switch (controlador) {
                case 'a':
                    frase2+="@";
                    break;
                case 'e':
                    frase2+="#";
                    break;
                case 'i':
                    frase2+="$";
                    break;
                case 'o':
                    frase2+="%";
                    break;
                case 'u':
                    frase2+="*";
                    break;
                default:
                    frase2+=controlador;
                    break;
            }
            
    } 
        return frase2;
    }
    }
