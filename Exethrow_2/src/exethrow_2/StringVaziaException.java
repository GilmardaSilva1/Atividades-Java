/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package exethrow_2;

/**
 *
 * @author aluno
 */
public class StringVaziaException extends RuntimeException{
   
    
    public String getMenssage()
    {
            return "A string (nome) não pode ser vazia";
    }
}
