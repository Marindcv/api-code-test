package com.apicodetest.model;

import org.springframework.stereotype.Repository;

@Repository
public class FizzBuzzDAO {

    private static FizzBuzz list = new FizzBuzz();

    public void addFizzBuzz(ReplacedNumber replacedNumber) {
        list.getFizzBuzzList().add(replacedNumber);
    }

    public ReplacedNumber getFizzBuzz() {
        return list.getFizzBuzzList().get(-1);
    }
}
