/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */
package com.mycompany.ejercicio11_clasedate;

import java.util.Date;
import java.util.Scanner;

/**
 *
 * @author franc
 */
public class Ejercicio11_ClaseDate {

    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);
        System.out.println("Ingrese el dia");
        int dia = scan.nextInt();
        System.out.println("Ingrese el mes");
        int mes = scan.nextInt();
        System.out.println("Ingrese el año");
        int anio = scan.nextInt();

        Date fechaIng = new Date(dia, mes - 1, anio - 1900); 
        //esta mal porque java toma el año, el mes y el dia
        
        Date fechaAct = new Date();
        
        //long; para usar todos los elementos de date
        long fechaEnMs = fechaAct.getTime() - fechaIng.getTime();
        //el getTime trae la fecha en milisegundos, por eso es necesario hacer todo este problema
        //el -1 es porque se cuentan los años a partir del 0 al 11
        
        long difFechas = fechaEnMs / 1000 / 60 / 60 / 24 / 365;
        // 1000 (segundos), 60 (minutos), 60 (horas), 24 (días) y 365 (años) 
         
        System.out.println("La fecha actual es: "+fechaAct);
        System.out.println("La fecha ingresada fue: "+fechaIng);
        System.out.println("La diferencia de años es de: "+difFechas);
        
    }
}
