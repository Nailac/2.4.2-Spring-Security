package web.service;

import web.model.Role;

import java.util.List;

public interface RoleService {
    List<Role> getAllRoles();
    void add(Role role);
    void edit(Role role);
    Role getById(Long id);
    Role getByName(String name);
}