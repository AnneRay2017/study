package com.example.model;

import java.math.BigDecimal;
import java.util.Date;

public class AcSnapFee {
    private Long id;

    private String xmListCode;

    private String feeCode;

    private String feeDesc;

    private String feeType;

    private String feeCurrency;

    private String feeCalcType;

    private String baseAmtType;

    private BigDecimal feeRate;

    private Long feeAmt;

    private Long minFeeAmt;

    private Long maxFeeAmt;

    private Byte isShare;

    private String feeTerms;

    private Integer feeBeginTerm;

    private Date gmtCreate;

    private String gmtCreator;

    private Date gmtModify;

    private String gmtModifier;

    public AcSnapFee(Long id, String xmListCode, String feeCode, String feeDesc, String feeType, String feeCurrency, String feeCalcType, String baseAmtType, BigDecimal feeRate, Long feeAmt, Long minFeeAmt, Long maxFeeAmt, Byte isShare, String feeTerms, Integer feeBeginTerm, Date gmtCreate, String gmtCreator, Date gmtModify, String gmtModifier) {
        this.id = id;
        this.xmListCode = xmListCode;
        this.feeCode = feeCode;
        this.feeDesc = feeDesc;
        this.feeType = feeType;
        this.feeCurrency = feeCurrency;
        this.feeCalcType = feeCalcType;
        this.baseAmtType = baseAmtType;
        this.feeRate = feeRate;
        this.feeAmt = feeAmt;
        this.minFeeAmt = minFeeAmt;
        this.maxFeeAmt = maxFeeAmt;
        this.isShare = isShare;
        this.feeTerms = feeTerms;
        this.feeBeginTerm = feeBeginTerm;
        this.gmtCreate = gmtCreate;
        this.gmtCreator = gmtCreator;
        this.gmtModify = gmtModify;
        this.gmtModifier = gmtModifier;
    }

    public AcSnapFee() {
        super();
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getXmListCode() {
        return xmListCode;
    }

    public void setXmListCode(String xmListCode) {
        this.xmListCode = xmListCode == null ? null : xmListCode.trim();
    }

    public String getFeeCode() {
        return feeCode;
    }

    public void setFeeCode(String feeCode) {
        this.feeCode = feeCode == null ? null : feeCode.trim();
    }

    public String getFeeDesc() {
        return feeDesc;
    }

    public void setFeeDesc(String feeDesc) {
        this.feeDesc = feeDesc == null ? null : feeDesc.trim();
    }

    public String getFeeType() {
        return feeType;
    }

    public void setFeeType(String feeType) {
        this.feeType = feeType == null ? null : feeType.trim();
    }

    public String getFeeCurrency() {
        return feeCurrency;
    }

    public void setFeeCurrency(String feeCurrency) {
        this.feeCurrency = feeCurrency == null ? null : feeCurrency.trim();
    }

    public String getFeeCalcType() {
        return feeCalcType;
    }

    public void setFeeCalcType(String feeCalcType) {
        this.feeCalcType = feeCalcType == null ? null : feeCalcType.trim();
    }

    public String getBaseAmtType() {
        return baseAmtType;
    }

    public void setBaseAmtType(String baseAmtType) {
        this.baseAmtType = baseAmtType == null ? null : baseAmtType.trim();
    }

    public BigDecimal getFeeRate() {
        return feeRate;
    }

    public void setFeeRate(BigDecimal feeRate) {
        this.feeRate = feeRate;
    }

    public Long getFeeAmt() {
        return feeAmt;
    }

    public void setFeeAmt(Long feeAmt) {
        this.feeAmt = feeAmt;
    }

    public Long getMinFeeAmt() {
        return minFeeAmt;
    }

    public void setMinFeeAmt(Long minFeeAmt) {
        this.minFeeAmt = minFeeAmt;
    }

    public Long getMaxFeeAmt() {
        return maxFeeAmt;
    }

    public void setMaxFeeAmt(Long maxFeeAmt) {
        this.maxFeeAmt = maxFeeAmt;
    }

    public Byte getIsShare() {
        return isShare;
    }

    public void setIsShare(Byte isShare) {
        this.isShare = isShare;
    }

    public String getFeeTerms() {
        return feeTerms;
    }

    public void setFeeTerms(String feeTerms) {
        this.feeTerms = feeTerms == null ? null : feeTerms.trim();
    }

    public Integer getFeeBeginTerm() {
        return feeBeginTerm;
    }

    public void setFeeBeginTerm(Integer feeBeginTerm) {
        this.feeBeginTerm = feeBeginTerm;
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