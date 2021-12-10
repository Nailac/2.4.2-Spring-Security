package web.dao;

import org.springframework.stereotype.Repository;
import web.model.Role;
import web.model.User;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import javax.persistence.TypedQuery;
import java.util.List;

@Repository
public class RoleDAOImpl implements RoleDAO{

    //Как-нибудь реализовать @PostConstruct с Админом

    @PersistenceContext
    EntityManager entityManager;

    @Override
    public List<Role> getAllRoles() {
        return entityManager
                .createQuery("select r from Role r")
                .getResultList();
    }

    @Override
    public void add(Role role) {
        entityManager.persist(role);
    }

    @Override
    public void edit(Role role) {
        entityManager.merge(role);
    }

    @Override
    public Role getById(Long id) {
        return entityManager.find(Role.class, id);
    }

    @Override
    public Role getByName(String name) {
        TypedQuery<Role> query = entityManager
                .createQuery("SELECT role FROM Role role WHERE role.name = :role", Role.class);
        return query.setParameter("role", name)
                .getSingleResult();
    }
}
