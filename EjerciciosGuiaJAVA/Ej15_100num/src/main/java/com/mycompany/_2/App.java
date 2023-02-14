/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany._2;

/**
 *
 * @author Usuario
 */
public class App {
    public static void func100num_posta()
    {
        
        int [] vecNum = new int[101];
        
        for(int i=vecNum.length - 1; i>=0; i--)
        {
           vecNum[i]= i;
            System.out.print(vecNum[i] + " ");
        }
    }

    public static void main(String[] args) {
        func100num_posta();
    }
}
