package web.dao;

import web.model.User;

import java.util.List;

public interface UserDAO {
    List<User> getUsers();
    User getById(long id); //поиск по id
    User getUserByName(String name);
    void save(User user); //сохранение
    void update(User user); //изменение
    void delete(User user); //удаление

}

