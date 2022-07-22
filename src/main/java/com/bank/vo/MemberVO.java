package com.bank.vo;

public class MemberVO {
    private String id;          //회원아이디
    private String password;    //회원비밀번호
    private String name;        //회원이름
    private String emailID;     //이메일아이디
    private String emailDomain; //이메일도메인
    private String phoneNumber; //회원전화번호
    private String basicAddr;   //기본주소
    private String detailAddr;  //상세주소
    private String postNumber;  //우편번호
    private Character grade;    //회원등급      'N' -> 일반회원, 'M' -> 관리자
    private String regDate;    //회원가입일


    public MemberVO() {
    }


    public MemberVO(String id, String password, String name, String emailID, String emailDomain, String phoneNumber, String basicAddr, String detailAddr, String postNumber) {
        this.id = id;
        this.password = password;
        this.name = name;
        this.emailID = emailID;
        this.emailDomain = emailDomain;
        this.phoneNumber = phoneNumber;
        this.basicAddr = basicAddr;
        this.detailAddr = detailAddr;
        this.postNumber = postNumber;
    }

    public MemberVO(String id, String password, String name, String emailID, String emailDomain, String phoneNumber, String basicAddr, String detailAddr, String postNumber, Character grade, String regDate) {
        this.id = id;
        this.password = password;
        this.name = name;
        this.emailID = emailID;
        this.emailDomain = emailDomain;
        this.phoneNumber = phoneNumber;
        this.basicAddr = basicAddr;
        this.detailAddr = detailAddr;
        this.postNumber = postNumber;
        this.grade = grade;
        this.regDate = regDate;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getEmailID() {
        return emailID;
    }

    public void setEmailID(String emailID) {
        this.emailID = emailID;
    }

    public String getEmailDomain() {
        return emailDomain;
    }

    public void setEmailDomain(String emailDomain) {
        this.emailDomain = emailDomain;
    }

    public String getPhoneNumber() {
        return phoneNumber;
    }

    public void setPhoneNumber(String phoneNumber) {
        this.phoneNumber = phoneNumber;
    }

    public String getBasicAddr() {
        return basicAddr;
    }

    public void setBasicAddr(String basicAddr) {
        this.basicAddr = basicAddr;
    }

    public String getDetailAddr() {
        return detailAddr;
    }

    public void setDetailAddr(String detailAddr) {
        this.detailAddr = detailAddr;
    }

    public String getPostNumber() {
        return postNumber;
    }

    public void setPostNumber(String postNumber) {
        this.postNumber = postNumber;
    }

    public Character getGrade() {
        return grade;
    }

    public void setGrade(Character grade) {
        this.grade = grade;
    }

    public String getRegDate() {
        return regDate;
    }

    public void setRegDate(String regDate) {
        this.regDate = regDate;
    }

    @Override
    public String toString() {
        return "MemberVO{" +
                "id='" + id + '\'' +
                ", password='" + password + '\'' +
                ", name='" + name + '\'' +
                ", emailID='" + emailID + '\'' +
                ", emailDomain='" + emailDomain + '\'' +
                ", phoneNumber='" + phoneNumber + '\'' +
                ", basicAddr='" + basicAddr + '\'' +
                ", detailAddr='" + detailAddr + '\'' +
                ", postNumber='" + postNumber + '\'' +
                ", grade=" + grade +
                ", regDate='" + regDate + '\'' +
                '}';
    }
}


