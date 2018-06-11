package com.bloodfinder.hemo.dto;

/**
 * @project hemo
 * @authore dgunda on 6/10/18
 */
public enum BloodType {
    A_POSITIVE,
    A_NEGATIVE,
    B_POSITIVE,
    B_NEGATIVE,
    AB_POSITIVE,
    AB_NEGATIVE,
    O_POSITIVE,
    O_NEGATIVE;

    @Override
    public String toString() {
        return "BloodType{}";
    }
}
