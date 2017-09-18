/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package calculos.ejb;

import br.calculadora.bo.Calculos;
import java.util.List;
import javax.ejb.Local;
import javax.ejb.Remote;

/**
 *
 * @author Icaro
 */
@Local
public interface CalculosRemote {

    public void salvar(Calculos calculo) throws Exception;

    public void remover(Long codigo);

    public Calculos consultarPorId(Long codigo);

    public List<Calculos> consultarTodos();

}
