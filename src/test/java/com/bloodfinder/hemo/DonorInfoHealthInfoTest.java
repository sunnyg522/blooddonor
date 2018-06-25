package com.bloodfinder.hemo;

import com.bloodfinder.hemo.dto.*;
import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.ObjectMapper;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

import java.util.Date;

/**
 * @project hemo
 * @authore dgunda on 6/10/18
 */
@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration(classes = {HemoApplication.class})
public class DonorInfoHealthInfoTest {
    @Autowired
    ObjectMapper objectMapper;

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

        DonorInfo donorInfo = new DonorInfo();
        donorInfo.setFirstName("Harinya");
        donorInfo.setLastName("Gunda");
        donorInfo.setAge(26);
        donorInfo.setBloodType(bloodType);
        donorInfo.setDisplayName("papps");
        donorInfo.setDonorId("HYD-1001");
        donorInfo.setDonorAddress(donorAddress);
        donorInfo.setGender(gender);
        donorInfo.setPhoneNumber("000-000-1010");
        donorInfo.setEmailId("gh@gmail.com");

        try {
            String output = objectMapper.writeValueAsString(donorInfo);
            System.out.println(output);
        } catch (JsonProcessingException e) {
            e.printStackTrace();
        }
    }
}
