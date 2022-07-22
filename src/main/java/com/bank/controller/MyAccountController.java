package com.bank.controller;

import com.bank.dao.BankDAO;
import com.bank.service.BankService;
import com.bank.vo.AccountVO;
import com.bank.vo.MemberVO;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;
import java.util.List;

public class MyAccountController implements Controller {
    @Override
    public String handleRequest(HttpServletRequest req, HttpServletResponse resp) throws Exception {
        HttpSession session = req.getSession();
        MemberVO member = (MemberVO) session.getAttribute("loginMember");

        if (member == null)
            return "redirect:/loginRequest.do";

        BankService bankService = new BankService();
        List<AccountVO> accountList = bankService.getAccountInfo(member.getId());
        req.setAttribute("accountList", accountList);

        return "/JSP/bank/myAccountPage.jsp";
    }
}
