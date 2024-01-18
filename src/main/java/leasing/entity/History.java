package leasing.entity;

import java.util.Date;

public class History {
    private String historyId;

    private String propertyId;

    private Integer totalRooms;

    private Integer signedOrReservedRooms;

    private Double completeRate;

    private String roomsHasCandidate;

    private Double maximumRentRate;

    private Date date;

    public String getHistoryId() {
        return historyId;
    }

    public void setHistoryId(String historyId) {
        this.historyId = historyId;
    }

    public String getPropertyId() {
        return propertyId;
    }

    public void setPropertyId(String propertyId) {
        this.propertyId = propertyId;
    }

    public Integer getTotalRooms() {
        return totalRooms;
    }

    public void setTotalRooms(Integer totalRooms) {
        this.totalRooms = totalRooms;
    }

    public Integer getSignedOrReservedRooms() {
        return signedOrReservedRooms;
    }

    public void setSignedOrReservedRooms(Integer signedOrReservedRooms) {
        this.signedOrReservedRooms = signedOrReservedRooms;
    }

    public Double getCompleteRate() {
        return completeRate;
    }

    public void setCompleteRate(Double completeRate) {
        this.completeRate = completeRate;
    }

    public String getRoomsHasCandidate() {
        return roomsHasCandidate;
    }

    public void setRoomsHasCandidate(String roomsHasCandidate) {
        this.roomsHasCandidate = roomsHasCandidate;
    }

    public Double getMaximumRentRate() {
        return maximumRentRate;
    }

    public void setMaximumRentRate(Double maximumRentRate) {
        this.maximumRentRate = maximumRentRate;
    }

    public Date getDate() {
        return date;
    }

    public void setDate(Date date) {
        this.date = date;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(getClass().getSimpleName());
        sb.append(" [");
        sb.append("Hash = ").append(hashCode());
        sb.append(", historyId=").append(historyId);
        sb.append(", propertyId=").append(propertyId);
        sb.append(", totalRooms=").append(totalRooms);
        sb.append(", signedOrReservedRooms=").append(signedOrReservedRooms);
        sb.append(", completeRate=").append(completeRate);
        sb.append(", roomsHasCandidate=").append(roomsHasCandidate);
        sb.append(", maximumRentRate=").append(maximumRentRate);
        sb.append(", date=").append(date);
        sb.append("]");
        return sb.toString();
    }
}