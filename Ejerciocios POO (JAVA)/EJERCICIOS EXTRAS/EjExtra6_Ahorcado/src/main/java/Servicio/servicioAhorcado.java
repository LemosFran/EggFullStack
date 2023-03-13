/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Servicio;

import Entidad.Ahorcado;
import java.util.Arrays;
import java.util.Scanner;

/**
 *
 * @author Usuario
 *//*
    Ingrese una letra:
a
Longitud de la palabra: 6
Mensaje: La letra pertenece a la palabra
Número de letras (encontradas, faltantes): (3,4)
Número de oportunidades restantes: 4*/
public class servicioAhorcado {

    /*Metodo crearJuego(): le pide la palabra al usuario y cantidad de jugadas máxima.
Con la palabra del usuario, pone la longitud de la palabra, como la longitud del
vector. Después ingresa la palabra en el vector, letra por letra, quedando cada letra
de la palabra en un índice del vector. Y también, guarda en cantidad de jugadas
máximas, el valor que ingresó el usuario y encontradas en 0.*/
    Scanner scan = new Scanner(System.in);

    public Ahorcado crearJuego(Ahorcado a) {

        System.out.println("Ingrese la palabra para que alguien mas juegue");

        String[] arrParaSet = new String[1]; //debe ser de tamaño 1
        //pasar al cuaderno
        arrParaSet[0] = scan.next();

        a.setPalabraBuscada(arrParaSet);

        System.out.println("Ingrese la cantidad maxima de intentos");
        a.setJugadasMax(scan.nextInt());

        //tratar de imprimir los elementos del array uno por uno 
        // int contador = 0; da cero por que se le asigno un valor ya
        //seteo la dimension de la palabra
        a.setLongVector(a.getPalabraBuscada()[0].length()); //pasar al cuaderno

        //cuento la letra letra por letra dento de la cantidad de espacios que tiene el array
        for (int i = 0; i < a.getPalabraBuscada()[0].length(); i++) {
            char letra = a.getPalabraBuscada()[0].charAt(i);
           // System.out.print(letra + " ");
            //contador++;
            //PROBAR EL DEBUGGER CONSOLE
        }
        
        

//guarda en cantidad de jugadas
//máximas, el valor que ingresó el usuario y encontradas en 0.
//pedir las letras
        int contLetras = 0;
        boolean boolEnc = false;
        int palaNo = 0;
        int encon =0;
        while(contLetras != a.getJugadasMax())
        {
            System.out.println("Ingrese una letra");
            String let = scan.next();
            contLetras++;
            
             boolEnc = false; // reiniciar boolEnc a false aca estaba el error
             //ver que onda
            
             for(int i=0; i<a.getPalabraBuscada()[0].length(); i++)
        {
                       
            System.out.println("palabras no encontradas: "+palaNo);
            System.out.println("palabras si encontradas: "+encon);
            if(let.equals(Character.toString(a.getPalabraBuscada()[0].charAt(i))))
                //ASI SE COMPARA UNA LETRA ING Y EL RECORRIDO DE LETRA POR LETRA DENTRO DE UN ARRAY
            {
                boolEnc = true;
                System.out.println("la letra estaba");
                encon++;
                break;
               
            }if(!boolEnc)
            {
                System.out.println("esa letra no estaba");
                palaNo++;
                break;
                
            }// hay un error
            
        }//SI LA LETRA NO ES IGUAL AL RECUENTO DE CHAR CON EL FOR SUMAR A UN CONTADOR
        //DE LETRAS ERRADAS
        
        
       
        }
        
// pedir letras mientras dure la cantidad de palabras erradas
            // System.out.println("el contador es: "+contador); //prueba
            return a;

    }

    public Ahorcado ingresarLetra(Ahorcado a) {
        System.out.println("Ingrese la primer letra");

        return null;
    }

}
/*valueOff???
En lugar de crear un nuevo array arrParaSet, que solo tiene un elemento, y luego asignar ese array a palabraBuscada, puedes simplemente leer la palabra del usuario directamente en una cadena y asignar esa cadena a palabraBuscada. De esta manera, no necesitas crear un array temporal que no sirve para nada.

Cuando se ingresa una palabra, también debes establecer la longitud del vector a la longitud de esa palabra. En otras palabras, después de leer la palabra del usuario, debes llamar a a.setLongVector(a.getPalabraBuscada()[0].length()).

Para asignar cada letra de la palabra a un índice en el vector, puedes recorrer la cadena de la palabra letra por letra usando un bucle for y luego asignar cada letra a un elemento del vector utilizando el método a.getPalabraVector()[i] = letra; donde i es el índice actual del bucle for y letra es la letra actual de la palabra.

Aquí te dejo una versión modificada del método para que puedas compararla con tu implementación:

scss
Copy code
public Ahorcado crearJuego(Ahorcado a) {
    Scanner scan = new Scanner(System.in);

    System.out.println("Ingrese la palabra para que alguien mas juegue:");
    String palabra = scan.next();
    a.setPalabraBuscada(new String[]{palabra});

    System.out.println("Ingrese la cantidad maxima de intentos:");
    int jugadasMax = scan.nextInt();
    a.setJugadasMax(jugadasMax);
    a.setEncontradas(0);

    int longitudPalabra = palabra.length();
    a.setLongVector(longitudPalabra);
    String[] palabraVector = new String[longitudPalabra];

    for (int i = 0; i < longitudPalabra; i++) {
        char letra = palabra.charAt(i);
        palabraVector[i] = String.valueOf(letra);
    }

    a.setPalabraVector(palabraVector);

    return a;
}
 */

 /*public Ahorcado crearJuego(Ahorcado a) {
    Scanner scan = new Scanner(System.in);

    // Pide la palabra al usuario y crea un arreglo para guardarla letra por letra
    System.out.println("Ingrese la palabra para que alguien más juegue:");
    String palabra = scan.nextLine();
    String[] arregloPalabra = new String[palabra.length()];

    // Guarda cada letra de la palabra en un elemento del arreglo
    for (int i = 0; i < palabra.length(); i++) {
        arregloPalabra[i] = palabra.substring(i, i + 1); //guardara una letra, un indice?
    }

    // Guarda el arreglo con la palabra y su longitud en el objeto Ahorcado
    a.setPalabraBuscada(arregloPalabra);
    a.setLongVector(palabra.length());

    // Pide la cantidad máxima de jugadas al usuario y guarda el valor en el objeto Ahorcado
    System.out.println("Ingrese la cantidad máxima de intentos:");
    int jugadasMax = scan.nextInt();
    a.setJugadasMax(jugadasMax);

    // Guarda el valor inicial de letras encontradas (0) en el objeto Ahorcado
    a.setLetEncontradas(0);

    return a;
}
 */
