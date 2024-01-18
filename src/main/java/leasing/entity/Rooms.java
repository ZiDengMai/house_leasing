package leasing.entity;

import java.util.Date;

public class Rooms {
    private String roomId;

    private String unitId;

    private String propertyId;

    private String roomInfo;

    private String bathroomInfo;

    private Integer baseline;

    private Integer officialPrice;

    private Integer privateBathroom;

    private Integer roomsNumber;

    private Integer openToLeasing;

    private Integer availableForRegister;

    private String availability;

    private String details;

    private Integer candidatesOnList;

    private String tenantsId;

    private String applicationStatus;

    private String reserceStatus;

    private String contractDepositStatus;

    private Integer leasingPrice;

    private Integer deposit;

    private Date moveInDate;

    private Date moveOutDate;

    public String getRoomId() {
        return roomId;
    }

    public void setRoomId(String roomId) {
        this.roomId = roomId;
    }

    public String getUnitId() {
        return unitId;
    }

    public void setUnitId(String unitId) {
        this.unitId = unitId;
    }

    public String getPropertyId() {
        return propertyId;
    }

    public void setPropertyId(String propertyId) {
        this.propertyId = propertyId;
    }

    public String getRoomInfo() {
        return roomInfo;
    }

    public void setRoomInfo(String roomInfo) {
        this.roomInfo = roomInfo;
    }

    public String getBathroomInfo() {
        return bathroomInfo;
    }

    public void setBathroomInfo(String bathroomInfo) {
        this.bathroomInfo = bathroomInfo;
    }

    public Integer getBaseline() {
        return baseline;
    }

    public void setBaseline(Integer baseline) {
        this.baseline = baseline;
    }

    public Integer getOfficialPrice() {
        return officialPrice;
    }

    public void setOfficialPrice(Integer officialPrice) {
        this.officialPrice = officialPrice;
    }

    public Integer getPrivateBathroom() {
        return privateBathroom;
    }

    public void setPrivateBathroom(Integer privateBathroom) {
        this.privateBathroom = privateBathroom;
    }

    public Integer getRoomsNumber() {
        return roomsNumber;
    }

    public void setRoomsNumber(Integer roomsNumber) {
        this.roomsNumber = roomsNumber;
    }

    public Integer getOpenToLeasing() {
        return openToLeasing;
    }

    public void setOpenToLeasing(Integer openToLeasing) {
        this.openToLeasing = openToLeasing;
    }

    public Integer getAvailableForRegister() {
        return availableForRegister;
    }

    public void setAvailableForRegister(Integer availableForRegister) {
        this.availableForRegister = availableForRegister;
    }

    public String getAvailability() {
        return availability;
    }

    public void setAvailability(String availability) {
        this.availability = availability;
    }

    public String getDetails() {
        return details;
    }

    public void setDetails(String details) {
        this.details = details;
    }

    public Integer getCandidatesOnList() {
        return candidatesOnList;
    }

    public void setCandidatesOnList(Integer candidatesOnList) {
        this.candidatesOnList = candidatesOnList;
    }

    public String getTenantsId() {
        return tenantsId;
    }

    public void setTenantsId(String tenantsId) {
        this.tenantsId = tenantsId;
    }

    public String getApplicationStatus() {
        return applicationStatus;
    }

    public void setApplicationStatus(String applicationStatus) {
        this.applicationStatus = applicationStatus;
    }

    public String getReserceStatus() {
        return reserceStatus;
    }

    public void setReserceStatus(String reserceStatus) {
        this.reserceStatus = reserceStatus;
    }

    public String getContractDepositStatus() {
        return contractDepositStatus;
    }

    public void setContractDepositStatus(String contractDepositStatus) {
        this.contractDepositStatus = contractDepositStatus;
    }

    public Integer getLeasingPrice() {
        return leasingPrice;
    }

    public void setLeasingPrice(Integer leasingPrice) {
        this.leasingPrice = leasingPrice;
    }

    public Integer getDeposit() {
        return deposit;
    }

    public void setDeposit(Integer deposit) {
        this.deposit = deposit;
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

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(getClass().getSimpleName());
        sb.append(" [");
        sb.append("Hash = ").append(hashCode());
        sb.append(", roomId=").append(roomId);
        sb.append(", unitId=").append(unitId);
        sb.append(", propertyId=").append(propertyId);
        sb.append(", roomInfo=").append(roomInfo);
        sb.append(", bathroomInfo=").append(bathroomInfo);
        sb.append(", baseline=").append(baseline);
        sb.append(", officialPrice=").append(officialPrice);
        sb.append(", privateBathroom=").append(privateBathroom);
        sb.append(", roomsNumber=").append(roomsNumber);
        sb.append(", openToLeasing=").append(openToLeasing);
        sb.append(", availableForRegister=").append(availableForRegister);
        sb.append(", availability=").append(availability);
        sb.append(", details=").append(details);
        sb.append(", candidatesOnList=").append(candidatesOnList);
        sb.append(", tenantsId=").append(tenantsId);
        sb.append(", applicationStatus=").append(applicationStatus);
        sb.append(", reserceStatus=").append(reserceStatus);
        sb.append(", contractDepositStatus=").append(contractDepositStatus);
        sb.append(", leasingPrice=").append(leasingPrice);
        sb.append(", deposit=").append(deposit);
        sb.append(", moveInDate=").append(moveInDate);
        sb.append(", moveOutDate=").append(moveOutDate);
        sb.append("]");
        return sb.toString();
    }
}