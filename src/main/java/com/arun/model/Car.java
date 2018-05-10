package com.arun.model;

import lombok.Getter;
import lombok.Setter;

import java.util.Optional;

/**
 * Created by Adwiti on 5/9/2018.
 */
@Getter
@Setter
public class Car {
    private String name;
    private String model;
    private boolean isInsurance;
    private Optional<Insurance> insurance;
}
