package com.contoursoftware.erp.ui.admin.controller;

import com.contoursoftware.erp.db.admin.dto.UserDTO;
import com.contoursoftware.erp.service.impl.UserService;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.annotation.*;
import java.io.IOException;

@WebServlet(name = "UserEditServlet", value = "/UserEditServlet")
public class UserEditServlet extends HttpServlet {
    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {

        //TODO: Factory service
        new UserService().save(new UserDTO());
    }

    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {

    }
}
