package com.bank.service;

import com.bank.dao.BankDAO;
import com.bank.vo.AccountVO;
import com.bank.vo.BankVO;
import com.bank.vo.ProductVO;
import com.bank.vo.TransactionVO;

import java.util.List;
import java.util.Random;

public class BankService {
    private BankDAO bankDAO;

    public BankService() {
        bankDAO = new BankDAO();
    }

    /**
     * 계좌개설
     * @param account 계좌VO
     */
    public void openAccount(AccountVO account) {
        int productCode = Integer.valueOf(account.getProductCode());
        String accountNo = String.valueOf(productCode) + account.getBankCode();
        int randomAccountNo1 = new Random().nextInt(100000);
        int randomAccountNo2 = new Random().nextInt(100000);
        accountNo += String.valueOf(randomAccountNo1) + String.valueOf(randomAccountNo2);
        account.setAccountNo(accountNo);
        bankDAO.insertAccount(account);
    }

    /**
     * 상품조회
     * @return 상품리스트
     */
    public List<ProductVO> getProductCode() {
        return bankDAO.selectProductCode();
    }

    /**
     * 계좌조회
     */
    public List<AccountVO> getAccountInfo(String id) {
        return bankDAO.selectAccountByID(id);
    }

    /**
     * 은행코드,이름조회
     * @return  은행리스트
     */
    public List<BankVO> getBankInfo() {
        return bankDAO.selectBank();
    }


    public void accountTransfer(TransactionVO transaction){
        bankDAO.callTransactionProc(transaction);
    }
    // 출금정보 조회
    public List<TransactionVO> getWithdrawTransaction(String accountNo){
        List<TransactionVO> transList = bankDAO.selectWithdrawTransaction(accountNo);
        return transList;
    }
    // 입금정보 조회
    public List<TransactionVO> getDepositTransaction(String accountNo){
        List<TransactionVO> transList = bankDAO.selectDepositTransaction(accountNo);
        return transList;
    }
}