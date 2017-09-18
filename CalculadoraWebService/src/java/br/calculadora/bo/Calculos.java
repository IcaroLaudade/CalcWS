/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.calculadora.bo;

import java.io.Serializable;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.*;
import javax.persistence.NamedQueries;
import javax.persistence.NamedQuery;
import javax.persistence.SequenceGenerator;

/**
 *
 * @author Icaro
 */
@Entity
@SequenceGenerator(name = "CALCULOS_SEQ", sequenceName = "CALCULOS_SEQ",
        allocationSize = 1, initialValue = 1)
@NamedQueries({
@NamedQuery(name = "Calculos.consultarTodos",
query = "SELECT c FROM Calculos c"
)
})
public class Calculos implements Serializable {

    @Id
    @GeneratedValue(strategy = GenerationType.SEQUENCE,
            generator = "CALCULOS_SEQ")
    private Long codigo;
    private int primeiro;
    private char operacao;
    private int segundo;

    private int resultado;

    public Calculos() {
    }

    public Calculos(Long id, int primeiro, int segundo, char operador, int resultado) {
        this.codigo = id;
        this.primeiro = primeiro;
        this.segundo = segundo;
        this.operacao = operador;
        this.resultado = resultado;
    }

    public int getPrimeiro() {
        return primeiro;
    }

    public void setPrimeiro(int primeiro) {
        this.primeiro = primeiro;
    }

    public int getSegundo() {
        return segundo;
    }

    public void setSegundo(int segundo) {
        this.segundo = segundo;
    }

    public char getOperacao() {
        return operacao;
    }

    public void setOperacao(char operacao) {
        this.operacao = operacao;
    }

    public int getRes() {
        return resultado;
    }

    public void setRes(int res) {
        this.resultado = res;
    }

    public Long getCodigo() {
        return codigo;
    }

    public void setCodigo(Long codigo) {
        this.codigo = codigo;
    }
}
