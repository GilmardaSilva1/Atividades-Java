package vendasdecarros;

import java.util.ArrayList;
import java.util.Scanner;

/**
 *
 * @author aluno
 */
public class VendasdeCarros/* extends Cliente*/ {

   static ArrayList<Cliente> listaCliente = new ArrayList();
   static ArrayList<Funcionario> cadastroFuncionarios = new ArrayList<>();
   static ArrayList<Produtos> cadastroProduto = new ArrayList<>();   
    
   @SuppressWarnings("empty-statement")
   
    public static void main(String[] args) {
    Scanner entrada = new Scanner(System.in);
    Cliente c2 = new Cliente();
    Funcionario f2 = new Funcionario(" ", 0.0, 0, " ",0, 0.0);
    Produtos p1 = new Produtos(0.0, " ", " ", " ", 0);

    System.out.println("Digite 1 para funções do cliente 2 para funções do funcionário, 3 para a dos produtos 0 para sair");
    int result = entrada.nextInt(); 
       
    if(result == 1){
       
        int opcaoUsuario = 1;
        while (opcaoUsuario != 0) {
       
        switch(result){
        case 0:
            System.exit(result);
            break;         
        
        case 1:
            System.out.println("Digite 1 para cadastar alguém, 2 para verificar a "
            + "lista de pessoas e 3 para remover e 0 para sair da execução");
            int ver = entrada.nextInt();

           
              switch(ver){

                case 0:
                    System.exit(ver);
                    break;
                case 1: 
                    //Adiciona pessoas.
                    c2.CriarCliente();
                    listaCliente.add(c2);
                    System.out.println("Cliente adicionado!");
                    break;
                case 2:
                    //Verificar quantas pessoas tem na lista
                    System.out.println("pessoas cadastradas");
                
                    for(Cliente c: listaCliente) {
                        c.exibir();
                    }
                    break;
                    
                case 3:
                    System.out.println("Digite 1 se deseja remover por nome e 2 se deseja remover por índice");
                    int apagar = entrada.nextInt();

                    switch(apagar){
                        case 1:
                           System.out.println("Digite o nome que deseja remover");
                            String Nome = entrada.next();
                            // Removendo alguém:
                            for (Cliente c : listaCliente) {
                            if(c2.getNome().equals(Nome))
                            {
                               // Encontrou uma pessoa cadastrada com nome.

                               // Remove.
                               listaCliente.remove(c2);

                               // Sai do loop.
                               break;
                           }
                           }

                           System.out.print("Pessoas cadastradas após remoção:\n");
                           for(int i = 0; i < listaCliente.size(); i++)
                           {
                               System.out.print(listaCliente.get(i).getNome() + "\n");
                           }
                        case 2:

                           System.out.println("Digite o indice do cliente a ser apagado: ");
                           Integer indice = entrada.nextInt();

                            while (indice > listaCliente.size() || indice < 0) {
                                System.out.println("Numero de cliente invalido...");

                                System.out.println("\nDigite novamente o numero do cliente: ");
                                indice = entrada.nextInt();

                        }
                           listaCliente.remove(indice); 
                        break;
                        default:
                           System.out.println("Opcao invalida");
                        break;
                            }
                default:
                  System.out.println("Opcao invalida");
              }
            }
          }
    }
        if( result == 2){ 
           System.out.println("Digite 1 para cadastar Funcionário, 2 para verificar a "
            + "lista de Funcionários e 3 para remover e 0 para sair da execução");
            int res = entrada.nextInt();

            while(res != 0);
              switch(res){

                case 0:
                    System.exit(res);
                    break;
                case 1:  
                   //Adiciona pessoas.
                    
                    cadastroFuncionarios.add(f2.CriarFuncionario());
                    System.out.println("Funcionpario adicionado!");
                
                case 2:
                System.out.println("pessoas cadastradas");
                
                for(Cliente c: listaCliente) {
                    c.exibir();
                }
                break;
                
                case 3:
                   System.out.println("Digite 1 se deseja remover por nome e 2 se deseja remover por índice");
                    int apagar = entrada.nextInt();

                    switch(apagar){
                        case 1:
                           System.out.println("Digite o nome que deseja remover");
                            String Nome = entrada.next();
                            // Removendo alguém:
                            for (Funcionario c : cadastroFuncionarios) {
                            
                                if(f2.getNome().equals(Nome))
                                {
                               // Encontrou uma pessoa cadastrada com nome.

                               // Remove.
                               cadastroFuncionarios.remove(c2);

                               // Sai do loop.
                               break;
                               }
                           }

                           System.out.print("Pessoas cadastradas após remoção:\n");
                           for(int i = 0; i < cadastroFuncionarios.size(); i++)
                           {
                               System.out.print(cadastroFuncionarios.get(i).getNome() + "\n");
                           }
                        case 2:
                            System.out.println("Digite o indice do cliente a ser apagado: ");
                            Integer indice = entrada.nextInt();

                            while (indice > cadastroFuncionarios.size() || indice < 0) {
                                System.out.println("Numero de cliente invalido...");

                                System.out.println("\nDigite novamente o numero do cliente: ");
                                indice = entrada.nextInt();

                        }
                           cadastroFuncionarios.remove(indice); 
                        default:
                           System.out.println("Opcao invalida"); 
                            }
                    default:
                           System.out.println("Opcao invalida");
              }
        }
        if(result == 3){
            System.out.println("Digite 1 para cadastar Produto, 2 para verificar a "
            + "lista de Produtos e 3 para remover e 0 para sair da execução");
            int ver = entrada.nextInt();
            
            while(ver != 0);
            
            switch(ver){
            case 1:
              p1.CriarProdutos();
              cadastroProduto.add(p1);
            case 2:
              //Verificar quantas pessoas tem na lista
                System.out.println("deseja ver pessoas cadastradas");
                for(int i = 0; i < cadastroProduto.size(); i++)
                {
                    System.out.println(cadastroProduto.get(i).getNome());
                }
            case 3:
              
                    System.out.println("Digite 1 se deseja remover por nome e 2 se deseja remover por índice");
                    int apagar = entrada.nextInt();

                    switch(apagar){
                        
                        case 1:
                           System.out.println("Digite o nome que deseja remover");
                            String Nome = entrada.next();
                            // Removendo alguém:
                            for (Produtos c : cadastroProduto) {
                            if(p1.getNome().equals(Nome))
                            {
                               // Encontrou uma pessoa cadastrada com nome.

                               // Remove.
                               cadastroProduto.remove(p1);

                               // Sai do loop.
                               break;
                           }
                           }

                           System.out.print("Pessoas cadastradas após remoção:\n");
                           for(int i = 0; i < cadastroProduto.size(); i++)
                           {
                               System.out.print(cadastroProduto.get(i).getNome() + "\n");
                           }
                        
                        case 2:

                           System.out.println("Digite o indice do cliente a ser apagado: ");
                           Integer indice = entrada.nextInt();

                            while (indice > cadastroProduto.size() || indice < 0) {
                                System.out.println("Numero de cliente invalido...");

                                System.out.println("\nDigite novamente o numero do cliente: ");
                                indice = entrada.nextInt();

                        }
                           cadastroProduto.remove(indice); 
                        default:
                           System.out.println("Opcao invalida"); 
                            }
                default:
                  System.out.println("Opcao invalida");
              }
            }
        }
   }