package by.nikita.dao.ram;

import by.nikita.dao.UserDao;
import by.nikita.model.User;

import java.util.List;

/**
 * Created by niat0717 on 7/20/2017.
 */
public class UserTransientDao extends TransientDao<User, Long> implements UserDao {
    private List<User> users;

    private void initUsers() {
        // TODO: 7/20/2017 Initialize users list
    }

    protected Long getId(User entity) {
        return entity.getId();
    }
}
