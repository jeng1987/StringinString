/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package caracteres;

import java.util.Scanner;

/**
 *
 * @author JENG-PC
 */
public class Caracteres {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
           Scanner leer = new Scanner(System.in);
           System.out.print("Digite la cadena donde buscar: ");
           String cadena = leer.nextLine();
           System.out.print("Digite la cadena a buscar: ");
           String abuscar = leer.nextLine();
           int veces = 0;          
           
           if(cadena.contains(abuscar)){
                    System.out.println("Los encontre");
            for (int i = 0; i < cadena.length(); i++) {              
                if (cadena.substring(i).startsWith(abuscar)) {
                    veces ++;
                    }               
                }
            } else{
                 System.out.println("No está");  
                 }
                System.out.println("la cadena está: "+ veces + " veces");

    }
        
        
        
//        Scanner leer = new Scanner(System.in);
//        System.out.print("Digite la cadena donde buscar");
//        String cadena = leer.next();
//        System.out.print("Digite la cadena a buscar");
//        String abuscar = leer.next();
//        
//        if(cadena.contains(abuscar)) 
//        {
//            System.out.println("Los encontre");
//        }
//        else
//        {
//            System.out.println("No está");  
//        }
     
       
      
       
       
       
       
    }
    

