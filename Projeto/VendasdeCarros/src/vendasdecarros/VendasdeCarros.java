package vendasdecarros;

import java.util.ArrayList;
import java.util.Scanner;

/**
 *
 * @author aluno
 */
public class VendasdeCarros {

   private ArrayList<Cliente> listaCliente = new ArrayList();
   //private ArrayList<Funcionario> listaFuncionario = new ArrayList();
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        Cliente c1 = new Cliente("",0,0,0,"");
        
        System.out.println("Digite o nome e a idade do cliente: /n ");
        //
        //
        System.out.println("Digite o email e o telefone: /n");
        //
        //
        System.out.println("Digite o RA: /n");
                
    }
    
}
/*
ArrayList<Pessoa> pessoas = new ArrayList<>();

    // Adiciona algumas pessoas.
    pessoas.add(new Pessoa("José"));
    pessoas.add(new Pessoa("Maria"));
    pessoas.add(new Pessoa("Pedro"));

    System.out.print("Pessoas cadastradas:\n");
    for(int i = 0; i < pessoas.size(); i++)
    {
        System.out.print(pessoas.get(i).getNome() + "\n");
    }

    // Removendo Pedro:
    for(int i = 0; i < pessoas.size(); i++)
    {
        Pessoa p = pessoas.get(i);

        if(p.getNome().equals("Pedro"))
        {
            // Encontrou uma pessoa cadastrada com nome "Pedro".

            // Remove.
            pessoas.remove(p);

            // Sai do loop.
            break;
        }
    }

    System.out.print("Pessoas cadastradas após remoção:\n");
    for(int i = 0; i < pessoas.size(); i++)
    {
        System.out.print(pessoas.get(i).getNome() + "\n");
    }
Compartilhar
Melhore e
*/