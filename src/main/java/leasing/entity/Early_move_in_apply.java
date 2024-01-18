package leasing.entity;

import java.util.Date;

public class Early_move_in_apply {
    private String earlyMoveInId;

    private String leasingId;

    private String roomId;

    private String tenantsName;

    private String tenantsEmail;

    private Date expectedMoveInDate;

    private String status;

    private String assignRoomNumber;

    private String theSameRoomAsLease;

    private Date submitDate;

    private Integer serviceFee;

    private String specialistId;

    public String getEarlyMoveInId() {
        return earlyMoveInId;
    }

    public void setEarlyMoveInId(String earlyMoveInId) {
        this.earlyMoveInId = earlyMoveInId;
    }

    public String getLeasingId() {
        return leasingId;
    }

    public void setLeasingId(String leasingId) {
        this.leasingId = leasingId;
    }

    public String getRoomId() {
        return roomId;
    }

    public void setRoomId(String roomId) {
        this.roomId = roomId;
    }

    public String getTenantsName() {
        return tenantsName;
    }

    public void setTenantsName(String tenantsName) {
        this.tenantsName = tenantsName;
    }

    public String getTenantsEmail() {
        return tenantsEmail;
    }

    public void setTenantsEmail(String tenantsEmail) {
        this.tenantsEmail = tenantsEmail;
    }

    public Date getExpectedMoveInDate() {
        return expectedMoveInDate;
    }

    public void setExpectedMoveInDate(Date expectedMoveInDate) {
        this.expectedMoveInDate = expectedMoveInDate;
    }

    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status;
    }

    public String getAssignRoomNumber() {
        return assignRoomNumber;
    }

    public void setAssignRoomNumber(String assignRoomNumber) {
        this.assignRoomNumber = assignRoomNumber;
    }

    public String getTheSameRoomAsLease() {
        return theSameRoomAsLease;
    }

    public void setTheSameRoomAsLease(String theSameRoomAsLease) {
        this.theSameRoomAsLease = theSameRoomAsLease;
    }

    public Date getSubmitDate() {
        return submitDate;
    }

    public void setSubmitDate(Date submitDate) {
        this.submitDate = submitDate;
    }

    public Integer getServiceFee() {
        return serviceFee;
    }

    public void setServiceFee(Integer serviceFee) {
        this.serviceFee = serviceFee;
    }

    public String getSpecialistId() {
        return specialistId;
    }

    public void setSpecialistId(String specialistId) {
        this.specialistId = specialistId;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(getClass().getSimpleName());
        sb.append(" [");
        sb.append("Hash = ").append(hashCode());
        sb.append(", earlyMoveInId=").append(earlyMoveInId);
        sb.append(", leasingId=").append(leasingId);
        sb.append(", roomId=").append(roomId);
        sb.append(", tenantsName=").append(tenantsName);
        sb.append(", tenantsEmail=").append(tenantsEmail);
        sb.append(", expectedMoveInDate=").append(expectedMoveInDate);
        sb.append(", status=").append(status);
        sb.append(", assignRoomNumber=").append(assignRoomNumber);
        sb.append(", theSameRoomAsLease=").append(theSameRoomAsLease);
        sb.append(", submitDate=").append(submitDate);
        sb.append(", serviceFee=").append(serviceFee);
        sb.append(", specialistId=").append(specialistId);
        sb.append("]");
        return sb.toString();
    }
}