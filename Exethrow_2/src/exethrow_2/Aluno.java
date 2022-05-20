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
public class Aluno {
    private int ra;
    private String nome;

    public int getRa() {
        return ra;
    }

    public void setRa(int ra) {
        if(ra<0)
        {
            throw new IllegalArgumentException("Ra deve ser positivo");
         
        }else
        {
        this.ra = ra;
        }
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        if(nome.equals(ra))
        {
           throw new StringVaziaException();
        }else{
        this.nome = nome;
        }
    }
    
}
