/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Servicios;
import Entidad.Meses;
import java.util.Scanner;
/**
 *
 * @author franc
 Metodo crearJuego(): le pide la palabra al usuario y cantidad de jugadas máxima.
Con la palabra del usuario, pone la longitud de la palabra, como la longitud del
vector. Después ingresa la palabra en el vector, letra por letra, quedando cada letra
de la palabra en un índice del vector. Y también, guarda en cantidad de jugadas
máximas, el valor que ingresó el usuario y encontradas en 0.
 */
public class servicioMeses {
    Scanner scan = new Scanner(System.in).useDelimiter("\n");
    public int ingresoDatos(Meses m)
    {
        Meses me = new Meses();
        System.out.println("Adivine el mes oculto, ingrese un mes en numero");
        
        return scan.nextInt(); // de esta manera no da cero cuando llamo 
        //el metodo desde otro
        
    }
    
    /*Metodo crearJuego(): le pide la palabra al usuario y cantidad de jugadas máxima.
Con la palabra del usuario, pone la longitud de la palabra, como la longitud del
vector. Después ingresa la palabra en el vector, letra por letra, quedando cada letra
de la palabra en un índice del vector. Y también, guarda en cantidad de jugadas
máximas, el valor que ingresó el usuario y encontradas en 0.*/
    public int adivinar(Meses m)
    {
       
        int jaj = ingresoDatos(m);
        //String mes = m.getMeses()[scan.nextInt()-1]; //sintaxis para traer el dato indicado desde entidad
        //System.out.println("el mes ingresado fue: "+mes);  //esto me generaba que 
        //ingrese varias veces un dato
        
        while(jaj != m.getMesSecreto())
        {
            System.out.println("ingrese nuevamente el mes");
            jaj=ingresoDatos(m);
            System.out.println("has ingresado el mes: " +m.getMeses()[jaj-1]);
        }
        if(jaj == m.getMesSecreto())
        {
            System.out.println("enhorabuena has acertado el mes ostia \n el mes secreto era " +m.getMeses()[m.getMesSecreto()]);
        }

        return jaj;
        
    }
    
    
}
