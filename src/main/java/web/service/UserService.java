package web.service;

import web.model.User;

import java.util.List;

public interface UserService {
    List<User> getUsers();
    User getById(long id);
    User getUserByName(String name);
    void save(User user);
    void update(User user);
    void delete(User user);
}
