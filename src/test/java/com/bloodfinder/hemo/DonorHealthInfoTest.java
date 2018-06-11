package com.bloodfinder.hemo;

import com.bloodfinder.hemo.dto.*;
import com.bloodfinder.hemo.utils.ObjectMapperUtil;
import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.ObjectMapper;
import org.junit.Test;
import org.springframework.beans.factory.annotation.Autowired;

import java.util.Date;

/**
 * @project hemo
 * @authore dgunda on 6/10/18
 */
public class DonorHealthInfoTest {
//    @Autowired
//    ObjectMapperUtil objectMapperUtil;

    @Test
    public void testDonorTestInfoDto(){
        DonorHealthInfo donorHealthInfo = new DonorHealthInfo();
        donorHealthInfo.setDisease("no disease");
        donorHealthInfo.setDrinking(false);
        donorHealthInfo.setSmoking(false);
        donorHealthInfo.setLastDateOfDonation(new Date());

        DonorAddress donorAddress = new DonorAddress();
        donorAddress.setAddress("170 Pasito Ter");
        donorAddress.setCity("Sunnyvale");
        donorAddress.setDistrict("Santa Clara");
        donorAddress.setState("CA");
        donorAddress.setCountry("USA");
        donorAddress.setZipCode("94086");

        BloodType bloodType = BloodType.O_POSITIVE;

        Gender gender = Gender.FEMALE;

        Donor donor = new Donor();
        donor.setFirstName("Harinya");
        donor.setLastName("Gunda");
        donor.setAge(26);
        donor.setBloodType(bloodType);
        donor.setDisplayName("papps");
        donor.setDonorId("HYD-1001");
        donor.setDonorAddress(donorAddress);
        donor.setGender(gender);
        donor.setPhoneNumber("000-000-1010");
        donor.setEmailId("gh@gmail.com");


        ObjectMapperUtil objectMapperUtil = new ObjectMapperUtil();
        try {
            String output = objectMapperUtil.getObjectMapper().writeValueAsString(donor);
            System.out.println(output);
        } catch (JsonProcessingException e) {
            e.printStackTrace();
        }
    }
}
