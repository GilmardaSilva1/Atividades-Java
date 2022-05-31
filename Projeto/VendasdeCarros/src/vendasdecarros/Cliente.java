/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package vendasdecarros;

/**
 *
 * @author aluno
 */
public class Cliente extends Pessoa{

    private String email;
    private int rg;
    private int telefone;

    public Cliente(String email, int rg, int telefone, int idade, String nome) {
        super(nome, idade);
        this.email = email;
        this.rg = rg;
        this.telefone = telefone;
    }

   
    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }


    public int getRg() {
        return rg;
    }

    public void setRg(int rg) {
        this.rg = rg;
    }

    public int getTelefone() {
        return telefone;
    }

    public void setTelefone(int telefone) {
        this.telefone = telefone;
    }
    
}
