/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Servicio; 
import Entidad.Ahorcado;
import java.util.Scanner;
/**
 *
 * @author Usuario
 */
public class servicioAhorcado {
    Scanner scan = new Scanner(System.in);
    
    public Ahorcado crearJuego(Ahorcado a)
    {
        System.out.println("Ingrese la dimension del array");
        int arrD = scan.nextInt();
        
        String[] arrParaSet = new String[arrD];
        
        System.out.println("Ingrese la palabra");
        String pal= scan.next();
        
       for(int i=0; i<arrParaSet.length; i++)
      {
           arrParaSet[i] = pal;
       }
        
        a.setPalabraBuscada(arrParaSet);
        
        return a;
    }
}
