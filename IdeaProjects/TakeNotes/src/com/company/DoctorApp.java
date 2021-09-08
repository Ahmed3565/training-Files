package com.company;

public class DoctorApp {
    private String Name;
    private String medicalCondition;
    private Status medicalStatus;

    public DoctorApp(String name, String medicalCondition) {
        Name = name;
        this.medicalCondition = medicalCondition;
    }
    public DoctorApp(String name, String medicalCondition, Status medicalStatus) {
        Name = name;
        this.medicalCondition = medicalCondition;
        this.medicalStatus = medicalStatus;
    }

    public String getName() {
        return "Name : " + Name;
    }

    public void setName(String name) {
        Name = name;
    }

    public String getMedicalCondition() {
        return "Medical Condition : " + medicalCondition;
    }

    public void setMedicalCondition(String medicalCondition) {
        this.medicalCondition = medicalCondition;
    }

    public String getMedicalStatus() {
        if (medicalStatus.getStatus() != null && medicalStatus.getOrganStatus() != null) {
            return medicalStatus.getStatus() + " : " + medicalStatus.getOrganStatus();
        } else if (medicalStatus.getStatus() == null && medicalStatus.getOrganStatus() != null) {
            return medicalStatus.getOrganStatus();
        } else {
            return medicalStatus.getStatus();
        }

    }
    public void changeMedicalStatus (String newStatus) {
        medicalStatus.setOrganStatus(newStatus);
    }
}
