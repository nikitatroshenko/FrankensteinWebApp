package by.nikita.tabledemo.server;

import by.nikita.model.User;
import by.nikita.service.AbstractService;
import by.nikita.tabledemo.client.UsersService;
import com.google.gwt.user.server.rpc.RemoteServiceServlet;

import java.util.Collection;

/**
 * Created by niat0717 on 7/20/2017.
 */
public class UsersServiceImpl
        extends RemoteServiceServlet
        implements UsersService {

    private AbstractService<User, Long> service;

    public Collection<User> getAll() {
        return service.getAll();
    }

    public User getById(Long id) {
        return service.getById(id);
    }

    public boolean update(User entity) {
        return service.update(entity);
    }

    public boolean delete(Long id) {
        return service.delete(id);
    }

    public User create(User entity) {
        return service.create(entity);
    }
}
