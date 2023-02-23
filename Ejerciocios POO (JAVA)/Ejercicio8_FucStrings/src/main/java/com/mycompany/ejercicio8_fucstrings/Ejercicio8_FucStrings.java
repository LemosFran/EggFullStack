/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */
package com.mycompany.ejercicio8_fucstrings;

import com.mycompany.ejercicio8_fucstrings.Servicios.cadenaServicio;
import java.util.Scanner;

/**
 *
 * @author franc
 */
/*Realizar una clase llamada Cadena que tenga como atributos una frase (de tipo de
String) y su longitud. En el main se creará el objeto y se le pedirá al usuario que ingrese
una frase que puede ser una palabra o varias palabras separadas por un espacio en
blanco y a través de los métodos set, se guardará la frase y la longitud de manera
automática según la longitud de la frase ingresada. Deberá además implementar los
siguientes métodos:
a)Método mostrarVocales(), deberá contabilizar la cantidad de vocales que tiene la
frase ingresada.
b) Método invertirFrase(), deberá invertir la frase ingresada y mostrarla por pantalla. Por
ejemplo: Entrada: "casa blanca", Salida: "acnalb asac".
c) Método vecesRepetido(String letra), recibirá un carácter ingresado por el usuario y
contabilizar cuántas veces se repite el carácter en la frase, por ejemplo:
d) Entrada: frase = "casa blanca". Salida: El carácter 'a' se repite 4 veces.
e) Método compararLongitud(String frase), deberá comparar la longitud de la frase que
compone la clase con otra nueva frase ingresada por el usuario.
f)
 Método unirFrases(String frase), deberá unir la frase contenida en la clase Cadena
con una nueva frase ingresada por el usuario y mostrar la frase resultante.
g) Método reemplazar(String letra), deberá reemplazar todas las letras “a” que se
encuentren en la frase, por algún otro carácter seleccionado por el usuario y mostrar
la frase resultante.
h) Método contiene(String letra), deberá comprobar si la frase contiene una letra que
ingresa el usuario y devuelve verdadero si la contiene y falso si no.*/
public class Ejercicio8_FucStrings {

    public static void main(String[] args) {
        Cadena c1 = new Cadena();
        
        
        System.out.println("ingrese una frase");
        Scanner scan1 = new Scanner(System.in);
        String st1 = scan1.nextLine();
        
        cadenaServicio cs = new cadenaServicio();
        
        
//Asignacion de valores
        c1.setCadena1(st1);
        c1.setLongFrase(st1.length());
        
        c1.mostrarVocales();
        c1.invertirFrase();
        
        Scanner leer = new Scanner(System.in);
        System.out.println("Ingrese una letra");
        String letra = leer.nextLine();
        c1.vecesRepetido(letra);
        System.out.println("Ingrese otra frase");
        c1.compararLongitud(leer.nextLine());
        System.out.println("Ingrese nueva frase para unir");    
        c1.unirFrases(leer.nextLine());
        System.out.println("Ingrese caracter que reemplaza la letra 'a' ");
        c1.reemplazar(leer.nextLine());
        System.out.println("Ingrese una letra para chequear que se encuentre");
        String letra2 = leer.nextLine();
        System.out.println(c1.contiene(letra2));
        
    }
}
