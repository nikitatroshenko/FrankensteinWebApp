package by.nikita.service.impl;

import by.nikita.dao.AbstractDao;
import by.nikita.service.AbstractService;

import java.util.Collection;

/**
 * Created by niat0717 on 7/20/2017.
 */
public class AbstractServiceImpl<E, K> implements AbstractService<E, K> {
    private AbstractDao<E, K> dao;

    public AbstractServiceImpl(AbstractDao<E, K> dao) {
        this.dao = dao;
    }

    public Collection<E> getAll() {
        return dao.getAll();
    }

    public E getById(K id) {
        return dao.getById(id);
    }

    public boolean update(E entity) {
        return dao.update(entity);
    }

    public boolean delete(K id) {
        return dao.delete(id);
    }

    public E create(E entity) {
        return dao.create(entity);
    }
}
