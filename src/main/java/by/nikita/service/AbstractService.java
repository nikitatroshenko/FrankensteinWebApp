package by.nikita.service;

import java.util.Collection;

/**
 * Created by niat0717 on 7/20/2017.
 */
public interface AbstractService<E, K> {
    Collection<E> getAll();
    E getById(K id);
    boolean update(E entity);
    boolean delete(K id);
    E create(E entity);
}
