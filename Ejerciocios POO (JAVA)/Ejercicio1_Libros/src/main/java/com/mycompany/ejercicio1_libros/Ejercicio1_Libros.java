/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.ejercicio1_libros;

import java.util.Scanner;

/**
 *
 * @author Usuario
 */

/*Crear una clase llamada Libro que contenga los siguientes atributos: ISBN, Título, Autor,
Número de páginas, y un constructor con todos los atributos pasados por parámetro y un
constructor vacío. Crear un método para cargar un libro pidiendo los datos al usuario y
luego informar mediante otro método el número de ISBN, el título, el autor del libro y el
numero de páginas.*/

public class Ejercicio1_Libros {

    public static void main(String[] args) {
        Libros Libro1 = new Libros();
        
       Libro1.codLibros();
        System.out.println(Libro1.toString());
    }
}
