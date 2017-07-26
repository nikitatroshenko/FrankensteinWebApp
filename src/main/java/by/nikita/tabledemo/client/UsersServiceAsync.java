package by.nikita.tabledemo.client;

import by.nikita.model.User;
import com.google.gwt.user.client.rpc.AsyncCallback;
import com.google.gwt.user.client.rpc.RemoteService;
import com.google.gwt.user.client.rpc.RemoteServiceRelativePath;

import java.util.Collection;

public interface UsersServiceAsync {
    void getAll(AsyncCallback<Collection<User>> async);

    void getById(Long id, AsyncCallback<User> async);

    void update(User entity, AsyncCallback<Boolean> async);

    void delete(Long id, AsyncCallback<Boolean> async);

    void create(User entity, AsyncCallback<User> async);
}
