package DAO;

import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import javax.persistence.TypedQuery;

import model.RiigiAdminYksus;

import org.springframework.stereotype.Component;
import org.springframework.transaction.annotation.Transactional;

@Component
public class RiigiAdminYksusDAO {
	@PersistenceContext private EntityManager em;
	
	@Transactional
    public void persist(RiigiAdminYksus riigiAdminYksus) {
        em.persist(riigiAdminYksus);
    }
 
    // Retrieves all the guests:
    public List<RiigiAdminYksus> getAllRiigiAdminYksused() {
        TypedQuery<RiigiAdminYksus> query = em.createQuery(
            "SELECT g FROM RiigiAdminYksus g ORDER BY g.id", RiigiAdminYksus.class);
        return query.getResultList();
    }
}
