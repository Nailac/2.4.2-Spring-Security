package web.dao;

import web.model.Role;

import java.util.List;

public interface RoleDAO {
    List<Role> getAllRoles();
    public void add(Role role);
    public void edit(Role role);
    Role getById(Long id);
    Role getByName(String name);
}
