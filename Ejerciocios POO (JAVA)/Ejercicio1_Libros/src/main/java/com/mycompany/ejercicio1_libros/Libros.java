/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.ejercicio1_libros;

import java.util.Scanner;

/**
 *
 * @author franc
 */
/* Crear una clase llamada Libro que contenga los siguientes atributos: ISBN, Título, Autor,
Número de páginas, y un constructor con todos los atributos pasados por parámetro y un
constructor vacío. Crear un método para cargar un libro pidiendo los datos al usuario y
luego informar mediante otro método el número de ISBN, el título, el autor del libro y el
numero de páginas. */
public class Libros {
    
    int isnb;
    String titulo;
    String autor;
    int cantPaginas;

    public Libros() {
    }
    // Constructor con todas las pag
    public Libros(int isnb, String titulo, String autor, int cantPaginas) {
        this.isnb = isnb;
        this.titulo = titulo;
        this.autor = autor;
        this.cantPaginas = cantPaginas;
    }
    
    public void cargarLibro(int codigo, String tituloLibro, String nombreAutor, int numPaginas)
    {
        System.out.println("Ingrese la informacion del libro");
        Scanner entradaLibro =new Scanner(System.in);
        
        codigo= entradaLibro.nextInt();
        tituloLibro = entradaLibro.nextLine();
        
    }
}
