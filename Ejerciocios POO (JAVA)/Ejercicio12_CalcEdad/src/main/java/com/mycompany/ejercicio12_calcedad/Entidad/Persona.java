/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.ejercicio12_calcedad.Entidad;

import java.util.Date;
import java.util.Scanner;

/**
 *
 * @author franc
 */
public class Persona {

    String nombre;
    Date fechaNac;

    public Persona() {
    }

    public Persona(String nombre, Date fechaNac) {
        this.nombre = nombre;
        this.fechaNac = fechaNac;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public Date getFechaNac() {
        return fechaNac;
    }

    public void setFechaNac(Date fechaNac) {
        this.fechaNac = fechaNac;
    }

    //Metodos
    public void crearPersona() {

        Scanner scan = new Scanner(System.in);
        System.out.println("Digite su nombre");
        String nomb = scan.nextLine();

        System.out.println("Digite su dia de nacimiento");
        int dia = scan.nextInt();

        System.out.println("Digite su mes de nacimiento");
        int mes = scan.nextInt();

        System.out.println("Digite su año de nacimiento");
        int anio = scan.nextInt();

        Date fecha = new Date(anio - 1900, mes - 1, dia);

        nombre = nomb;
        fechaNac = fecha;
    }
    
    public int calcularEdad()
    {
        Date fechaActual = new Date();
        
        int claculoFecha = fechaNac.getYear() - fechaActual.getYear();
         
        return calculoFecha;
    }
}
