package com.company;

public class Status {
    private String OrganStatus;
    private String Status;

    public Status(String organStatus) {
        OrganStatus = organStatus;
    }
    public Status(String status, String organStatus) {
        OrganStatus = organStatus;
        Status = status;
    }

    public String getOrganStatus() {
        return OrganStatus;
    }

    public void setOrganStatus(String organStatus) {
        OrganStatus = organStatus;
    }

    public String getStatus() {
        return Status;
    }
}
