package com.bank.controller;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

public class LoginController implements Controller{
    public String handleRequest(HttpServletRequest req, HttpServletResponse resp) throws Exception {
        return "/JSP/login/login.jsp";
    }
}
