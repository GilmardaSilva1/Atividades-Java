/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ex1;


public class Ex1 {
      
 public static void main(String[] args) {
        
     Object o = null;
     
     try
     {
         o.toString();
     }
     catch(NullPointerException e)
     {
         System.out.println("Erro no valor");
     }
     
   }
    
}
