package leasing.entity;

public class Parking_spot {
    private String propertyId;

    private Integer spotNumber;

    private Integer leasingId;

    private String roomId;

    private Integer available;

    private String make;

    private String model;

    private String parkingSpotcol;

    private String bodyType;

    private String node;

    public String getPropertyId() {
        return propertyId;
    }

    public void setPropertyId(String propertyId) {
        this.propertyId = propertyId;
    }

    public Integer getSpotNumber() {
        return spotNumber;
    }

    public void setSpotNumber(Integer spotNumber) {
        this.spotNumber = spotNumber;
    }

    public Integer getLeasingId() {
        return leasingId;
    }

    public void setLeasingId(Integer leasingId) {
        this.leasingId = leasingId;
    }

    public String getRoomId() {
        return roomId;
    }

    public void setRoomId(String roomId) {
        this.roomId = roomId;
    }

    public Integer getAvailable() {
        return available;
    }

    public void setAvailable(Integer available) {
        this.available = available;
    }

    public String getMake() {
        return make;
    }

    public void setMake(String make) {
        this.make = make;
    }

    public String getModel() {
        return model;
    }

    public void setModel(String model) {
        this.model = model;
    }

    public String getParkingSpotcol() {
        return parkingSpotcol;
    }

    public void setParkingSpotcol(String parkingSpotcol) {
        this.parkingSpotcol = parkingSpotcol;
    }

    public String getBodyType() {
        return bodyType;
    }

    public void setBodyType(String bodyType) {
        this.bodyType = bodyType;
    }

    public String getNode() {
        return node;
    }

    public void setNode(String node) {
        this.node = node;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(getClass().getSimpleName());
        sb.append(" [");
        sb.append("Hash = ").append(hashCode());
        sb.append(", propertyId=").append(propertyId);
        sb.append(", spotNumber=").append(spotNumber);
        sb.append(", leasingId=").append(leasingId);
        sb.append(", roomId=").append(roomId);
        sb.append(", available=").append(available);
        sb.append(", make=").append(make);
        sb.append(", model=").append(model);
        sb.append(", parkingSpotcol=").append(parkingSpotcol);
        sb.append(", bodyType=").append(bodyType);
        sb.append(", node=").append(node);
        sb.append("]");
        return sb.toString();
    }
}