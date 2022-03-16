/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Entity;

import java.sql.Date;

/**
 *
 * @author davit
 */
public class Estoque {

    
    private Integer idEPI;
    private String nomeEPI;
    private String marca;
    private String tamanho;
    private Integer CA;
    private Date fabricacao;
    private Date validade;

    public Estoque(Integer idEPI, String nomeEPI, String marca, String tamanho, Integer CA, Date fabricacao, Date validade) {

        this.idEPI = idEPI;
        this.nomeEPI = nomeEPI;
        this.marca = marca;
        this.tamanho = tamanho;
        this.CA = CA;
        this.fabricacao = fabricacao;
        this.validade = validade;

    }
    public Estoque(Integer idEPI){
        this.idEPI=idEPI;
    }

 

    public Integer getIdEPI() {
        return idEPI;
    }

    public void setIdEPI(Integer idEPI) {
        this.idEPI = idEPI;
    }

    public String getNomeEPI() {
        return nomeEPI;
    }

    public void setNomeEPI(String nomeEPI) {
        this.nomeEPI = nomeEPI;
    }

    public String getMarca() {
        return marca;
    }

    public void setMarca(String marca) {
        this.marca = marca;
    }

    public String getTamanho() {
        return tamanho;
    }

    public void setTamanho(String tamanho) {
        this.tamanho = tamanho;
    }

    public Integer getCA() {
        return CA;
    }

    public void setCA(Integer CA) {
        this.CA = CA;
    }

    public Date getFabricacao() {
        return fabricacao;
    }

    public void setFabricacao(Date fabricacao) {
        this.fabricacao = fabricacao;
    }

    public Date getValidade() {
        return validade;
    }

    public void setValidade(Date validade) {
        this.validade = validade;
    }

}
