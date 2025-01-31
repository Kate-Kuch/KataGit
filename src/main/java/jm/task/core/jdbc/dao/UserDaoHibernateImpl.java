package jm.task.core.jdbc.dao;

import jm.task.core.jdbc.model.User;

import java.util.Collections;
import java.util.List;

public class UserDaoHibernateImpl implements UserDao {
    public UserDaoHibernateImpl() {
        // no-op
    }

    @Override
    public void createUsersTable() {
        // no-op
    }

    @Override
    public void dropUsersTable() {
        // no-op
    }

    @Override
    public void saveUser(String name, String lastName, byte age) {
        // no-op
    }

    @Override
    public void removeUserById(long id) {
        // no-op
    }

    @Override
    public List<User> getAllUsers() {
        return null;
    }

    @Override
    public void cleanUsersTable() {
        // no-op
    }
}
