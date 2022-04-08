package com.apicodetest.model;

import org.springframework.stereotype.Repository;

@Repository
public class FizzBuzzDAO {

    private static FizzBuzz list = new FizzBuzz();

    public void addFizzBuzz(ReplacedNumber replacedNumber) {
        list.getFizzBuzzList().add(replacedNumber);
    }

    public ReplacedNumber getFizzBuzz() {
        try {
            return list.getFizzBuzzList().get(list.size() - 1);
        } catch (Exception e) {
            e.printStackTrace();
            return null;
        }
    }

    public int getStatInt1() {
        return list.intMax(list.createInt1List());
    }

    public int getStatInt2() {
        return list.intMax(list.createInt2List());
    }

    public int getStatLimit() {
        return list.intMax(list.createLimitList());
    }
}
