/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package model;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;
/**
 *
 * @author aluno
 */
@Entity
@Table (name="DiscHib")
public class Disciplina {
    @Column (name="Disciplina", length= 100, nullable = false)
    private String descricao;
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name="codigo", unique= true , nullable = false)
    private int Codigo;
    @Column
    private int cargaHoraria;

    public String getDescricao() {
        return descricao;
    }

    public void setDescricao(String descricao) {
        this.descricao = descricao;
    }

    public int getCodigo() {
        return Codigo;
    }

    public void setCodigo(int Codigo) {
        this.Codigo = Codigo;
    }

    public int getCargaHoraria() {
        return cargaHoraria;
    }

    public void setCargaHoraria(int cargaHoraria) {
        this.cargaHoraria = cargaHoraria;
    }

    public Disciplina(String descricao, int Codigo, int cargaHoraria) {
        this.descricao = descricao;
        this.Codigo = Codigo;
        this.cargaHoraria = cargaHoraria;
    }

    public Disciplina() {
    }
    
    
    
    
}
