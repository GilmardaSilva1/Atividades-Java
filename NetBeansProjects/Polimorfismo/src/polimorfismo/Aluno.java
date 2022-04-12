/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package polimorfismo;

/**
 *
 * @author aluno
 */
public class Aluno extends Pessoa{

    private int RA;
    
    public void mostraDados()
    {
        System.out.println("É um aluno");
    }
    public double calculaMedia(double n1, double n2)
    {
        return(n1+n2)/2;
    }
    
    public int getRA() {
        return RA;
    }

    public void setRA(int RA) {
        this.RA = RA;
    }
}
