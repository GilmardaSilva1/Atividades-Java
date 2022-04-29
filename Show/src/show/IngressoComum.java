/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package show;

/**
 *
 * @author aluno
 */
public class IngressoComum extends Ingresso {
    
    private int PrecoCmu;
    private int qntIngresso;

    public int getQntIngresso() {
        return qntIngresso;
    }

    public void setQntIngresso(int qntIngresso) {
        this.qntIngresso = qntIngresso;
    }

    public int getPrecoCmu() {
        return PrecoCmu;
    }

    public void setPrecoCmu(int precoCmu) {
        this.PrecoCmu = precoCmu;
    }

    public void imprimeValor(){
        System.out.println("O valor do ingersso é: "+PrecoCmu);
    }
}
