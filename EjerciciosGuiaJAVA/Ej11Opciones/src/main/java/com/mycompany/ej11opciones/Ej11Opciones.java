/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.ej11opciones;

import java.util.Scanner;

/**
 *
 * @author Usuario
 */
public class Ej11Opciones {

    public static void main(String[] args) {
     Scanner ent1 = new Scanner(System.in); 
        System.out.println("Escribe el primer nro");
        int num1 = ent1.nextInt();
        
        Scanner ent2 = new Scanner(System.in);
        System.out.println("Escribe el segundo nro");
        int num2 = ent2.nextInt();
        
       int suma, resta, mult;
       double div;
       
       suma = num1 + num2; 
       resta = num1 - num2; 
       mult = num1 * num2;
       div = (double)num1 / num2;

       // MEJORAR con el do while y con el equalsignore
            
           Scanner entOp = new Scanner(System.in);
          System.out.println("Ingrese su opcion: \n MENU: \n 1: Suma \n 2: Resta \n 3: Multiplicacion \n 4:Dividir \n 5: Salir");
           int opc = entOp.nextInt();
          
          
           
           while(opc >1 && opc <=5) //meter el while dentro de la opcion "n"
           {  
               if(opc == 5)
                        {
                            System.out.println("Para salir presione s y n para volver al menu");
                            Scanner paraSalir = new Scanner(System.in);
                            
                            String salir = paraSalir.nextLine();

                        
                            if("n".equalsIgnoreCase(salir))
                                {
                            continue;
                                 }
                            else if("s".equalsIgnoreCase(salir))
                                 {
                                     break;
                                  }
                        }
           
                System.out.println("Vuelva a ingresar su opcion: \n MENU: \n 1: Suma \n 2: Resta \n 3: Multiplicacion \n 4:Dividir \n 5: Salir");
               opc = entOp.nextInt();
                //Asi se repite hasta que se da un valor valido
         switch (opc) {
             case 1:
                 System.out.println("El resultado de la suma es: "+suma);
                 break;
             case 2:
                 System.out.println("El resultado de la resta es: "+ resta);
                 break;
             case 3:
                 System.out.println("El resultado de la multiplicacion es: "+mult);
                 break;
             case 4:
                 System.out.println("El resultado de la division es: "+div);
                 break;
             default:
                 break;
         }
                      
                            
                  
                            
                            
             
                         
              
              
                  
              
           
              
              
           }      
           
           }
           //System.out.println("Gracias");
           
           
       
}

