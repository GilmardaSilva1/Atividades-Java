
/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ex1;

import java.io.PrintStream;

/**
 *
 * @author aluno
 */
public class Ex1 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
        Animal a1 = new Cachorro();
        Animal a2 = new Cavalo();
        Animal a3 = new Preguica();
        
        a1.animalSom();
        a2.animalSom();
        a3.animalSom();
        
    }
    
}
