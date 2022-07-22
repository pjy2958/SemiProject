package com.bank.dao;

import com.bank.vo.MemberVO;
import util.ConnectionFactory;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.ArrayList;
import java.util.List;

public class MemberDAO {
    /**
     * 회원가입정보 DB등록
     * @param member
     */
    public void insert(MemberVO member) {
        StringBuilder sql = new StringBuilder();
        sql.append("INSERT INTO MEMBER_TAB (ID, PASSWORD, NAME, EMAIL_ID, EMAIL_DOMAIN, PHONE_NUMBER, BASIC_ADDR, DETAIL_ADDR, POST_NUMBER) ");
        sql.append("VALUES (?, ?, ?, ?, ?, ?, ?, ?, ?)");
        try(
                Connection conn = new ConnectionFactory().getConnection();
                PreparedStatement pstmt = conn.prepareStatement(sql.toString());
                ){
            int loc = 1;
            pstmt.setString(loc++, member.getId());
            pstmt.setString(loc++, member.getPassword());
            pstmt.setString(loc++, member.getName());
            pstmt.setString(loc++, member.getEmailID());
            pstmt.setString(loc++, member.getEmailDomain());
            pstmt.setString(loc++, member.getPhoneNumber());
            pstmt.setString(loc++, member.getBasicAddr());
            pstmt.setString(loc++, member.getDetailAddr());
            pstmt.setString(loc++, member.getPostNumber());

            pstmt.executeUpdate();
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
    public List<MemberVO> selectAllMember(){
        List<MemberVO> memberList = new ArrayList<>();
        String sql = "SELECT ID, PASSWORD, NAME, EMAIL_ID, EMAIL_DOMAIN, PHONE_NUMBER, BASIC_ADDR, DETAIL_ADDR, POST_NUMBER, GRADE, REG_DATE FROM MEMBER_TAB";
        try(
                Connection conn = new ConnectionFactory().getConnection();
                PreparedStatement pstmt = conn.prepareStatement(sql);
                ){
            ResultSet rs = pstmt.executeQuery();
            while (rs.next()) {
                String id = rs.getString("ID");
                String password = rs.getString("PASSWORD");
                String name = rs.getString("NAME");
                String emailId = rs.getString("EMAIL_ID");
                String emailDomain = rs.getString("EMAIL_DOMAIN");
                String phoneNumber = rs.getString("PHONE_NUMBER");
                String basicAddr = rs.getString("BASIC_ADDR");
                String detailAddr = rs.getString("DETAIL_ADDR");
                String postNumber = rs.getString("POST_NUMBER");
                Character grade = rs.getString("GRADE").charAt(0);
                String regDate = rs.getString("REG_DATE");

                MemberVO member = new MemberVO(id, password, name, emailId, emailDomain, phoneNumber, basicAddr, detailAddr, postNumber, grade, regDate);
                memberList.add(member);
            }
            return memberList;
        } catch (Exception e) {
            e.printStackTrace();
        }
        return null;
    }
}
