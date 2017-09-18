/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.calculadora.dao;

/**
 *
 * @author Icaro
 */
public class Calculos {

    private long codigo;
    private int primeiro;
    private String operacao;
    private int segundo;
    private int resultado;

    /**
     * @return the primeiro
     */
    public int getPrimeiro() {
        return primeiro;
    }

    /**
     * @param primeiro the primeiro to set
     */
    public void setPrimeiro(int primeiro) {
        this.primeiro = primeiro;
    }

    /**
     * @return the segundo
     */
    public int getSegundo() {
        return segundo;
    }

    /**
     * @param segundo the segundo to set
     */
    public void setSegundo(int segundo) {
        this.segundo = segundo;
    }

    /**
     * @return the operacao
     */
    public String getOperacao() {
        return operacao;
    }

    /**
     * @param operacao the operacao to set
     */
    public void setOperacao(String operacao) {
        this.operacao = operacao;
    }

    /**
     * @return the res
     */
    public int getRes() {
        return resultado;
    }

    /**
     * @param res the res to set
     */
    public void setRes(int res) {
        this.resultado = res;
    }

    public Object[] carregarGrid() {
        return new Object[]{primeiro, getOperacao(), segundo, resultado};

    }

    /**
     * @return the codigo
     */
    public long getCodigo() {
        return codigo;
    }

    /**
     * @param codigo the codigo to set
     */
    public void setCodigo(long codigo) {
        this.codigo = codigo;
    }

}
