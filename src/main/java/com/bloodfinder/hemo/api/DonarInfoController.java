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
    public ResponseEntity<Donor> gerDonorInfo(){
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

        return new ResponseEntity<Donor>(donor, HttpStatus.OK);

    }
}
