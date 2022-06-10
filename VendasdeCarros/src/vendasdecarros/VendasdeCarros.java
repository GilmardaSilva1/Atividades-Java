package vendasdecarros;

import java.util.ArrayList;
import java.util.Scanner;

/**
 *
 * @author aluno
 */
public class VendasdeCarros/* extends Cliente*/ {

    static ArrayList<Cliente> listaCliente = new ArrayList<Cliente>();
    static ArrayList<Funcionario> cadastroFuncionarios = new ArrayList<>();
    static ArrayList<Produtos> cadastroProduto = new ArrayList<>();

    public static void main(String[] args) {
        try ( Scanner entrada = new Scanner(System.in)) {
            Cliente c2 = new Cliente();
            Funcionario f2 = new Funcionario();
            Produtos p1 = new Produtos();

            System.out.println("Digite 1 para funções do cliente 2 para funções do funcionário,"
                    + " 3 para a dos produtos 0 para sair");
            int result = entrada.nextInt();

            if (result == 1) {

                int opcaoUsuario = 1;
                while (opcaoUsuario != 0) {

                    switch (result) {
                        case 0:
                            System.exit(result);
                            break;

                        case 1:
                            System.out.println("Digite 1 para cadastar alguém, 2 para verificar a "
                                    + "lista de pessoas e 3 para remover, 4 para buscar cliente, 5 para ver o cliente mais velho,"
                                    + " 6 para ver o cliente cliente Mais Novo e 0 para sair da execução ");
                            int ver = entrada.nextInt();

                            switch (ver) {

                                case 0:
                                    System.exit(ver);
                                    break;
                                case 1:
                                    //Adiciona pessoas.
                                    c2 = c2.CriarCliente();
                                    listaCliente.add(c2);
                                    System.out.println("Cliente adicionado!");
                                    break;
                                case 2:
                                    //Verificar quantas pessoas tem na lista
                                    System.out.println("pessoas cadastradas");

                                    for (Cliente c : listaCliente) {
                                        c.exibir();
                                    }
                                    break;

                                case 3:
                                    System.out.println("Digite 1 se deseja remover por nome e 2 se deseja remover por índice");
                                    int apagar = entrada.nextInt();

                                    switch (apagar) {
                                        case 1:
                                            System.out.println("Digite o nome que deseja remover");
                                            String Nome = entrada.next();
                                            // Removendo alguém:
                                            for (Cliente c : listaCliente) {
                                                if (c2.getNome().equals(Nome)) {
                                                    // Encontrou uma pessoa cadastrada com nome.

                                                    // Remove.
                                                    listaCliente.remove(c2);

                                                    // Sai do loop.
                                                    break;
                                                }
                                                break;
                                            }

                                            System.out.print("Pessoas cadastradas após remoção:\n");

                                            for (Cliente c : listaCliente) {
                                                c.exibir();
                                            }
                                            break;
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
                                    break;
                                case 4:

                                    System.out.println("Para realizar a busca, digite, no minimo parte do nome do cliente: ");
                                    String busccliIniciais = entrada.next();

                                    for (Cliente c : listaCliente) {
                                        if (c.getNome().startsWith(busccliIniciais)) {
                                            c.exibir();
                                        }

                                    }
                                    break;
                                
                                case 5:
                                    Cliente clienteMaisVelho = listaCliente.get(0);
                                    for (Cliente c : listaCliente) {
                                            if (clienteMaisVelho.getIdade() < c.getIdade()) {
                                                    clienteMaisVelho=c;
                                            }
                                    }
                                   // clienteMaisVelho.exibir();
                                case 6: 
                                    Cliente clienteMaisNovo = listaCliente.get(0);
                                    for (Cliente c : listaCliente) {
                                        if (clienteMaisNovo.getIdade() > c.getIdade()) {
                                           c.exibir();
                                            }
                                    }
                                     
                                default:
                                    System.out.println("Opcao invalida");
                            }
                    }
                }
            }
            if (result == 2) {
                System.out.println("Digite 1 para cadastar Funcionário, 2 para verificar a "
                        + "lista de Funcionários e 3 para remover, 4 para buscar por nome e 0 para sair da execução");
                int res = entrada.nextInt();

                while (res != 0) {
                    switch (res) {

                        case 0:
                            System.exit(res);
                            break;
                        case 1:
                            //Adiciona pessoas.
                            f2 = f2.CriarFuncionario();
                            cadastroFuncionarios.add(f2);
                            System.out.println("Produto adicionado!");
                            System.out.println("============================");
                            
                            break;

                        case 2:
                            System.out.println("pessoas cadastradas");

                            cadastroFuncionarios.forEach((c) -> {
                                c.exibir();
                            });
                            break;

                        case 3:

                            System.out.println("Digite 1 se deseja remover por nome e 2 se deseja remover por índice");
                            int apagar = entrada.nextInt();

                            switch (apagar) {
                                case 1:
                                    System.out.println("Digite o nome que deseja remover");
                                    String Nome = entrada.next();
                                    // Removendo alguém:
                                    for (Funcionario c : cadastroFuncionarios) {

                                        if (f2.getNome().equals(Nome)) {
                                            // Encontrou uma pessoa cadastrada com nome.

                                            // Remove.
                                            cadastroFuncionarios.remove(f2);

                                            // Sai do loop.
                                            break;
                                        }
                                        break;
                                    }

                                    System.out.print("Produtos cadastradas após remoção:\n");
                                    for (int i = 0; i < cadastroFuncionarios.size(); i++) {
                                        System.out.print(cadastroFuncionarios.get(i).getNome() + "\n");

                                    }
                                    break;
                                case 2:
                                    System.out.println("Digite o indice do cliente a ser apagado: ");
                                    Integer indice = entrada.nextInt();

                                    while (indice > cadastroFuncionarios.size() || indice < 0) {
                                        System.out.println("Numero de cliente invalido...");

                                        System.out.println("\nDigite novamente o numero do cliente: ");
                                        indice = entrada.nextInt();

                                    }
                                    cadastroFuncionarios.remove(indice);
                                    break;
                                default:
                                    System.out.println("Opcao invalida");
                            }
                            break;
                        case 4:

                            System.out.println("Para realizar a busca, digite, no minimo parte do nome do cliente: ");
                            String buscFuncionario = entrada.next();

                            for (Funcionario f : cadastroFuncionarios) {
                                if (f.getNome().startsWith(buscFuncionario)) {
                                    f.exibir();
                                }
                                break;
                            }
                            break;
                        default:
                            System.out.println("Opcao invalida");
                    }

                    System.out.println("Digite 1 para cadastar Funcionário, 2 para verificar a "
                            + "lista de Funcionários, 3 para remover, 4 para buscar pelo nome o "
                            + "produto, 5 para buscar pela descrçãoa e 0 para sair da execução");
                    res = entrada.nextInt();
                }
            }
            if (result == 3) {
                System.out.println("Digite 1 para cadastar Produto, 2 para verificar a "
                            + "lista de Produtos, 3 para remover, 4 para buscar pelo nome o "
                            + "produto, 5 para buscar pela descrção, 6 para buscar pela preço e 0 para sair da execução e 0 para sair da execução");
                int ver = entrada.nextInt();

                while (ver != 0) {

                    switch (ver) {
                        case 1:
                           
                            p1 = (p1.CriarProdutos());
                            cadastroProduto.add(p1);
                            System.out.println("Produto adicionado!");
                            System.out.println("============================");
                            break;
                        case 2:
                            //Verificar quantos produtos tem na lista
                            System.out.println("Produtos cadastrados");
                           cadastroProduto.forEach((p) -> {
                                p.exibir();
                            });
                           break;
                        case 3:

                            System.out.println("Digite 1 se deseja remover por nome e 2 se deseja"
                                    + " remover por índice");
                            int apagar = entrada.nextInt();

                            switch (apagar) {

                                case 1:
                                    System.out.println("Digite o nome que deseja remover");
                                    String Nome = entrada.next();
                                    // Removendo alguém:
                                    for (Produtos c : cadastroProduto) {
                                        if (p1.getNome().equals(Nome)) {
                                            // Encontrou uma pessoa cadastrada com nome.

                                            // Remove.
                                            cadastroProduto.remove(p1);

                                            // Sai do loop.
                                            break;
                                        }
                                    }

                                    System.out.print("Pessoas cadastradas após remoção:\n");
                                    for (int i = 0; i < cadastroProduto.size(); i++) {
                                        System.out.print(cadastroProduto.get(i)+ "\n");
                                        p1.exibir();
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
                                    break;
                                default:
                                    System.out.println("Opcao invalida");
                            }
                            break;
                            
                        case 4:

                            System.out.println("Para realizar a busca, digite, no minimo parte do nome do produto: ");
                            String busccGFuncionario = entrada.next();

                            for (Produtos p : cadastroProduto) {
                                if (p.getNome().startsWith(busccGFuncionario)) {
                                    p.exibir();
                                break;
                                }
                            } break;
                        case 5:
                            System.out.println("Para realizar a busca, digite, no minimo, parte da descricao do carro: ");
                            String produtoIniciaiss = entrada.next();
                            entrada.nextLine();

                            for (Produtos p : cadastroProduto) {
                                if (p1.getDescricao().startsWith(produtoIniciaiss)) {
                                    p1.exibir();
                                }
                            }
                             break;
                        case 6:
                            System.out.println("Para realizar a busca digite o preco do carro: ");
                            double produtoPreco = entrada.nextDouble();

                            for (Produtos p : cadastroProduto) {
                                if (p.getPreco() == produtoPreco) {
                                    p.exibir();
                                }
                            }                   
                            default:
		             System.out.println("Opcao invalida");
                            
                             break;
                                  
                    }
                           System.out.println("Digite 1 para cadastar Protudo, 2 para verificar a "
                            + "lista de Produtos, 3 para remover, 4 para buscar pelo nome o "
                            + "produto, 5 para buscar pela descrçãoa, 6 para buscar pela preço e 0 para sair da execução");
                            ver = entrada.nextInt();
		        }
                        
		}
        }
    }
}
        
   
