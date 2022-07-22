package com.bank.controller;

import com.bank.dao.BankDAO;
import com.bank.service.BankService;
import com.bank.vo.AccountVO;
import com.bank.vo.BankVO;
import com.bank.vo.MemberVO;
import com.bank.vo.ProductVO;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;
import java.util.List;

public class TransferController implements Controller {
    @Override
    public String handleRequest(HttpServletRequest req, HttpServletResponse resp) throws Exception {
        HttpSession session = req.getSession();
        MemberVO member = (MemberVO) session.getAttribute("loginMember");

        // 로그인이 안됬을 경우
        if (member == null)
            return "redirect:/loginRequest.do";

        BankService bankService = new BankService();
        List<AccountVO> accountList = bankService.getAccountInfo(member.getId());
        List<BankVO> bankList = bankService.getBankInfo();

        req.setAttribute("accountList", accountList);
        req.setAttribute("bankList", bankList);

        return "/JSP/bank/transferForm.jsp";
    }
}
