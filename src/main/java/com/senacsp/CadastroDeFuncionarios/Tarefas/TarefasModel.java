package com.senacsp.CadastroDeFuncionarios.Tarefas;

import com.fasterxml.jackson.annotation.JsonIgnore;
import com.senacsp.CadastroDeFuncionarios.Funcionarios.FuncionarioModel;
import jakarta.persistence.*;

import java.time.LocalDateTime;
import java.util.List;

@Entity
@Table(name = "tb_tarefas")
public class TarefasModel {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)

    private Long id;
    private String nomeDaTarefa;
    private String descricao;
    private boolean concluida;
    private LocalDateTime dataEntrega;

    @OneToMany(mappedBy = "tarefas")
    @JsonIgnore
    private List<FuncionarioModel>funcionarios;


    public TarefasModel() {
    }

    public TarefasModel(Long id, String nomeDaTarefa, String descricao, boolean concluida, LocalDateTime dataEntrega) {
        this.id = id;
        this.nomeDaTarefa = nomeDaTarefa;
        this.descricao = descricao;
        this.concluida = concluida;
        this.dataEntrega = dataEntrega;

    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getNomeDaTarefa() {
        return nomeDaTarefa;
    }

    public void setNomeDaTarefa(String nomeDaTarefa) {
        this.nomeDaTarefa = nomeDaTarefa;
    }

    public String getDescricao() {
        return descricao;
    }

    public void setDescricao(String descricao) {
        this.descricao = descricao;
    }

    public boolean isConcluida() {
        return concluida;
    }

    public void setConcluida(boolean concluida) {
        this.concluida = concluida;
    }

    public LocalDateTime getDataEntrega() {
        return dataEntrega;
    }

    public void setDataEntrega(LocalDateTime dataEntrega) {
        this.dataEntrega = dataEntrega;
    }
}
