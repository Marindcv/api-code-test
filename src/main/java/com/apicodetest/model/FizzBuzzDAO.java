package com.apicodetest.model;

import org.springframework.stereotype.Repository;

import java.util.List;

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

    public List<Integer> getStatInt1() {
        return list.intMax(list.createInt1List());
    }

    public List<Integer> getStatInt2() {
        return list.intMax(list.createInt2List());
    }

    public List<Integer> getStatLimit() {
        return list.intMax(list.createLimitList());
    }

    public List<String> getStatStr1() {
        return list.strMax(list.createStr1List());
    }

    public List<String> getStatStr2() {
        return list.strMax(list.createStr2List());
    }

    public String getSize() {
        return String.valueOf(list.size());
    }
}
