package com.contoursoftware.erp.db.admin.dao;

import com.contoursoftware.erp.commons.db.dao.DataAccessObject;
import com.contoursoftware.erp.db.admin.dto.UserDTO;

import java.util.ArrayList;

public class UserDAO implements DataAccessObject<UserDTO> {

    public static ArrayList<UserDTO> userDTOList = new ArrayList<>();

    @Override
    public UserDTO get(UserDTO obj) {
        return userDTOList.get(0);
    }

    @Override
    public void save(UserDTO obj) {
        userDTOList.add(obj);
    }

    @Override
    public void update(UserDTO obj) {
        userDTOList.get(0);
    }

    @Override
    public boolean delete(UserDTO obj) {
        return false;
    }
}
