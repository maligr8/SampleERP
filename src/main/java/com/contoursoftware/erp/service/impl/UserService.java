package com.contoursoftware.erp.service.impl;

import com.contoursoftware.erp.db.admin.dao.UserDAO;
import com.contoursoftware.erp.db.admin.dto.UserDTO;
import com.contoursoftware.erp.service.Service;

public class UserService implements Service<UserDTO> {


    @Override
    public void save(UserDTO obj) {

        // TODO: Factory DAO
        if (validate(obj))
            new UserDAO().save(obj);
    }

    public boolean validate(UserDTO obj){
        return false;
    }
}
