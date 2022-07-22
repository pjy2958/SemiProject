package com.bank.dao;

import com.bank.vo.AccountVO;
import com.bank.vo.BankVO;
import com.bank.vo.ProductVO;
import com.bank.vo.TransactionVO;
import util.ConnectionFactory;

import java.sql.CallableStatement;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.ArrayList;
import java.util.List;

public class BankDAO {
    /**
     * 계좌개설
     */
    public void insertAccount(AccountVO account){
        StringBuilder sql = new StringBuilder();
        sql.append("INSERT INTO ACCOUNT_TAB (ACCOUNT_NO, BANK_CODE, ID, PASSWORD, ACCOUNT_NAME, PRODUCT_CODE) ");
        sql.append("VALUES(?, ?, ?, ?, ?, ?)");
        try(
                Connection conn = new ConnectionFactory().getConnection();
                PreparedStatement pstmt = conn.prepareStatement(sql.toString());
                ){
            int loc = 1;
            pstmt.setString(loc++, account.getAccountNo());
            pstmt.setString(loc++, account.getBankCode());
            pstmt.setString(loc++, account.getId());
            pstmt.setString(loc++, account.getPassword());
            pstmt.setString(loc++, account.getAccountName());
            pstmt.setString(loc++, account.getProductCode());
            pstmt.executeUpdate();
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    /**
     * 상품코드 조회
     * @return 상품코드,이름 리스트
     */
    public List<ProductVO> selectProductCode(){
        String sql = "SELECT PRODUCT_CODE, PRODUCT_NAME FROM PRODUCT_CODE_TAB";
        try(
                Connection conn = new ConnectionFactory().getConnection();
                PreparedStatement pstmt = conn.prepareStatement(sql.toString());
                ){
            ResultSet rs = pstmt.executeQuery();
            List<ProductVO> productList = new ArrayList<>();
            while(rs.next()) {
                String productCode = rs.getString("PRODUCT_CODE");
                String productName = rs.getString("PRODUCT_NAME");
                ProductVO product = new ProductVO(productCode, productName);
                productList.add(product);
            }
            return productList;
        } catch (Exception e) {
            e.printStackTrace();
        }
        return null;
    }

    /**
     * 로그인한 회원의 계좌정보를 ID를 통해서 확인
     * @param id 로그인한 회원 ID
     * @return  로그인 회원 계좌VO 리스트
     */
    public List<AccountVO> selectAccountByID(String id) {
        StringBuilder sql = new StringBuilder();
        sql.append("SELECT ACCOUNT_NO, BANK_CODE, ID, PASSWORD, BALANCE, ACCOUNT_NAME, PRODUCT_CODE, OPENING_DATE ");
        sql.append("  FROM ACCOUNT_TAB ");
        sql.append(" WHERE ID = ?");
        try(
                Connection conn = new ConnectionFactory().getConnection();
                PreparedStatement pstmt = conn.prepareStatement(sql.toString());
                ) {
            pstmt.setString(1, id);
            ResultSet rs = pstmt.executeQuery();
            List<AccountVO> accountList = new ArrayList<>();
            while (rs.next()) {
                AccountVO account = new AccountVO();
                account.setAccountNo(rs.getString("ACCOUNT_NO"));
                account.setBankCode(rs.getString("BANK_CODE"));
                account.setId(rs.getString("ID"));
                account.setPassword(rs.getString("PASSWORD"));
                account.setBalance(Integer.valueOf(rs.getString("BALANCE")));
                account.setAccountName(rs.getString("ACCOUNT_NAME"));
                account.setProductCode(rs.getString("PRODUCT_CODE"));
                account.setOpeningDate(rs.getString("OPENING_DATE"));
                accountList.add(account);
            }
            return accountList;
        } catch (Exception e) {
            e.printStackTrace();
        }
        return null;
    }

    public List<BankVO> selectBank() {
        String sql = "SELECT BANK_CODE, BANK_NAME FROM BANK_CODE_TAB";
        try (
                Connection conn = new ConnectionFactory().getConnection();
                PreparedStatement pstmt = conn.prepareStatement(sql.toString());
                ) {
            ResultSet rs = pstmt.executeQuery();
            List<BankVO> bankList = new ArrayList<>();
            while (rs.next()) {
                BankVO bank = new BankVO();
                bank.setBankCode(rs.getString("BANK_CODE"));
                bank.setBankName(rs.getString("BANK_NAME"));
                bankList.add(bank);
            }
            return bankList;
        } catch (Exception e) {
            e.printStackTrace();
        }
        return null;
    }

    public void callTransactionProc(TransactionVO transaction) {
        StringBuilder sql = new StringBuilder();
        sql.append("{CALL TRANSACTION_PROCESS_PROC(?, ?, ?, ?, ?, ?, ?)}");
        try(
                Connection conn = new ConnectionFactory().getConnection();
                CallableStatement cstmt = conn.prepareCall(sql.toString());
                ){
            int loc = 1;
            cstmt.setString(loc++, transaction.getDepositAccountNo());
            cstmt.setString(loc++, transaction.getDepositBankCode());
            cstmt.setString(loc++, transaction.getDepositTransMemo());
            cstmt.setString(loc++, transaction.getWithdrawAccountNo());
            cstmt.setString(loc++, transaction.getWithdrawBankCode());
            cstmt.setString(loc++, transaction.getWithdrawTransMemo());
            cstmt.setInt(loc++, transaction.getTransAmount());

            cstmt.execute();
        } catch (Exception e) {

        }
    }
    // 출금정보 조회
    public List<TransactionVO> selectWithdrawTransaction(String accountNo){
        StringBuilder sql = new StringBuilder();
        sql.append("SELECT D_ACCOUNT_NO, TRANS_AMOUNT, W_TRANS_MEMO, TRANS_DATE ");
        sql.append("  FROM TRANSACTION_TAB ");
        sql.append(" WHERE W_ACCOUNT_NO = ?");
        sql.append(" ORDER BY TRANS_DATE DESC");
        try(
                Connection conn = new ConnectionFactory().getConnection();
                PreparedStatement pstmt = conn.prepareStatement(sql.toString());
                ){
            int loc = 1;
            pstmt.setString(loc++, accountNo);
            ResultSet rs = pstmt.executeQuery();
            List<TransactionVO> transList = new ArrayList<>();
            while(rs.next()) {
                TransactionVO transaction = new TransactionVO();
                transaction.setDepositAccountNo(rs.getString("D_ACCOUNT_NO"));
                transaction.setTransAmount(Integer.valueOf(rs.getString("TRANS_AMOUNT")));
                transaction.setWithdrawTransMemo(rs.getString("W_TRANS_MEMO"));
                transaction.setTransDate(rs.getString("TRANS_DATE"));
                transList.add(transaction);
            }
            return transList;
        } catch (Exception e) {
            e.printStackTrace();
        }
        return null;
    }
    // 입금정보 조회
    public List<TransactionVO> selectDepositTransaction(String accountNo){
        StringBuilder sql = new StringBuilder();
        sql.append("SELECT W_ACCOUNT_NO, TRANS_AMOUNT, D_TRANS_MEMO, TRANS_DATE ");
        sql.append("  FROM TRANSACTION_TAB ");
        sql.append(" WHERE D_ACCOUNT_NO = ?");
        sql.append(" ORDER BY TRANS_DATE DESC");
        try(
                Connection conn = new ConnectionFactory().getConnection();
                PreparedStatement pstmt = conn.prepareStatement(sql.toString());
        ){
            int loc = 1;
            pstmt.setString(loc++, accountNo);
            ResultSet rs = pstmt.executeQuery();
            List<TransactionVO> transList = new ArrayList<>();
            while(rs.next()) {
                TransactionVO transaction = new TransactionVO();
                transaction.setWithdrawAccountNo(rs.getString("W_ACCOUNT_NO"));
                transaction.setTransAmount(Integer.valueOf(rs.getString("TRANS_AMOUNT")));
                transaction.setDepositTransMemo(rs.getString("D_TRANS_MEMO"));
                transaction.setTransDate(rs.getString("TRANS_DATE"));
                transList.add(transaction);
            }
            return transList;
        } catch (Exception e) {
            e.printStackTrace();
        }
        return null;
    }
}
