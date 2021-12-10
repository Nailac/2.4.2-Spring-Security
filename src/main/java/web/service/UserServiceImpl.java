package web.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;
import web.dao.UserDAO;
import web.model.User;


import java.util.List;

@Service
public class UserServiceImpl implements UserService{

    final UserDAO userDAO;

    @Autowired
    public UserServiceImpl(UserDAO userDAO) {
        this.userDAO = userDAO;
    }

    @Override
    public User getUserByName(String name) {
        return userDAO.getUserByName(name);
    }


    @Override
    public List<User> getUsers() {
        return userDAO.getUsers();
    }


    @Override
    public User getById(long id) {
        return userDAO.getById(id);
    }


    @Override
    public void save(User user) {
        userDAO.save(user);
    }

    @Override
    public void update(User user) {
        userDAO.update(user);
    }

    @Transactional
    @Override
    public void delete(User user) {
        userDAO.delete(user);
    }
}
