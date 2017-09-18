/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.com.dao;

import br.calculadora.bo.Calculos;
import java.util.List;
import javax.persistence.EntityManager;
import javax.persistence.Query;

/**
 *
 * @author Icaro
 */
public class CalculosDAO {

    private EntityManager em;

    public CalculosDAO(EntityManager em) {
        this.em = em;
    }

    public void salvar(Calculos c) throws Exception {

        em.persist(c);

    }

    public void remover(Long id) {
        Calculos c = em.find(Calculos.class, id);
        em.remove(c);
    }

    public Calculos consultarPorId(Long id) {
        return em.find(Calculos.class, id);
    }

    public List<Calculos> consultarTodos() {
        Query q = em.createNamedQuery("Calculos.consultarTodos");
        return q.getResultList();
    }
}
