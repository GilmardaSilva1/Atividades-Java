/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package control;

import java.sql.SQLException;
import java.util.ArrayList;
import model.model;
import modelDAO.modelDAO;

/**
 *
 * @author aluno
 */
public class controle {
    
    public void cadastrarJogo(int Codigo,String Nome,String Categoria, Double preco) throws SQLException{
        System.out.println(Nome);
        System.out.println(Codigo);
        System.out.println(Categoria);
        System.out.println(preco);
        
        model m1 = new model(Codigo,Nome,Categoria);
        
        modelDAO md = new modelDAO();
        md.inserirJogo(m1);
    }
    
    public void excluirJogo(int Codigo) throws SQLException {
        modelDAO md = new modelDAO();       
        md.excluirJogo(Codigo);
        System.out.println("LLLLL");
    }
    
    public ArrayList<model> Buscar (String cod)throws SQLException{
        modelDAO mdDAO = new modelDAO();
        return (mdDAO.Buscar(cod));
    }
    
}
