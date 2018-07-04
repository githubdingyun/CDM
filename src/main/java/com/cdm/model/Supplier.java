package com.cdm.model;

import org.springframework.stereotype.Repository;

@Repository
public class Supplier {
    private Integer supplierId;

    private String supplierName;

    private String supplierAddress;

    private String supplierPhone;

    private String supplierAccount;

    private String supplierImgUrl;

    private String supplierDesc;

    private String supplierEmail;

    public Integer getSupplierId() {
        return supplierId;
    }

    public void setSupplierId(Integer supplierId) {
        this.supplierId = supplierId;
    }

    public String getSupplierName() {
        return supplierName;
    }

    public void setSupplierName(String supplierName) {
        this.supplierName = supplierName == null ? null : supplierName.trim();
    }

    public String getSupplierAddress() {
        return supplierAddress;
    }

    public void setSupplierAddress(String supplierAddress) {
        this.supplierAddress = supplierAddress == null ? null : supplierAddress.trim();
    }

    public String getSupplierPhone() {
        return supplierPhone;
    }

    public void setSupplierPhone(String supplierPhone) {
        this.supplierPhone = supplierPhone == null ? null : supplierPhone.trim();
    }

    public String getSupplierAccount() {
        return supplierAccount;
    }

    public void setSupplierAccount(String supplierAccount) {
        this.supplierAccount = supplierAccount == null ? null : supplierAccount.trim();
    }

    public String getSupplierImgUrl() {
        return supplierImgUrl;
    }

    public void setSupplierImgUrl(String supplierImgUrl) {
        this.supplierImgUrl = supplierImgUrl == null ? null : supplierImgUrl.trim();
    }

    public String getSupplierDesc() {
        return supplierDesc;
    }

    public void setSupplierDesc(String supplierDesc) {
        this.supplierDesc = supplierDesc == null ? null : supplierDesc.trim();
    }

    public String getSupplierEmail() {
        return supplierEmail;
    }

    public void setSupplierEmail(String supplierEmail) {
        this.supplierEmail = supplierEmail == null ? null : supplierEmail.trim();
    }
}