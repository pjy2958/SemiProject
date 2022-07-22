package com.bank.vo;

public class ProductVO {
    String productCode;
    String productName;

    public ProductVO() {
    }

    public ProductVO(String productCode, String productName) {
        this.productCode = productCode;
        this.productName = productName;
    }

    public String getProductCode() {
        return productCode;
    }

    public void setProductCode(String productCode) {
        this.productCode = productCode;
    }

    public String getProductName() {
        return productName;
    }

    public void setProductName(String productName) {
        this.productName = productName;
    }

    @Override
    public String toString() {
        return "ProductVO{" +
                "productCode='" + productCode + '\'' +
                ", productName='" + productName + '\'' +
                '}';
    }
}
