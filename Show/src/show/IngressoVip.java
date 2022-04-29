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
public class IngressoVip extends Ingresso {
    
    private int precoVip;
    private int qntIngressoVip;
    
    
    public int getQntIngressoVip() {
        return qntIngressoVip;
    }

    public void setQntIngressoVip(int qntIngressoVip) {
        this.qntIngressoVip = qntIngressoVip;
    }

    public int getPrecoVip() {
        return precoVip;
    }

    public void setPrecoVip(int precoVip) {
        this.precoVip = precoVip;
    }

    public void imprimeValor(){
        System.out.println("o valor do ingreço é :"+precoVip);
    }
    
    
}
