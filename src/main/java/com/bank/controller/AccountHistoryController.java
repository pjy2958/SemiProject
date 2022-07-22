package com.bank.controller;

import com.bank.service.BankService;
import com.bank.vo.TransactionVO;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.util.List;

public class AccountHistoryController implements Controller {
    @Override
    public String handleRequest(HttpServletRequest req, HttpServletResponse resp) throws Exception {
        BankService bankService = new BankService();
        List<TransactionVO> withdrawTransList = bankService.getWithdrawTransaction(req.getParameter("accountNo"));
        List<TransactionVO> depositTransList = bankService.getDepositTransaction(req.getParameter("accountNo"));

        req.setAttribute("withdrawTransList", withdrawTransList);
        req.setAttribute("depositTransList", depositTransList);
        return "/JSP/bank/accountHistory.jsp";
    }
}
