/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package calculaesfere;

/**
 *
 * @author aluno
 */
public class Circulo implements Calcula{

        private double raio;
    @Override
    public double calcArea() {
       return Math.PI *(raio*raio);
    }

    public double getRaio() {
        return raio;
    }

    public void setRaio(double raio) {
        this.raio = raio;
    }
    @Override
    public double calcerimetro() {
        return 2*Math.PI*raio;
    }

    @Override
    public double calSeccao() {
        return 0;
    }

    @Override
    public void mostrar() {
        System.out.println("Difito");    
    }
    
}
