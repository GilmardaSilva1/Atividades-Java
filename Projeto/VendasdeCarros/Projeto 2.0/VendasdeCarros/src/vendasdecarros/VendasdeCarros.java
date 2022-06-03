package vendasdecarros;

import java.util.ArrayList;
import java.util.Scanner;

/**
 *
 * @author aluno
 */
public class VendasdeCarros {

   static ArrayList<Cliente> listaCliente = new ArrayList();
   //private ArrayList<Funcionario> listaFuncionario = new ArrayList();
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        Cliente c1 = new Cliente("",0.0,0.0,0,"","");
        
        System.out.println("Digite 1 para cadastar alguém, 2 para verificar a lista de pessoas e 3 para remover");
        int ver = entrada.nextInt();
        
        switch(ver){
            case 1: 
                // Adiciona algumas pessoas.
                System.out.println("Digite o nome e a idade do cliente: /n ");
                c1.setNome(entrada.nextLine());
                c1.setIdade(entrada.nextInt());

                System.out.println("Digite o email e o telefone: /n");
                c1.setEmail(entrada.next());
                entrada.nextLine();
                c1.setTelefone(entrada.nextDouble());

                System.out.println("Digite o RG: /n");
                c1.setRg(entrada.nextDouble());

                 listaCliente.add(c1);
                 
                 
                 System.out.println("Digite 1 para verifcar a lista 2 para remover algúem da lista e 0 para encerrar a execução");
                 if ()
                 {
                 
                 }
        }
        
         
         //Verificar quantas pessoas tem na lista
         System.out.println("deseja ver pessoas cadastradas?");
         for(int i = 0; i < listaCliente.size(); i++)
        {
        System.out.println(listaCliente.get(i).getNome());
        }
         
          
          System.out.println("Digite o nome que deseja remover");
          String Nome = entrada.next();
       
        // Removendo alguém:
        for (Cliente c : listaCliente) {
         
           if(c1.getNome().equals(Nome))
           {
               // Encontrou uma pessoa cadastrada com nome.
               
               // Remove.
               listaCliente.remove(c1);
               
               // Sai do loop.
               break;
           }
       }
        
        System.out.print("Pessoas cadastradas após remoção:\n");
        for(int i = 0; i < listaCliente.size(); i++)
        {
            System.out.print(listaCliente.get(i).getNome() + "\n");
        }

        }
    
}

