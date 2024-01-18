package leasing.entity;

import java.util.Date;

public class Tour {
    private String tourId;

    private String leasingId;

    private String tenantId;

    private String unitId1;

    private String unitId2;

    private Date date;

    private Date time;

    private String status;

    private Date submitTime;

    private String reviewer;

    private String specialist;

    public String getTourId() {
        return tourId;
    }

    public void setTourId(String tourId) {
        this.tourId = tourId;
    }

    public String getLeasingId() {
        return leasingId;
    }

    public void setLeasingId(String leasingId) {
        this.leasingId = leasingId;
    }

    public String getTenantId() {
        return tenantId;
    }

    public void setTenantId(String tenantId) {
        this.tenantId = tenantId;
    }

    public String getUnitId1() {
        return unitId1;
    }

    public void setUnitId1(String unitId1) {
        this.unitId1 = unitId1;
    }

    public String getUnitId2() {
        return unitId2;
    }

    public void setUnitId2(String unitId2) {
        this.unitId2 = unitId2;
    }

    public Date getDate() {
        return date;
    }

    public void setDate(Date date) {
        this.date = date;
    }

    public Date getTime() {
        return time;
    }

    public void setTime(Date time) {
        this.time = time;
    }

    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status;
    }

    public Date getSubmitTime() {
        return submitTime;
    }

    public void setSubmitTime(Date submitTime) {
        this.submitTime = submitTime;
    }

    public String getReviewer() {
        return reviewer;
    }

    public void setReviewer(String reviewer) {
        this.reviewer = reviewer;
    }

    public String getSpecialist() {
        return specialist;
    }

    public void setSpecialist(String specialist) {
        this.specialist = specialist;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(getClass().getSimpleName());
        sb.append(" [");
        sb.append("Hash = ").append(hashCode());
        sb.append(", tourId=").append(tourId);
        sb.append(", leasingId=").append(leasingId);
        sb.append(", tenantId=").append(tenantId);
        sb.append(", unitId1=").append(unitId1);
        sb.append(", unitId2=").append(unitId2);
        sb.append(", date=").append(date);
        sb.append(", time=").append(time);
        sb.append(", status=").append(status);
        sb.append(", submitTime=").append(submitTime);
        sb.append(", reviewer=").append(reviewer);
        sb.append(", specialist=").append(specialist);
        sb.append("]");
        return sb.toString();
    }
}