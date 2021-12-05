package web.dao;

import web.model.User;

import java.util.List;

public interface UserDAO {
    List<User> getUsers();
    User find(long id); //поиск по id
    void save(User user); //сохранение
    void update(User user); //изменение
    void delete(User user); //удаление
}

