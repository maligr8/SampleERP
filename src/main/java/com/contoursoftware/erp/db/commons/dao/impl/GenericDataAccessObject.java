package com.contoursoftware.erp.db.commons.dao.impl;

import com.contoursoftware.erp.db.commons.dao.DataAccessObject;

public class GenericDataAccessObject<T> implements DataAccessObject<T> {


    @Override
    public T get(T obj) {
        return null;
    }

    @Override
    public void save(T obj) {

    }

    @Override
    public void update(T obj) {

    }

    @Override
    public boolean delete(T obj) {
        return false;
    }
}
