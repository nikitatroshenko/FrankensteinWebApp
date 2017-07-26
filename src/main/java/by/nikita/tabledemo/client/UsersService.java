package by.nikita.tabledemo.client;

import by.nikita.model.User;
import by.nikita.service.AbstractService;
import com.google.gwt.user.client.rpc.RemoteService;
import com.google.gwt.user.client.rpc.RemoteServiceRelativePath;

import java.util.Collection;

/**
 * Created by niat0717 on 7/20/2017.
 */
@RemoteServiceRelativePath("users")
public interface UsersService extends RemoteService {
    Collection<User> getAll();

    User getById(Long id);

    boolean update(User entity);

    boolean delete(Long id);

    User create(User entity);
}
