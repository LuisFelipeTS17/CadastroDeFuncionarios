package com.senacsp.CadastroDeFuncionarios.Model;

import jakarta.persistence.*;


@Entity
@Table(name = "tb_cadastro")
public class FuncionarioModel {

   @Id
   @GeneratedValue(strategy = GenerationType.IDENTITY)

    private Long id;
    private int idade;
    private String email;
    private String nome;

    public FuncionarioModel() {
    }

    public FuncionarioModel(int idade, String email, String nome) {
        this.idade = idade;
        this.email = email;
        this.nome = nome;
    }

    public int getIdade() {
        return idade;
    }

    public String getEmail() {
        return email;
    }

    public String getNome() {
        return nome;
    }

    public void setIdade(int idade) {
        this.idade = idade;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }
}
