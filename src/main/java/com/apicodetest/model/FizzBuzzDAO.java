package com.apicodetest.model;

import org.springframework.stereotype.Repository;

import java.util.List;

/**
 * The type Fizz buzz dao.
 */
@Repository
public class FizzBuzzDAO {

    private static FizzBuzz list = new FizzBuzz();

    /**
     * Add fizz buzz.
     *
     * @param replacedNumber the replaced number
     */
    public void addFizzBuzz(ReplacedNumber replacedNumber) {
        list.getFizzBuzzList().add(replacedNumber);
    }

    /**
     * Gets fizz buzz.
     *
     * @return the fizz buzz
     */
    public ReplacedNumber getFizzBuzz() {
        try {
            return list.getFizzBuzzList().get(list.size() - 1);
        } catch (Exception e) {
            e.printStackTrace();
            return null;
        }
    }

    /**
     * Gets stat int 1.
     *
     * @return the stat int 1
     */
    public List<Integer> getStatInt1() {
        return list.intMax(list.createInt1List());
    }

    /**
     * Gets stat int 2.
     *
     * @return the stat int 2
     */
    public List<Integer> getStatInt2() {
        return list.intMax(list.createInt2List());
    }

    /**
     * Gets stat limit.
     *
     * @return the stat limit
     */
    public List<Integer> getStatLimit() {
        return list.intMax(list.createLimitList());
    }

    /**
     * Gets stat str 1.
     *
     * @return the stat str 1
     */
    public List<String> getStatStr1() {
        return list.strMax(list.createStr1List());
    }

    /**
     * Gets stat str 2.
     *
     * @return the stat str 2
     */
    public List<String> getStatStr2() {
        return list.strMax(list.createStr2List());
    }

    /**
     * Gets size.
     *
     * @return the size
     */
    public String getSize() {
        return String.valueOf(list.size());
    }
}
