package com.bank.vo;

public class BankVO {
    String bankCode;
    String bankName;

    public BankVO() {
    }

    public BankVO(String bankCode, String bankName) {
        this.bankCode = bankCode;
        this.bankName = bankName;
    }

    public String getBankCode() {
        return bankCode;
    }

    public void setBankCode(String bankCode) {
        this.bankCode = bankCode;
    }

    public String getBankName() {
        return bankName;
    }

    public void setBankName(String bankName) {
        this.bankName = bankName;
    }

    @Override
    public String toString() {
        return "BankVO{" +
                "bankCode='" + bankCode + '\'' +
                ", bankName='" + bankName + '\'' +
                '}';
    }
}
