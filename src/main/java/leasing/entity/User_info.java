package leasing.entity;

public class User_info {
    private String email;

    private String name;

    private Integer earned;

    private Integer performance;

    private Double moneyIsAlmostInYourPocket;

    private Integer leasingInProcess;

    private Integer balance;

    private Integer changePrice;

    private Integer changeLeasingInfo;

    private Integer priceApprove;

    private Integer confirmReverse;

    private Integer confirmFinal;

    private Integer tourApproval;

    private Integer parkingManage;

    private Integer adminPanel;

    private Integer salaryPanel;

    private Integer sortedFilesPanel;

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Integer getEarned() {
        return earned;
    }

    public void setEarned(Integer earned) {
        this.earned = earned;
    }

    public Integer getPerformance() {
        return performance;
    }

    public void setPerformance(Integer performance) {
        this.performance = performance;
    }

    public Double getMoneyIsAlmostInYourPocket() {
        return moneyIsAlmostInYourPocket;
    }

    public void setMoneyIsAlmostInYourPocket(Double moneyIsAlmostInYourPocket) {
        this.moneyIsAlmostInYourPocket = moneyIsAlmostInYourPocket;
    }

    public Integer getLeasingInProcess() {
        return leasingInProcess;
    }

    public void setLeasingInProcess(Integer leasingInProcess) {
        this.leasingInProcess = leasingInProcess;
    }

    public Integer getBalance() {
        return balance;
    }

    public void setBalance(Integer balance) {
        this.balance = balance;
    }

    public Integer getChangePrice() {
        return changePrice;
    }

    public void setChangePrice(Integer changePrice) {
        this.changePrice = changePrice;
    }

    public Integer getChangeLeasingInfo() {
        return changeLeasingInfo;
    }

    public void setChangeLeasingInfo(Integer changeLeasingInfo) {
        this.changeLeasingInfo = changeLeasingInfo;
    }

    public Integer getPriceApprove() {
        return priceApprove;
    }

    public void setPriceApprove(Integer priceApprove) {
        this.priceApprove = priceApprove;
    }

    public Integer getConfirmReverse() {
        return confirmReverse;
    }

    public void setConfirmReverse(Integer confirmReverse) {
        this.confirmReverse = confirmReverse;
    }

    public Integer getConfirmFinal() {
        return confirmFinal;
    }

    public void setConfirmFinal(Integer confirmFinal) {
        this.confirmFinal = confirmFinal;
    }

    public Integer getTourApproval() {
        return tourApproval;
    }

    public void setTourApproval(Integer tourApproval) {
        this.tourApproval = tourApproval;
    }

    public Integer getParkingManage() {
        return parkingManage;
    }

    public void setParkingManage(Integer parkingManage) {
        this.parkingManage = parkingManage;
    }

    public Integer getAdminPanel() {
        return adminPanel;
    }

    public void setAdminPanel(Integer adminPanel) {
        this.adminPanel = adminPanel;
    }

    public Integer getSalaryPanel() {
        return salaryPanel;
    }

    public void setSalaryPanel(Integer salaryPanel) {
        this.salaryPanel = salaryPanel;
    }

    public Integer getSortedFilesPanel() {
        return sortedFilesPanel;
    }

    public void setSortedFilesPanel(Integer sortedFilesPanel) {
        this.sortedFilesPanel = sortedFilesPanel;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(getClass().getSimpleName());
        sb.append(" [");
        sb.append("Hash = ").append(hashCode());
        sb.append(", email=").append(email);
        sb.append(", name=").append(name);
        sb.append(", earned=").append(earned);
        sb.append(", performance=").append(performance);
        sb.append(", moneyIsAlmostInYourPocket=").append(moneyIsAlmostInYourPocket);
        sb.append(", leasingInProcess=").append(leasingInProcess);
        sb.append(", balance=").append(balance);
        sb.append(", changePrice=").append(changePrice);
        sb.append(", changeLeasingInfo=").append(changeLeasingInfo);
        sb.append(", priceApprove=").append(priceApprove);
        sb.append(", confirmReverse=").append(confirmReverse);
        sb.append(", confirmFinal=").append(confirmFinal);
        sb.append(", tourApproval=").append(tourApproval);
        sb.append(", parkingManage=").append(parkingManage);
        sb.append(", adminPanel=").append(adminPanel);
        sb.append(", salaryPanel=").append(salaryPanel);
        sb.append(", sortedFilesPanel=").append(sortedFilesPanel);
        sb.append("]");
        return sb.toString();
    }
}