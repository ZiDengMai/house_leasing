package leasing.entity;

import java.util.Date;

public class Payment_history {
    private Long paymentId;

    private String specialistId;

    private Date date;

    private Integer amount;

    private String type;

    private String actionFrom;

    private String statement;

    public Long getPaymentId() {
        return paymentId;
    }

    public void setPaymentId(Long paymentId) {
        this.paymentId = paymentId;
    }

    public String getSpecialistId() {
        return specialistId;
    }

    public void setSpecialistId(String specialistId) {
        this.specialistId = specialistId;
    }

    public Date getDate() {
        return date;
    }

    public void setDate(Date date) {
        this.date = date;
    }

    public Integer getAmount() {
        return amount;
    }

    public void setAmount(Integer amount) {
        this.amount = amount;
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    public String getActionFrom() {
        return actionFrom;
    }

    public void setActionFrom(String actionFrom) {
        this.actionFrom = actionFrom;
    }

    public String getStatement() {
        return statement;
    }

    public void setStatement(String statement) {
        this.statement = statement;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(getClass().getSimpleName());
        sb.append(" [");
        sb.append("Hash = ").append(hashCode());
        sb.append(", paymentId=").append(paymentId);
        sb.append(", specialistId=").append(specialistId);
        sb.append(", date=").append(date);
        sb.append(", amount=").append(amount);
        sb.append(", type=").append(type);
        sb.append(", actionFrom=").append(actionFrom);
        sb.append(", statement=").append(statement);
        sb.append("]");
        return sb.toString();
    }
}