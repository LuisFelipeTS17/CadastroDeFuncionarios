package com.senacsp.CadastroDeFuncionarios.Tarefas;

import com.fasterxml.jackson.annotation.JsonIgnore;
import com.senacsp.CadastroDeFuncionarios.Funcionarios.FuncionarioModel;
import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import java.time.LocalDateTime;
import java.util.List;

@Entity
@Table(name = "tb_tarefas")
@NoArgsConstructor
@AllArgsConstructor
@Getter
@Setter
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

    public TarefasModel(Long id, String nomeDaTarefa, String descricao, boolean concluida, LocalDateTime dataEntrega) {
        this.id = id;
        this.nomeDaTarefa = nomeDaTarefa;
        this.descricao = descricao;
        this.concluida = concluida;
        this.dataEntrega = dataEntrega;

    }


}
