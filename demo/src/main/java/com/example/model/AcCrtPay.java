package com.example.model;

import java.util.Date;

public class AcCrtPay {
    private Long id;

    private String loanBookNo;

    private String tradeNo;

    private String xmListCode;

    private String custCode;

    private String capitalOrgCode;

    private String repayOrgCode;

    private String payAcNo;

    private String receiveAcNo;

    private Long amt;

    private String capitalListCode;

    private String prodCode;

    private Date inteDate;

    private Date endDate;

    private Byte isHandle;

    private Date handlingTime;

    private Byte isVoid;

    private Date paymentDate;

    private String state;

    private String remark;

    private Date gmtCreate;

    private String gmtCreator;

    private Date gmtModify;

    private String gmtModifier;

    public AcCrtPay(Long id, String loanBookNo, String tradeNo, String xmListCode, String custCode, String capitalOrgCode, String repayOrgCode, String payAcNo, String receiveAcNo, Long amt, String capitalListCode, String prodCode, Date inteDate, Date endDate, Byte isHandle, Date handlingTime, Byte isVoid, Date paymentDate, String state, String remark, Date gmtCreate, String gmtCreator, Date gmtModify, String gmtModifier) {
        this.id = id;
        this.loanBookNo = loanBookNo;
        this.tradeNo = tradeNo;
        this.xmListCode = xmListCode;
        this.custCode = custCode;
        this.capitalOrgCode = capitalOrgCode;
        this.repayOrgCode = repayOrgCode;
        this.payAcNo = payAcNo;
        this.receiveAcNo = receiveAcNo;
        this.amt = amt;
        this.capitalListCode = capitalListCode;
        this.prodCode = prodCode;
        this.inteDate = inteDate;
        this.endDate = endDate;
        this.isHandle = isHandle;
        this.handlingTime = handlingTime;
        this.isVoid = isVoid;
        this.paymentDate = paymentDate;
        this.state = state;
        this.remark = remark;
        this.gmtCreate = gmtCreate;
        this.gmtCreator = gmtCreator;
        this.gmtModify = gmtModify;
        this.gmtModifier = gmtModifier;
    }

    public AcCrtPay() {
        super();
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getLoanBookNo() {
        return loanBookNo;
    }

    public void setLoanBookNo(String loanBookNo) {
        this.loanBookNo = loanBookNo == null ? null : loanBookNo.trim();
    }

    public String getTradeNo() {
        return tradeNo;
    }

    public void setTradeNo(String tradeNo) {
        this.tradeNo = tradeNo == null ? null : tradeNo.trim();
    }

    public String getXmListCode() {
        return xmListCode;
    }

    public void setXmListCode(String xmListCode) {
        this.xmListCode = xmListCode == null ? null : xmListCode.trim();
    }

    public String getCustCode() {
        return custCode;
    }

    public void setCustCode(String custCode) {
        this.custCode = custCode == null ? null : custCode.trim();
    }

    public String getCapitalOrgCode() {
        return capitalOrgCode;
    }

    public void setCapitalOrgCode(String capitalOrgCode) {
        this.capitalOrgCode = capitalOrgCode == null ? null : capitalOrgCode.trim();
    }

    public String getRepayOrgCode() {
        return repayOrgCode;
    }

    public void setRepayOrgCode(String repayOrgCode) {
        this.repayOrgCode = repayOrgCode == null ? null : repayOrgCode.trim();
    }

    public String getPayAcNo() {
        return payAcNo;
    }

    public void setPayAcNo(String payAcNo) {
        this.payAcNo = payAcNo == null ? null : payAcNo.trim();
    }

    public String getReceiveAcNo() {
        return receiveAcNo;
    }

    public void setReceiveAcNo(String receiveAcNo) {
        this.receiveAcNo = receiveAcNo == null ? null : receiveAcNo.trim();
    }

    public Long getAmt() {
        return amt;
    }

    public void setAmt(Long amt) {
        this.amt = amt;
    }

    public String getCapitalListCode() {
        return capitalListCode;
    }

    public void setCapitalListCode(String capitalListCode) {
        this.capitalListCode = capitalListCode == null ? null : capitalListCode.trim();
    }

    public String getProdCode() {
        return prodCode;
    }

    public void setProdCode(String prodCode) {
        this.prodCode = prodCode == null ? null : prodCode.trim();
    }

    public Date getInteDate() {
        return inteDate;
    }

    public void setInteDate(Date inteDate) {
        this.inteDate = inteDate;
    }

    public Date getEndDate() {
        return endDate;
    }

    public void setEndDate(Date endDate) {
        this.endDate = endDate;
    }

    public Byte getIsHandle() {
        return isHandle;
    }

    public void setIsHandle(Byte isHandle) {
        this.isHandle = isHandle;
    }

    public Date getHandlingTime() {
        return handlingTime;
    }

    public void setHandlingTime(Date handlingTime) {
        this.handlingTime = handlingTime;
    }

    public Byte getIsVoid() {
        return isVoid;
    }

    public void setIsVoid(Byte isVoid) {
        this.isVoid = isVoid;
    }

    public Date getPaymentDate() {
        return paymentDate;
    }

    public void setPaymentDate(Date paymentDate) {
        this.paymentDate = paymentDate;
    }

    public String getState() {
        return state;
    }

    public void setState(String state) {
        this.state = state == null ? null : state.trim();
    }

    public String getRemark() {
        return remark;
    }

    public void setRemark(String remark) {
        this.remark = remark == null ? null : remark.trim();
    }

    public Date getGmtCreate() {
        return gmtCreate;
    }

    public void setGmtCreate(Date gmtCreate) {
        this.gmtCreate = gmtCreate;
    }

    public String getGmtCreator() {
        return gmtCreator;
    }

    public void setGmtCreator(String gmtCreator) {
        this.gmtCreator = gmtCreator == null ? null : gmtCreator.trim();
    }

    public Date getGmtModify() {
        return gmtModify;
    }

    public void setGmtModify(Date gmtModify) {
        this.gmtModify = gmtModify;
    }

    public String getGmtModifier() {
        return gmtModifier;
    }

    public void setGmtModifier(String gmtModifier) {
        this.gmtModifier = gmtModifier == null ? null : gmtModifier.trim();
    }
}