/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Controller;

import Model.Resposta;
import javax.ejb.Stateless;
import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;

/**
 *
 * @author João
 */
@Stateless
public class RespostaFacade extends AbstractFacade<Resposta> {

    @PersistenceContext(unitName = "ProjectoFinalEE_altranPU")
    private EntityManager em;

    @Override
    protected EntityManager getEntityManager() {
        return em;
    }

    public RespostaFacade() {
        super(Resposta.class);
    }
    
}
