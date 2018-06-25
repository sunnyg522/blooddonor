package com.bloodfinder.hemo.dto;

import com.datastax.driver.mapping.annotations.Column;
import com.datastax.driver.mapping.annotations.PartitionKey;
import com.datastax.driver.mapping.annotations.Table;

/**
 * @project hemo
 * @authore dgunda on 6/10/18
 */
@Table(keyspace = "donorinfo", name = "donor_info_table",
        readConsistency = "QUORUM",
        writeConsistency = "QUORUM",
        caseSensitiveKeyspace = false,
        caseSensitiveTable = false)
public class DonorInfo {
    @PartitionKey
    @Column(name = "donor_id")
    private String donorId;
    @Column(name = "firs_name")
    private String firstName;
    @Column(name = "last_name")
    private String lastName;
    private String displayName;
    @Column(name = "email_id")
    private String emailId;
    @Column(name = "phone_number")
    private String phoneNumber;
    private int age;
    private Gender gender;
    private DonorAddress donorAddress;
    private BloodType bloodType;

    public String getDonorId() {
        return donorId;
    }

    public void setDonorId(String donorId) {
        this.donorId = donorId;
    }

    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public String getEmailId() {
        return emailId;
    }

    public void setEmailId(String emailId) {
        this.emailId = emailId;
    }

    public String getPhoneNumber() {
        return phoneNumber;
    }

    public void setPhoneNumber(String phoneNumber) {
        this.phoneNumber = phoneNumber;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }


    public DonorAddress getDonorAddress() {
        return donorAddress;
    }

    public void setDonorAddress(DonorAddress donorAddress) {
        this.donorAddress = donorAddress;
    }

    public BloodType getBloodType() {
        return bloodType;
    }

    public void setBloodType(BloodType bloodType) {
        this.bloodType = bloodType;
    }

    public String getDisplayName() {
        return displayName;
    }

    public void setDisplayName(String displayName) {
        this.displayName = displayName;
    }

    public Gender getGender() {
        return gender;
    }

    public void setGender(Gender gender) {
        this.gender = gender;
    }

    @Override
    public String toString() {
        return "Donor{" +
                "donorId='" + donorId + '\'' +
                ", firstName='" + firstName + '\'' +
                ", lastName='" + lastName + '\'' +
                ", displayName='" + displayName + '\'' +
                ", emailId='" + emailId + '\'' +
                ", phoneNumber='" + phoneNumber + '\'' +
                ", age=" + age +
                ", gender=" + gender +
                ", donorAddress=" + donorAddress +
                ", bloodType=" + bloodType +
                '}';
    }
}
