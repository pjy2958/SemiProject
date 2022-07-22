package com.bank.vo;

public class TransactionVO {
    String depositAccountNo;
    String depositBankCode;
    String depositTransMemo;
    int transAmount;
    String withdrawAccountNo;
    String withdrawBankCode;
    String withdrawTransMemo;
    String transDate;

    public TransactionVO() {
    }

    public TransactionVO(String depositAccountNo, String depositBankCode, String depositTransMemo, int transAmount, String withdrawAccountNo, String withdrawBankCode, String withdrawTransMemo) {
        this.depositAccountNo = depositAccountNo;
        this.depositBankCode = depositBankCode;
        this.depositTransMemo = depositTransMemo;
        this.transAmount = transAmount;
        this.withdrawAccountNo = withdrawAccountNo;
        this.withdrawBankCode = withdrawBankCode;
        this.withdrawTransMemo = withdrawTransMemo;
    }

    public String getDepositAccountNo() {
        return depositAccountNo;
    }

    public void setDepositAccountNo(String depositAccountNo) {
        this.depositAccountNo = depositAccountNo;
    }

    public String getDepositBankCode() {
        return depositBankCode;
    }

    public void setDepositBankCode(String depositBankCode) {
        this.depositBankCode = depositBankCode;
    }

    public String getDepositTransMemo() {
        return depositTransMemo;
    }

    public void setDepositTransMemo(String depositTransMemo) {
        this.depositTransMemo = depositTransMemo;
    }

    public int getTransAmount() {
        return transAmount;
    }

    public void setTransAmount(int transAmount) {
        this.transAmount = transAmount;
    }

    public String getWithdrawAccountNo() {
        return withdrawAccountNo;
    }

    public void setWithdrawAccountNo(String withdrawAccountNo) {
        this.withdrawAccountNo = withdrawAccountNo;
    }

    public String getWithdrawBankCode() {
        return withdrawBankCode;
    }

    public void setWithdrawBankCode(String withdrawBankCode) {
        this.withdrawBankCode = withdrawBankCode;
    }

    public String getWithdrawTransMemo() {
        return withdrawTransMemo;
    }

    public void setWithdrawTransMemo(String withdrawTransMemo) {
        this.withdrawTransMemo = withdrawTransMemo;
    }

    public String getTransDate() {
        return transDate;
    }

    public void setTransDate(String transDate) {
        this.transDate = transDate;
    }

    @Override
    public String toString() {
        return "TransactionVO{" +
                "depositAccountNo='" + depositAccountNo + '\'' +
                ", depositBankCode='" + depositBankCode + '\'' +
                ", depositTransMemo='" + depositTransMemo + '\'' +
                ", transAmount=" + transAmount +
                ", withdrawAccountNo='" + withdrawAccountNo + '\'' +
                ", withdrawBankCode='" + withdrawBankCode + '\'' +
                ", withdrawTransMemo='" + withdrawTransMemo + '\'' +
                ", transDate='" + transDate + '\'' +
                '}';
    }
}
