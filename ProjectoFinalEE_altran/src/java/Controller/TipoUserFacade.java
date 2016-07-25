/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Controller;

import Model.TipoUser;
import javax.ejb.Stateless;
import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;

/**
 *
 * @author João
 */
@Stateless
public class TipoUserFacade extends AbstractFacade<TipoUser> {

    @PersistenceContext(unitName = "ProjectoFinalEE_altranPU")
    private EntityManager em;

    @Override
    protected EntityManager getEntityManager() {
        return em;
    }

    public TipoUserFacade() {
        super(TipoUser.class);
    }
    
}
