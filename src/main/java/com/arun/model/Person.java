package com.arun.model;

import lombok.Getter;
import lombok.Setter;

import java.util.Optional;

/**
 * Created by Adwiti on 5/9/2018.
 */
@Getter
@Setter
public class Person {
    private String name;
    private int age;
    private Optional<Car> car;
}
