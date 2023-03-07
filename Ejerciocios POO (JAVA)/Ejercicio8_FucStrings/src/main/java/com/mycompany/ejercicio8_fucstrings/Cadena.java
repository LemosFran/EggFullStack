/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.ejercicio8_fucstrings;

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
public class Cadena { 
// entidad
    private String cadena1;
    private int longFrase;
    
    public String getCadena1() {
        return cadena1;
    }

    public Cadena() {
    }

    public Cadena(String cadena1) {
        this.cadena1 = cadena1;
    }

    
    
    public void setCadena1(String cadena1) {
        this.cadena1 = cadena1;
    }

    public int getLongFrase() {
        return longFrase;
    }

    public void setLongFrase(int longFrase) {
        this.longFrase = longFrase;
    }
    
        public void mostrarVocales()
    {
        
        int contador = 0;
        
        for(int i=0; i < longFrase; i++) //como imprimir letra por letra mientras este repetida
        {
            char letra = cadena1.charAt(i);
            
            if(letra == 'a' || letra == 'e' || letra == 'i' || letra == 'o' || letra == 'u')
            {
                 System.out.print(letra + " "); // muestra las vocales encontradas
                contador++;
            }
                   
        }
        
        System.out.println("la cantidad de vocales son: " + contador);
       
        
    }

        //invertir frase
    public void invertirFrase()
    {
       
            String fraseinvertida= "";
            for (int i = longFrase - 1; i >= 0 ; i--) {
                fraseinvertida += cadena1.charAt(i);
            }
            System.out.println(fraseinvertida);
          
        
    }
        
     //veces repetidos
    public void vecesRepetido(String letra)
    {
        int contador = 0;
            for (int i = 0; i < longFrase; i++) {
                if (letra.charAt(0) == cadena1.charAt(i)) { // poner los valores del scanner desde el main
                    contador++;
                }
                       
            }
            System.out.println("La cantidad de veces repetida es " + contador);
    }
    
    // Comparar longitud
    public void compararLongitud(String frase)
    {
        if (longFrase == frase.length()) { // lo mismo aca
                System.out.println("La longitud es igual");
                
            }
            else{
                System.out.println("La longitud es diferente");
            }
    }
    
    //union de frases
    public void  unirFrases(String frase){
        //lo mismo
            System.out.println(frase + " " + this.cadena1);
            
        
        
    }
    
    //Reemplazar letras
    public void reemplazar(String reemplazo){
        // lo mismo, desde el main
            String fraseR = this.cadena1.replace("a" , reemplazo);
            System.out.println(fraseR);
            
        }
    
    //Contiene o no la letra 
    public boolean contiene(String letra2){
            
        return this.cadena1.contains(letra2);
        }
    
}
