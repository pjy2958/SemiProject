package com.bank.controller;

import com.bank.service.MemberService;
import com.bank.vo.MemberVO;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

public class LoginProcessController implements Controller{
    public String handleRequest(HttpServletRequest req, HttpServletResponse resp) throws Exception {
        String id = req.getParameter("id");
        String password = req.getParameter("password");

        MemberService service = new MemberService();
        MemberVO loginMember = service.loginCheck(id, password);
        // 로그인실패시
        if(loginMember == null) {
            return "redirect:/login.do";
        }
        // 로그인 성공시 세션에 등록 후 메인페이지
        HttpSession session = req.getSession();
        session.setAttribute("loginMember", loginMember);
        return "redirect:/";
    }
}
