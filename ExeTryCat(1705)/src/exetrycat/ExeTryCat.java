/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package exetrycat;

/**
 *
 * @author aluno
 */
public class ExeTryCat {

    public static void aumentarLetra()
    {
        String teste = "Rapaizzzzzzz";
        try
        {
            
        System.out.println(teste.toUpperCase());
        }
        catch (NullPointerException e)
        {
            System.out.println("Descilpe! " + "A string não pode ser null");
        }
        finally{
            System.out.println("Finish Progam");
        }
    }
    
    public static void main(String[] args) {
        aumentarLetra();

    }

    }
