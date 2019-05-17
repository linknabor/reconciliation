package com.eshequ.reconciliation.model;

import com.eshequ.reconciliation.common.BaseModel;
import java.math.BigDecimal;

public class SpServeOtherTrade extends BaseModel {
    private Long tradeWaterId;

    private String mergerStatus;

    private BigDecimal tranAmt;

    private String payMethod;

    private String tranDate;

    private String tranTime;

    private String needInvoice;

    private Long webUserId;

    private String signature;

    private Long cspId;

    private Long sectId;

    private String fromSys;

    private String platChannel;

    private String payScenarios;

    private Long cspStaffId;

    private String staffName;

    private String isRefunded;

    private String tel;

    private String startDate;

    private String endDate;

    private Long otherFeeId;

    private Long mngCellId;

    private String cardType;

    private String remark;

    private BigDecimal ownerConsultAmt;

    public Long getTradeWaterId() {
        return tradeWaterId;
    }

    public void setTradeWaterId(Long tradeWaterId) {
        this.tradeWaterId = tradeWaterId;
    }

    public String getMergerStatus() {
        return mergerStatus;
    }

    public void setMergerStatus(String mergerStatus) {
        this.mergerStatus = mergerStatus;
    }

    public BigDecimal getTranAmt() {
        return tranAmt;
    }

    public void setTranAmt(BigDecimal tranAmt) {
        this.tranAmt = tranAmt;
    }

    public String getPayMethod() {
        return payMethod;
    }

    public void setPayMethod(String payMethod) {
        this.payMethod = payMethod;
    }

    public String getTranDate() {
        return tranDate;
    }

    public void setTranDate(String tranDate) {
        this.tranDate = tranDate;
    }

    public String getTranTime() {
        return tranTime;
    }

    public void setTranTime(String tranTime) {
        this.tranTime = tranTime;
    }

    public String getNeedInvoice() {
        return needInvoice;
    }

    public void setNeedInvoice(String needInvoice) {
        this.needInvoice = needInvoice;
    }

    public Long getWebUserId() {
        return webUserId;
    }

    public void setWebUserId(Long webUserId) {
        this.webUserId = webUserId;
    }

    public String getSignature() {
        return signature;
    }

    public void setSignature(String signature) {
        this.signature = signature;
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

    public String getFromSys() {
        return fromSys;
    }

    public void setFromSys(String fromSys) {
        this.fromSys = fromSys;
    }

    public String getPlatChannel() {
        return platChannel;
    }

    public void setPlatChannel(String platChannel) {
        this.platChannel = platChannel;
    }

    public String getPayScenarios() {
        return payScenarios;
    }

    public void setPayScenarios(String payScenarios) {
        this.payScenarios = payScenarios;
    }

    public Long getCspStaffId() {
        return cspStaffId;
    }

    public void setCspStaffId(Long cspStaffId) {
        this.cspStaffId = cspStaffId;
    }

    public String getStaffName() {
        return staffName;
    }

    public void setStaffName(String staffName) {
        this.staffName = staffName;
    }

    public String getIsRefunded() {
        return isRefunded;
    }

    public void setIsRefunded(String isRefunded) {
        this.isRefunded = isRefunded;
    }

    public String getTel() {
        return tel;
    }

    public void setTel(String tel) {
        this.tel = tel;
    }

    public String getStartDate() {
        return startDate;
    }

    public void setStartDate(String startDate) {
        this.startDate = startDate;
    }

    public String getEndDate() {
        return endDate;
    }

    public void setEndDate(String endDate) {
        this.endDate = endDate;
    }

    public Long getOtherFeeId() {
        return otherFeeId;
    }

    public void setOtherFeeId(Long otherFeeId) {
        this.otherFeeId = otherFeeId;
    }

    public Long getMngCellId() {
        return mngCellId;
    }

    public void setMngCellId(Long mngCellId) {
        this.mngCellId = mngCellId;
    }

    public String getCardType() {
        return cardType;
    }

    public void setCardType(String cardType) {
        this.cardType = cardType;
    }

    public String getRemark() {
        return remark;
    }

    public void setRemark(String remark) {
        this.remark = remark;
    }

    public BigDecimal getOwnerConsultAmt() {
        return ownerConsultAmt;
    }

    public void setOwnerConsultAmt(BigDecimal ownerConsultAmt) {
        this.ownerConsultAmt = ownerConsultAmt;
    }
}