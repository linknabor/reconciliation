package com.eshequ.reconciliation.model;

import com.eshequ.reconciliation.common.BaseModel;
import java.math.BigDecimal;

public class SpServeOtherFeeWater extends BaseModel {
    private Long otherWaterId;

    private BigDecimal tranAmt;

    private BigDecimal reduceAmt;

    private BigDecimal consultAmt;

    private BigDecimal extractAmt;

    private BigDecimal channelAmt;

    private BigDecimal rebateAmt;

    private String acctDate;

    private String acctTime;

    private Long cspId;

    private Long sectId;

    private Long tradeWaterId;

    private String relateInvoiceNo;

    private String invoiceStatus;

    private BigDecimal ownerConsultAmt;

    public Long getOtherWaterId() {
        return otherWaterId;
    }

    public void setOtherWaterId(Long otherWaterId) {
        this.otherWaterId = otherWaterId;
    }

    public BigDecimal getTranAmt() {
        return tranAmt;
    }

    public void setTranAmt(BigDecimal tranAmt) {
        this.tranAmt = tranAmt;
    }

    public BigDecimal getReduceAmt() {
        return reduceAmt;
    }

    public void setReduceAmt(BigDecimal reduceAmt) {
        this.reduceAmt = reduceAmt;
    }

    public BigDecimal getConsultAmt() {
        return consultAmt;
    }

    public void setConsultAmt(BigDecimal consultAmt) {
        this.consultAmt = consultAmt;
    }

    public BigDecimal getExtractAmt() {
        return extractAmt;
    }

    public void setExtractAmt(BigDecimal extractAmt) {
        this.extractAmt = extractAmt;
    }

    public BigDecimal getChannelAmt() {
        return channelAmt;
    }

    public void setChannelAmt(BigDecimal channelAmt) {
        this.channelAmt = channelAmt;
    }

    public BigDecimal getRebateAmt() {
        return rebateAmt;
    }

    public void setRebateAmt(BigDecimal rebateAmt) {
        this.rebateAmt = rebateAmt;
    }

    public String getAcctDate() {
        return acctDate;
    }

    public void setAcctDate(String acctDate) {
        this.acctDate = acctDate;
    }

    public String getAcctTime() {
        return acctTime;
    }

    public void setAcctTime(String acctTime) {
        this.acctTime = acctTime;
    }

    public Long getCspId() {
        return cspId;
    }

    public void setCspId(Long cspId) {
        this.cspId = cspId;
    }

    public Long getSectId() {
        return sectId;
    }

    public void setSectId(Long sectId) {
        this.sectId = sectId;
    }

    public Long getTradeWaterId() {
        return tradeWaterId;
    }

    public void setTradeWaterId(Long tradeWaterId) {
        this.tradeWaterId = tradeWaterId;
    }

    public String getRelateInvoiceNo() {
        return relateInvoiceNo;
    }

    public void setRelateInvoiceNo(String relateInvoiceNo) {
        this.relateInvoiceNo = relateInvoiceNo;
    }

    public String getInvoiceStatus() {
        return invoiceStatus;
    }

    public void setInvoiceStatus(String invoiceStatus) {
        this.invoiceStatus = invoiceStatus;
    }

    public BigDecimal getOwnerConsultAmt() {
        return ownerConsultAmt;
    }

    public void setOwnerConsultAmt(BigDecimal ownerConsultAmt) {
        this.ownerConsultAmt = ownerConsultAmt;
    }
}