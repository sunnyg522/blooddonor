package com.bloodfinder.hemo.dto;

import java.util.Date;

/**
 * @project hemo
 * @authore dgunda on 6/10/18
 */
public class DonorHealthInfo {
    private boolean smoking;
    private boolean drinking;
    private String disease;
    private Date lastDateOfDonation;

    public boolean isSmoking() {
        return smoking;
    }

    public void setSmoking(boolean smoking) {
        this.smoking = smoking;
    }

    public boolean isDrinking() {
        return drinking;
    }

    public void setDrinking(boolean drinking) {
        this.drinking = drinking;
    }

    public String getDisease() {
        return disease;
    }

    public void setDisease(String disease) {
        this.disease = disease;
    }

    public Date getLastDateOfDonation() {
        return lastDateOfDonation;
    }

    public void setLastDateOfDonation(Date lastDateOfDonation) {
        this.lastDateOfDonation = lastDateOfDonation;
    }

    @Override
    public String toString() {
        return "DonorHealthInfo{" +
                "smoking=" + smoking +
                ", drinking=" + drinking +
                ", disease='" + disease + '\'' +
                ", lastDateOfDonation=" + lastDateOfDonation +
                '}';
    }
}
