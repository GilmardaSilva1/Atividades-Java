/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package controle;

import java.util.ArrayList;
import model.Aluno;

/**
 *
 * @author aluno
 */
public class AlunoControl {
    
    private ArrayList<Aluno> ListaAl;

    public AlunoControl(){
        ListaAl = new ArrayList<>();
    }
    public void cadastrarAluno (int ra,String nome){
        Aluno al = new Aluno (ra,nome);
        ListaAl.add(al);
    }
    public ArrayList<Aluno> buscarTodos(){
        return ListaAl;
        
    }
    
}
