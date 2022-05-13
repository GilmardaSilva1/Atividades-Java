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
public class Assalariado extends Empregado {
    private double salario;
    
    public Assalariado (double salario,String nome, String sobrenome, String cpf)
    {
        super(nome,sobrenome,cpf);
        this.salario = salario;
    }
    
    public double vencimento()
    {
        return 0;
    }
}
