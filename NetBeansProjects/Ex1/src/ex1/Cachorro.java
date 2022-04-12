/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ex1;

/**
 *
 * @author aluno
 */
public class Cachorro extends Animal {

    private boolean correr;

    public void animalSom(){
        System.out.println("AuAu");
    }
    
    public boolean getCorrer() {
        return correr;
    }

    public void setCorrer(boolean correr) {
        this.correr = correr;
    }
    
    
}
