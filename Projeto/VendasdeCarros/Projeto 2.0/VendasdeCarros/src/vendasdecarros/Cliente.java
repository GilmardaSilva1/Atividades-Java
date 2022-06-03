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
    private Double rg;
    private Double telefone;
    private String comp;

    public Cliente(String email, Double rg, Double telefone, int idade, String nome,String comp) {
        super(nome, idade);
        this.email = email;
        this.rg = rg;
        this.telefone = telefone;
        this.comp = comp;
    }

    public String getComp() {
        return comp;
    }

    public void setComp(String comp) {
        this.comp = comp;
    }

   
    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }


    public Double getRg() {
        return rg;
    }

    public void setRg(Double rg) {
        this.rg = rg;
    }

    public Double getTelefone() {
        return telefone;
    }

    public void setTelefone(Double telefone) {
        this.telefone = telefone;
       
    }
    
}
