package leasing.entity;

import java.util.Date;

public class Log_info {
    private String logId;

    private String tenantsId;

    private String processId;

    private String type;

    private String note;

    private Date timeStamp;

    private String actionFrom;

    public String getLogId() {
        return logId;
    }

    public void setLogId(String logId) {
        this.logId = logId;
    }

    public String getTenantsId() {
        return tenantsId;
    }

    public void setTenantsId(String tenantsId) {
        this.tenantsId = tenantsId;
    }

    public String getProcessId() {
        return processId;
    }

    public void setProcessId(String processId) {
        this.processId = processId;
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    public String getNote() {
        return note;
    }

    public void setNote(String note) {
        this.note = note;
    }

    public Date getTimeStamp() {
        return timeStamp;
    }

    public void setTimeStamp(Date timeStamp) {
        this.timeStamp = timeStamp;
    }

    public String getActionFrom() {
        return actionFrom;
    }

    public void setActionFrom(String actionFrom) {
        this.actionFrom = actionFrom;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(getClass().getSimpleName());
        sb.append(" [");
        sb.append("Hash = ").append(hashCode());
        sb.append(", logId=").append(logId);
        sb.append(", tenantsId=").append(tenantsId);
        sb.append(", processId=").append(processId);
        sb.append(", type=").append(type);
        sb.append(", note=").append(note);
        sb.append(", timeStamp=").append(timeStamp);
        sb.append(", actionFrom=").append(actionFrom);
        sb.append("]");
        return sb.toString();
    }
}