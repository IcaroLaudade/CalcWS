/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package calculos.ejb;

import br.calculadora.bo.Calculos;
import br.com.dao.CalculosDAO;
import java.util.List;
import javax.ejb.Stateless;
import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;

/**
 *
 * @author Icaro
 */
@Stateless
public class CalculosBean implements CalculosRemote {

    @PersistenceContext(unitName = "CalculadoraWebServicePU")
    private EntityManager em;

    @Override
    public void salvar(Calculos calculo) throws Exception {
    
        CalculosDAO dao = new CalculosDAO(em);
        dao.salvar(calculo);
    }

    @Override
    public void remover(Long codigo) {
        CalculosDAO dao = new CalculosDAO(em);
        dao.remover(codigo);
    }

    @Override
    public Calculos consultarPorId(Long codigo) {
        CalculosDAO dao = new CalculosDAO(em);
        return dao.consultarPorId(codigo);
    }

    @Override
    public List<Calculos> consultarTodos() {
        CalculosDAO dao = new CalculosDAO(em);
        return dao.consultarTodos();
    }

}
