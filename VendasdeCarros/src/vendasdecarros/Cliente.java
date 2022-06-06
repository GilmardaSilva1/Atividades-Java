/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package vendasdecarros;

import java.util.InputMismatchException;
import java.util.Scanner;

/**
 *
 * @author aluno
 */
public class Cliente extends Pessoa {

    Scanner entrada = new Scanner(System.in);

    private String email;
    private Double rg;
    private int telefone;
    private String comp;
    private int idade;


    /*public Cliente(String nome, int idade) {
        super(nome, idade);
    }*/
    public void exibir() {
        System.out.println("Nome: " + super.getNome() + "\nIdade: " + this.idade + "\nTelefone: " + this.telefone + "\nRG: " + this.rg + "\n"
                + "Email: " + this.email + "\n");
    }

    public Cliente() {
        super.setIdade(1);
        this.telefone = -1;
    }

    public Cliente(String email, Double rg, int telefone, String comp, String nome, int idade) {
        super(nome, idade);
        this.email = email;
        this.rg = rg;
        this.telefone = telefone;
        this.comp = comp;

    }

    @Override
    public int getIdade() {
        return idade;
    }

    @Override
    public void setIdade(int idade) {
        this.idade = idade;
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
        if (rg < 0) {
            throw new IllegalArgumentException("Valor do RG invalido");
        } else {
            this.rg = rg;
        }
    }

    public int getTelefone() {
        return telefone;
    }

    public void setTelefone(int telefone) {
        if (telefone < 0) {
            throw new IllegalArgumentException("Valor de telefone invalido");
        } else {
            this.telefone = telefone;
        }

    }

    public Cliente CriarCliente() {
        Cliente cl = new Cliente();

// criando cliente
        System.out.println("Digite o nome do Cliente: ");
        cl.setNome(entrada.next());
        entrada.nextLine();

        while (cl.getIdade() < 1) {
            try {
                System.out.println("Digite a idade do cliente: ");
                cl.setIdade(entrada.nextInt());
            } catch (IllegalArgumentException e) {
                System.out.println("Idade de cliente invalida");
            } catch (InputMismatchException e) {
                System.out.println("Tipo de idade invalida");
                entrada.nextLine();
            }
        }
        while (cl.getTelefone() < 0) {
            try {
                System.out.println("Digite o telefone do Cliente:");
                cl.setTelefone(entrada.nextInt());
            } catch (IllegalArgumentException e) {
                System.out.println("Valor de telefone invalido");
            } catch (InputMismatchException e) {
                System.out.println("Tipo de telefone invalido");
                entrada.nextLine();
            }
        }

        System.out.println("Digite o email do Cliente:");
        cl.setEmail(entrada.next());

        System.out.println("Digite o RG: /n");
        cl.setRg(entrada.nextDouble());
        //entrada.nextDouble();

        // retorna arrayList
        return cl;
    }
}
