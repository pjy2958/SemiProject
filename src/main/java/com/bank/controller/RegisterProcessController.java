package com.bank.controller;

import com.bank.service.MemberService;
import com.bank.vo.MemberVO;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

public class RegisterProcessController implements Controller{
    public String handleRequest(HttpServletRequest req, HttpServletResponse resp) throws Exception{
        req.setCharacterEncoding("utf-8");
        MemberVO member = new MemberVO();
        member.setId(req.getParameter("id"));
        member.setPassword(req.getParameter("password"));
        member.setName(req.getParameter("name"));
        member.setEmailID(req.getParameter("emailID"));
        member.setEmailDomain(req.getParameter("emailDomain"));
        member.setPhoneNumber(req.getParameter("phoneNumber"));
        member.setBasicAddr(req.getParameter("basicAddr"));
        member.setDetailAddr(req.getParameter("detailAddr"));
        member.setPostNumber(req.getParameter("postNumber"));
        MemberService service = new MemberService();

        service.registerMember(member);

        return "redirect:/";
    }
}
