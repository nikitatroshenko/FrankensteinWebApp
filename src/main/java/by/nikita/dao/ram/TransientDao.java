package by.nikita.dao.ram;

import by.nikita.dao.AbstractDao;

import java.util.*;

/**
 * Created by niat0717 on 7/20/2017.
 */
public abstract class TransientDao<E, K> implements AbstractDao<E, K> {
    private Map<K, E> repository;

    public TransientDao() {
        repository = new HashMap<K, E>();
    }

    public Collection<E> getAll() {
        return repository.values();
    }

    public E getById(K id) {
        return repository.get(id);
    }

    protected abstract K getId(E entity);

    public boolean update(E entity) {
        K id = getId(entity);

        if (!repository.containsKey(id)) {
            return false;
        }

        repository.put(id, entity);

        return true;
    }

    public boolean delete(K id) {
        return repository.remove(id) != null;
    }

    public E create(E entity) {
        K id = getId(entity);

        if (repository.containsKey(id)) {
            throw new IllegalArgumentException("Id exists");
        }

        repository.put(id, entity);

        return entity;
    }
}
