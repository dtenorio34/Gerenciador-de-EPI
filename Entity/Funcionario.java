/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Entity;

import java.util.Scanner;

/**
 *
 * @author davit
 */
public class Funcionario {

    private Integer idcolaborador;
    private String nomecolaborador;
    private String estoqquecolaborador;
    private Integer idfuncao;
    private String senha;

    public Integer getIdcolaborador() {
        return idcolaborador;
    }

    public void setIdcolaborador(Integer idcolaborador) {
        this.idcolaborador = idcolaborador;
    }

    public String getNomecolaborador() {
        return nomecolaborador;
    }

    public void setNomecolaborador(String nomecolaborador) {
        this.nomecolaborador = nomecolaborador;
    }

    public String getEstoqquecolaborador() {
        return estoqquecolaborador;
    }

    public void setEstoqquecolaborador(String estoqquecolaborador) {
        this.estoqquecolaborador = estoqquecolaborador;
    }

    public Integer getIdfuncao() {
        return idfuncao;
    }

    public void setIdfuncao(Integer idfuncao) {
        this.idfuncao = idfuncao;
    }

    public String getSenha() {
        return senha;
    }

    public void setSenha(String senha) {
        this.senha = senha;
    }

}
