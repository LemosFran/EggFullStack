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
    
    private int isnb;
    private String titulo;
    private String autor;
    private int cantPaginas;

    public Libros() {
    }
    // Constructor con todas las pag  
    public Libros(int isnb, String titulo, String autor, int cantPaginas) {
        this.isnb = isnb;
        this.titulo = titulo;
        this.autor = autor;
        this.cantPaginas = cantPaginas;
    }
    
//<<<<<<< HEAD
    public void cargarLibro(int codigo, String tituloLibro, String nombreAutor, int numPaginas)
    {
        System.out.println("Ingrese la informacion del libro");
        Scanner entradaLibro =new Scanner(System.in);
        
        codigo= entradaLibro.nextInt();
        tituloLibro = entradaLibro.nextLine();
        
    }
//=======
    public void codLibros()
    {
        Scanner entLib = new Scanner(System.in); 
        System.out.println("Ingrese el codigo del libro");
        this.isnb=entLib.nextInt();
        entLib.nextLine(); // consume el espacio en blanco
        // hace que no me saltee el titulo y pase ala autor directamente
        System.out.println("Ingrese el titulo");
        this.titulo=entLib.nextLine();
        
        System.out.println("Ingrese el autor del libro");
        this.autor=entLib.nextLine();
        
        System.out.println("Ingrese la cantidad de paginas");
        this.cantPaginas = entLib.nextInt();
        
    }
    
    

    @Override
    public String toString() {
        return "Libros{" + "isnb=" + isnb + ", titulo=" + titulo + ", autor=" + autor + ", cantPaginas=" + cantPaginas + '}';
    }
    
  
//>>>>>>> e8183c299e596a6bf51d271a1c974465d6c716f9
}
