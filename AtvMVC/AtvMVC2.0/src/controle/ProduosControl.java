/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package controle;

import java.util.ArrayList;
import model.Produtos;

/**
 *
 * @author aluno
 */
public class ProduosControl {
    
    private final ArrayList<Produtos> ListaPR;

    public ProduosControl(){
        ListaPR = new ArrayList<>();
    }
    public void cadastrarProduto (int cod,String descricao, float preco){
        Produtos PR = new Produtos (cod, descricao, preco);
        ListaPR.add(PR);
    }
    public void excluir (String descricao){
        for(Produtos a: ListaPR){
            if (a.getDescricao().equals(descricao))
            {
                ListaPR.remove(a);
                break;
            }
        }
    }
    public ArrayList<Produtos> buscarTodos(){
        return ListaPR;
        
    }
    
}
