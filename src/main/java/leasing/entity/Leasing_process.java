package leasing.entity;

import java.util.Date;

public class Leasing_process {
    private String processId;

    private String tenantsId;

    private String status;

    private String lable;

    private String roomId;

    private Integer isTopPriority;

    private String leasingInfo;

    private Date moveInDate;

    private Date moveOutDate;

    private Integer leasingPrice;

    private Integer depositAmount;

    private Double negotiateComission;

    private String specialist;

    private String applicationPage;

    private String applicationStatus;

    private Date applySubmitDate;

    private Integer idOrVisa;

    private String i20;

    private String ssn;

    private Integer applicationFee;

    private String finalPage;

    private String leaseStatus;

    private Date leaseComfirmDate;

    private String contract;

    private Integer depositFee;

    public String getProcessId() {
        return processId;
    }

    public void setProcessId(String processId) {
        this.processId = processId;
    }

    public String getTenantsId() {
        return tenantsId;
    }

    public void setTenantsId(String tenantsId) {
        this.tenantsId = tenantsId;
    }

    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status;
    }

    public String getLable() {
        return lable;
    }

    public void setLable(String lable) {
        this.lable = lable;
    }

    public String getRoomId() {
        return roomId;
    }

    public void setRoomId(String roomId) {
        this.roomId = roomId;
    }

    public Integer getIsTopPriority() {
        return isTopPriority;
    }

    public void setIsTopPriority(Integer isTopPriority) {
        this.isTopPriority = isTopPriority;
    }

    public String getLeasingInfo() {
        return leasingInfo;
    }

    public void setLeasingInfo(String leasingInfo) {
        this.leasingInfo = leasingInfo;
    }

    public Date getMoveInDate() {
        return moveInDate;
    }

    public void setMoveInDate(Date moveInDate) {
        this.moveInDate = moveInDate;
    }

    public Date getMoveOutDate() {
        return moveOutDate;
    }

    public void setMoveOutDate(Date moveOutDate) {
        this.moveOutDate = moveOutDate;
    }

    public Integer getLeasingPrice() {
        return leasingPrice;
    }

    public void setLeasingPrice(Integer leasingPrice) {
        this.leasingPrice = leasingPrice;
    }

    public Integer getDepositAmount() {
        return depositAmount;
    }

    public void setDepositAmount(Integer depositAmount) {
        this.depositAmount = depositAmount;
    }

    public Double getNegotiateComission() {
        return negotiateComission;
    }

    public void setNegotiateComission(Double negotiateComission) {
        this.negotiateComission = negotiateComission;
    }

    public String getSpecialist() {
        return specialist;
    }

    public void setSpecialist(String specialist) {
        this.specialist = specialist;
    }

    public String getApplicationPage() {
        return applicationPage;
    }

    public void setApplicationPage(String applicationPage) {
        this.applicationPage = applicationPage;
    }

    public String getApplicationStatus() {
        return applicationStatus;
    }

    public void setApplicationStatus(String applicationStatus) {
        this.applicationStatus = applicationStatus;
    }

    public Date getApplySubmitDate() {
        return applySubmitDate;
    }

    public void setApplySubmitDate(Date applySubmitDate) {
        this.applySubmitDate = applySubmitDate;
    }

    public Integer getIdOrVisa() {
        return idOrVisa;
    }

    public void setIdOrVisa(Integer idOrVisa) {
        this.idOrVisa = idOrVisa;
    }

    public String getI20() {
        return i20;
    }

    public void setI20(String i20) {
        this.i20 = i20;
    }

    public String getSsn() {
        return ssn;
    }

    public void setSsn(String ssn) {
        this.ssn = ssn;
    }

    public Integer getApplicationFee() {
        return applicationFee;
    }

    public void setApplicationFee(Integer applicationFee) {
        this.applicationFee = applicationFee;
    }

    public String getFinalPage() {
        return finalPage;
    }

    public void setFinalPage(String finalPage) {
        this.finalPage = finalPage;
    }

    public String getLeaseStatus() {
        return leaseStatus;
    }

    public void setLeaseStatus(String leaseStatus) {
        this.leaseStatus = leaseStatus;
    }

    public Date getLeaseComfirmDate() {
        return leaseComfirmDate;
    }

    public void setLeaseComfirmDate(Date leaseComfirmDate) {
        this.leaseComfirmDate = leaseComfirmDate;
    }

    public String getContract() {
        return contract;
    }

    public void setContract(String contract) {
        this.contract = contract;
    }

    public Integer getDepositFee() {
        return depositFee;
    }

    public void setDepositFee(Integer depositFee) {
        this.depositFee = depositFee;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(getClass().getSimpleName());
        sb.append(" [");
        sb.append("Hash = ").append(hashCode());
        sb.append(", processId=").append(processId);
        sb.append(", tenantsId=").append(tenantsId);
        sb.append(", status=").append(status);
        sb.append(", lable=").append(lable);
        sb.append(", roomId=").append(roomId);
        sb.append(", isTopPriority=").append(isTopPriority);
        sb.append(", leasingInfo=").append(leasingInfo);
        sb.append(", moveInDate=").append(moveInDate);
        sb.append(", moveOutDate=").append(moveOutDate);
        sb.append(", leasingPrice=").append(leasingPrice);
        sb.append(", depositAmount=").append(depositAmount);
        sb.append(", negotiateComission=").append(negotiateComission);
        sb.append(", specialist=").append(specialist);
        sb.append(", applicationPage=").append(applicationPage);
        sb.append(", applicationStatus=").append(applicationStatus);
        sb.append(", applySubmitDate=").append(applySubmitDate);
        sb.append(", idOrVisa=").append(idOrVisa);
        sb.append(", i20=").append(i20);
        sb.append(", ssn=").append(ssn);
        sb.append(", applicationFee=").append(applicationFee);
        sb.append(", finalPage=").append(finalPage);
        sb.append(", leaseStatus=").append(leaseStatus);
        sb.append(", leaseComfirmDate=").append(leaseComfirmDate);
        sb.append(", contract=").append(contract);
        sb.append(", depositFee=").append(depositFee);
        sb.append("]");
        return sb.toString();
    }
}