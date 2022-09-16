/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package modelDAO;

import connection.connection;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import model.model;

/**
 *
 * @author aluno
 */
public class modelDAO {
    Connection con;
    
    public void inserirJogo(model m1) throws SQLException{
        con = new connection().getConnection();
        String sql = "Insert into AtividadeJava (Codigo,Nome,Categoria) values (?,?,?)";
        PreparedStatement stmt = con.prepareStatement(sql);
        stmt.setInt(1, m1.getCodigo());
        stmt.setString(2, m1.getNome());
        
        stmt.setString(3,m1.getCategoria());    
        stmt.execute();
        stmt.close();
        con.close();
    }
    public void excluirJogo(int Codigo) throws SQLException{
        con = new connection().getConnection();
        String sql = "DELETE FROM AtividadeJava WHERE Codigo = ?";
        PreparedStatement stmt = con.prepareStatement(sql);
        stmt.setInt(1, Codigo);
        stmt.execute();
        stmt.close();
        con.close();
    }
    public ArrayList<model> Buscar(String cod) throws SQLException {
        ResultSet rs;
        ArrayList<model> lista = new ArrayList();
        con = new connection().getConnection();
        String sql = "SELECT * FROM AtividadeJava WHERE Codigo like ?";
        PreparedStatement stmt = con.prepareStatement(sql);
        stmt.setString(1,cod);
        rs =  stmt.executeQuery();
        while (rs.next()){
            int Codigo = rs.getInt("Codigo");
            String nome = rs.getString("Nome");
            String Categoria = rs.getString("Categoria");
            model md =  new model(Codigo,nome,Categoria);
            lista.add(md);
        }
        stmt.close();
        con.close();
        return lista;
    }

    
}
