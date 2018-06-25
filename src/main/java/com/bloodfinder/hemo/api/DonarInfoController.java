package com.bloodfinder.hemo.api;

import com.bloodfinder.hemo.dto.*;
import org.springframework.http.HttpStatus;
import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.Date;

/**
 * @project hemo
 * @authore dgunda on 6/10/18
 */
@RestController
public class DonarInfoController {
    @RequestMapping("/")
    public String index(){
        return "Blood Donor info";
    }
    @RequestMapping(value = "/getdonorinfo/", method = RequestMethod.GET, produces = MediaType.APPLICATION_JSON_VALUE)
    public ResponseEntity<DonorInfo> gerDonorInfo(){
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

        return new ResponseEntity<DonorInfo>(donorInfo, HttpStatus.OK);

    }
}
