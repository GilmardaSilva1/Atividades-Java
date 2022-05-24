/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ex_2;

import java.util.Scanner;

/**
 *
 * @author aluno
 */
public class Quadrado implements AreaCalculavel{
    
    private double lado;

    public Quadrado() {
        
    }
    
    
    public void calcularArea(){
        if (lado < 1){
         throw new IllegalArgumentException("Era esperado um valor maior que 0");   
        }
        else{
        this.lado = lado * lado;
        }
    }

    public double getLado() {
        return lado;
    }

    public void setLado(double lado) {
        this.lado = lado;
    }

    void setLado(Scanner entrada) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
    
}
