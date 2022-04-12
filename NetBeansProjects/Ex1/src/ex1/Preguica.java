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
public class Preguica extends Animal {

    private boolean subir;  

    public void animalSom(){
        System.out.println("Preguiça de escrever");
    }
    
    public boolean isSubir() {
        return subir;
    }

    public void setSubir(boolean subir) {
        this.subir = subir;
    }
    
}
