package com.bank.service;

import com.bank.dao.MemberDAO;
import com.bank.vo.MemberVO;

import java.util.List;

public class MemberService {
    private MemberDAO memberDAO;
    public MemberService() {
        this.memberDAO = new MemberDAO();
    }
    /**
     * 회원가입
     * @param member 사용자입력 회원정보VO
     */
    public void registerMember(MemberVO member){
        memberDAO.insert(member);
    }
    /**
     * 로그인 확인
     * @param id    회원id
     * @param password  회원password
     * @return  로그인 회원VO
     */
    public MemberVO loginCheck(String id, String password) {
        List<MemberVO> memberList = memberDAO.selectAllMember();
        for (MemberVO member : memberList) {
            if (member.getId().equals(id) && member.getPassword().equals(password))
                return member;
        }
        return null;
    }
}
