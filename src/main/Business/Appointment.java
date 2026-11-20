package main.Business;


import java.sql.Date;

public class Appointment {
    private String apptDateTime;
    private String patId;
    private String dentId;
    private String procCode;
    private String procName;
    private String proDesc;
    private float cost;

    public Appointment(String apptDateTime, String patId, String dentId, String procCode, String procName, String proDesc, float cost) {
        this.apptDateTime = apptDateTime;
        this.patId = patId;
        this.dentId = dentId;
        this.procCode = procCode;
        this.procName = procName;
        this.proDesc = proDesc;
        this.cost = cost;
    }

//    Get and Set methods
    public String getApptDateTime() { return apptDateTime; }
    public String getPatId() { return patId; }
    public String getDentId() { return dentId; }
    public String getProcCode() { return procCode; }
    public String getProcName() { return procName; }
    public String getProDesc() { return proDesc; }
    public float getCost() { return cost; }

    public void setApptDateTime(String apptDateTime) { this.apptDateTime = apptDateTime; }
    public void setPatId(String patId) { this.patId = patId; }
    public void setDentId(String dentId) { this.dentId = dentId; }
    public void setProcCode(String procCode) { this.procCode = procCode; }
    public void setProcName(String procName) { this.procName = procName; }
    public void setProDesc(String proDesc) { this.proDesc = proDesc; }
    public void setCost(float cost) { this.cost = cost; }
}
