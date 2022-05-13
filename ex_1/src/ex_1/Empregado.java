/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ex_1;

/**
 *
 * @author aluno
 */
public abstract class Empregado {
    private final String nome;
    private final String sobrenome;
    private final String cpf;
    
    public Empregado(String nome, String sobrenome, String cpf){
        this.nome = nome;
        this.sobrenome = sobrenome;
        this.cpf = cpf;
    }
    
    public  double getvencimento(){
        return 0;
    }
}
