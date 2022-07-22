package com.bank.controller;

import com.bank.service.BankService;
import com.bank.vo.MemberVO;
import com.bank.vo.TransactionVO;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

public class TransferProcessController implements Controller {
    @Override
    public String handleRequest(HttpServletRequest req, HttpServletResponse resp) throws Exception {
        req.setCharacterEncoding("utf-8");
        HttpSession session = req.getSession();
        MemberVO member = (MemberVO) session.getAttribute("loginMember");

        if(!req.getParameter("depositBankCode").equals("002"))
            return "/transferError.do";
        TransactionVO transaction = new TransactionVO();
        transaction.setDepositAccountNo(req.getParameter("depositAccountNo"));
        transaction.setDepositBankCode(req.getParameter("depositBankCode"));
        transaction.setDepositTransMemo(req.getParameter("depositTransMemo"));
        transaction.setTransAmount(Integer.valueOf(req.getParameter("transAmount")));
        transaction.setWithdrawAccountNo(req.getParameter("withdrawAccountNo"));
        transaction.setWithdrawBankCode("002");
        transaction.setWithdrawTransMemo(req.getParameter("withdrawTransMemo"));

        System.out.println(transaction.toString());
        BankService bankService = new BankService();
        bankService.accountTransfer(transaction);

        return "redirect:/";
    }
}
