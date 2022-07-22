package com.bank.controller;

import com.bank.service.BankService;
import com.bank.vo.MemberVO;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

public class OpenAccountController implements Controller {
    public String handleRequest(HttpServletRequest req, HttpServletResponse resp) throws Exception {
        HttpSession session = req.getSession();
        MemberVO member = (MemberVO) session.getAttribute("loginMember");

        BankService bankService = new BankService();
        req.setAttribute("productList", bankService.getProductCode());

        if (member == null)
            return "redirect:/loginRequest.do";
        return "/JSP/bank/openAccount.jsp";
    }
}
