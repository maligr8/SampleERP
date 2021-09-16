package com.contoursoftware.erp.commons.db.dao;

public interface DataAccessObject<T> {

    T get(T obj);

    void save(T obj);

    void update(T obj);

    boolean delete(T obj);
}
