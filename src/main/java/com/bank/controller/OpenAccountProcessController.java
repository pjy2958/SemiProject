package com.bank.controller;

import com.bank.service.BankService;
import com.bank.vo.AccountVO;
import com.bank.vo.MemberVO;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

public class OpenAccountProcessController implements Controller {
    public String handleRequest(HttpServletRequest req, HttpServletResponse resp) throws Exception {
        HttpSession session = req.getSession();
        MemberVO member = (MemberVO) session.getAttribute("loginMember");

        req.setCharacterEncoding("utf-8");
        AccountVO account = new AccountVO();
        account.setBankCode("002");
        account.setId(member.getId());
        account.setPassword(req.getParameter("password"));
        account.setAccountName(req.getParameter("accountName"));
        account.setProductCode(req.getParameter("productCode"));

        BankService bankService = new BankService();
        bankService.openAccount(account);
        return "redirect:/";
    }
}
