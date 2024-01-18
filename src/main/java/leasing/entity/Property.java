package leasing.entity;

public class Property {
    private String propetyId;

    private String address;

    private Integer totalRooms;

    private Integer signOrLease;

    private Double completeRate;

    private Integer roomsHasCandiate;

    private String floorPlan;

    private String vitural;

    private String images;

    public String getPropetyId() {
        return propetyId;
    }

    public void setPropetyId(String propetyId) {
        this.propetyId = propetyId;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public Integer getTotalRooms() {
        return totalRooms;
    }

    public void setTotalRooms(Integer totalRooms) {
        this.totalRooms = totalRooms;
    }

    public Integer getSignOrLease() {
        return signOrLease;
    }

    public void setSignOrLease(Integer signOrLease) {
        this.signOrLease = signOrLease;
    }

    public Double getCompleteRate() {
        return completeRate;
    }

    public void setCompleteRate(Double completeRate) {
        this.completeRate = completeRate;
    }

    public Integer getRoomsHasCandiate() {
        return roomsHasCandiate;
    }

    public void setRoomsHasCandiate(Integer roomsHasCandiate) {
        this.roomsHasCandiate = roomsHasCandiate;
    }

    public String getFloorPlan() {
        return floorPlan;
    }

    public void setFloorPlan(String floorPlan) {
        this.floorPlan = floorPlan;
    }

    public String getVitural() {
        return vitural;
    }

    public void setVitural(String vitural) {
        this.vitural = vitural;
    }

    public String getImages() {
        return images;
    }

    public void setImages(String images) {
        this.images = images;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(getClass().getSimpleName());
        sb.append(" [");
        sb.append("Hash = ").append(hashCode());
        sb.append(", propetyId=").append(propetyId);
        sb.append(", address=").append(address);
        sb.append(", totalRooms=").append(totalRooms);
        sb.append(", signOrLease=").append(signOrLease);
        sb.append(", completeRate=").append(completeRate);
        sb.append(", roomsHasCandiate=").append(roomsHasCandiate);
        sb.append(", floorPlan=").append(floorPlan);
        sb.append(", vitural=").append(vitural);
        sb.append(", images=").append(images);
        sb.append("]");
        return sb.toString();
    }
}