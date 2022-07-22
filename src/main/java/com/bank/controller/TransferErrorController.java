package com.bank.controller;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

public class TransferErrorController implements Controller{
    @Override
    public String handleRequest(HttpServletRequest req, HttpServletResponse resp) throws Exception {
        return "redirect:/JSP/bank/transferError.jsp";
    }
}
