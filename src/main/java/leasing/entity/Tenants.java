package leasing.entity;

import java.util.Date;

public class Tenants {
    private String tenantsId;

    private String fullName;

    private String email;

    private String wechat;

    private String ssn;

    private String gender;

    private String source;

    private String background;

    private String customSourceCommissionTo;

    private String specialist;

    private Date registerDate;

    public String getTenantsId() {
        return tenantsId;
    }

    public void setTenantsId(String tenantsId) {
        this.tenantsId = tenantsId;
    }

    public String getFullName() {
        return fullName;
    }

    public void setFullName(String fullName) {
        this.fullName = fullName;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getWechat() {
        return wechat;
    }

    public void setWechat(String wechat) {
        this.wechat = wechat;
    }

    public String getSsn() {
        return ssn;
    }

    public void setSsn(String ssn) {
        this.ssn = ssn;
    }

    public String getGender() {
        return gender;
    }

    public void setGender(String gender) {
        this.gender = gender;
    }

    public String getSource() {
        return source;
    }

    public void setSource(String source) {
        this.source = source;
    }

    public String getBackground() {
        return background;
    }

    public void setBackground(String background) {
        this.background = background;
    }

    public String getCustomSourceCommissionTo() {
        return customSourceCommissionTo;
    }

    public void setCustomSourceCommissionTo(String customSourceCommissionTo) {
        this.customSourceCommissionTo = customSourceCommissionTo;
    }

    public String getSpecialist() {
        return specialist;
    }

    public void setSpecialist(String specialist) {
        this.specialist = specialist;
    }

    public Date getRegisterDate() {
        return registerDate;
    }

    public void setRegisterDate(Date registerDate) {
        this.registerDate = registerDate;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(getClass().getSimpleName());
        sb.append(" [");
        sb.append("Hash = ").append(hashCode());
        sb.append(", tenantsId=").append(tenantsId);
        sb.append(", fullName=").append(fullName);
        sb.append(", email=").append(email);
        sb.append(", wechat=").append(wechat);
        sb.append(", ssn=").append(ssn);
        sb.append(", gender=").append(gender);
        sb.append(", source=").append(source);
        sb.append(", background=").append(background);
        sb.append(", customSourceCommissionTo=").append(customSourceCommissionTo);
        sb.append(", specialist=").append(specialist);
        sb.append(", registerDate=").append(registerDate);
        sb.append("]");
        return sb.toString();
    }
}