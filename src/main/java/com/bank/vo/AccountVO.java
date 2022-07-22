package com.bank.vo;

public class AccountVO {
    private String accountNo;   //계좌번호
    private String bankCode;    //은행번호
    private String id;          //아이디
    private String password;    //비밀번호
    private int balance;        //잔액
    private String accountName; //계좌별칭
    private String productCode; //상품코드
    private String openingDate; //계좌개설일

    public AccountVO() {
    }

    public AccountVO(String accountNo, String bankCode, String id, String password, int balance, String accountName, String productCode) {
        this.accountNo = accountNo;
        this.bankCode = bankCode;
        this.id = id;
        this.password = password;
        this.balance = balance;
        this.accountName = accountName;
        this.productCode = productCode;
    }

    public String getAccountNo() {
        return accountNo;
    }

    public void setAccountNo(String accountNo) {
        this.accountNo = accountNo;
    }

    public String getBankCode() {
        return bankCode;
    }

    public void setBankCode(String bankCode) {
        this.bankCode = bankCode;
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

    public int getBalance() {
        return balance;
    }

    public void setBalance(int balance) {
        this.balance = balance;
    }

    public String getAccountName() {
        return accountName;
    }

    public void setAccountName(String accountName) {
        this.accountName = accountName;
    }

    public String getProductCode() {
        return productCode;
    }

    public void setProductCode(String productCode) {
        this.productCode = productCode;
    }

    public String getOpeningDate() {
        return openingDate;
    }

    public void setOpeningDate(String openingDate) {
        this.openingDate = openingDate;
    }

    @Override
    public String toString() {
        return "AccountVO{" +
                "accountNo='" + accountNo + '\'' +
                ", bankCode='" + bankCode + '\'' +
                ", id='" + id + '\'' +
                ", password='" + password + '\'' +
                ", balance=" + balance +
                ", accountName='" + accountName + '\'' +
                ", productCode='" + productCode + '\'' +
                ", openingDate='" + openingDate + '\'' +
                '}';
    }
}
