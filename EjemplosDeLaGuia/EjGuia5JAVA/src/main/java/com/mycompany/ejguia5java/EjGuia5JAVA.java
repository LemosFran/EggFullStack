/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.ejguia5java;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Scanner;
import javax.swing.JOptionPane;
/**
 *
 * @author Usuario
 */
public class EjGuia5JAVA {

    public static void main(String[] args) {
        Scanner nomb1 = new Scanner(System.in);
        System.out.println("Ingrese una palabra");
        String palabraa = nomb1.next();
    
    //ejemplo con char    
    //char palabraa = nomb1.next().charAt('ñ');
        
        /*System.out.println("Hola " + palabraa);
        
        Scanner nomb2 = new Scanner(System.in);
        System.out.println("Ingrese otra palabra");
        String palabraa2 = nomb2.nextLine();            // nextLine() Funciona igual
        System.out.println("Hola " + palabraa2);*/
        
        //Ahora con numeros
        
        Scanner num1 = new Scanner(System.in);
        System.out.println("Ingrese el primer numero");
        int primerNro = Integer.parseInt(num1.next()); // ATENTOS A LA SINTAXIS (LAS MAYUSC)
        
        Scanner num2 = new Scanner(System.in);
        System.out.println("Ingrese el primer numero");
        int SegundoNro = num2.nextInt(); //mucho mas practico
//Integer.parseInt(num2.next());
        
        int suma = primerNro / SegundoNro;
        System.out.println("La suma fue: " + suma);
        
        
    }
}
