package com.bank.controller;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

public class LoginRequestController implements Controller {
    public String handleRequest(HttpServletRequest req, HttpServletResponse resp) throws Exception {
        return "/JSP/login/loginRequest.jsp";
    }
}
