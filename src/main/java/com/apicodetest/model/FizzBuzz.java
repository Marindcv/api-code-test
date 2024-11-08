package com.apicodetest.model;

import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import java.util.*;
import java.util.function.Function;
import java.util.stream.Collectors;

/**
 * The type Fizz buzz.
 */
@NoArgsConstructor
@Getter
@Setter
public class FizzBuzz {

    private List<ReplacedNumber> fizzbuzzList;

    /**
     * The Integers count.
     */
    Map<Integer, Integer> integersCount = new HashMap<Integer, Integer>();

    /**
     * Gets fizz buzz list.
     *
     * @return the fizz buzz list
     */
    public List<ReplacedNumber> getFizzBuzzList() {

        if (null == fizzbuzzList)
            fizzbuzzList = new ArrayList<>();

        return fizzbuzzList;
    }

    /**
     * Size int.
     *
     * @return the int
     */
    public int size() {
        return fizzbuzzList.size();
    }

    /**
     * Create int 1 list list.
     *
     * @return the list
     */
    public List<Integer> createInt1List() {
        List<Integer> arr = new ArrayList<Integer>();
        for (int i = 0; i < fizzbuzzList.size(); i++) {
            arr.add(fizzbuzzList.get(i).getInt1());
        }
        return arr;
    }

    /**
     * Create int 2 list list.
     *
     * @return the list
     */
    public List<Integer> createInt2List() {
        List<Integer> arr = new ArrayList<Integer>();
        for (int i = 0; i < fizzbuzzList.size(); i++) {
            arr.add(fizzbuzzList.get(i).getInt2());
        }
        return arr;
    }

    /**
     * Create limit list list.
     *
     * @return the list
     */
    public List<Integer> createLimitList() {
        List<Integer> arr = new ArrayList<Integer>();
        for (int i = 0; i < fizzbuzzList.size(); i++) {
            arr.add(fizzbuzzList.get(i).getLimit());
        }
        return arr;
    }

    /**
     * Create str 1 list list.
     *
     * @return the list
     */
    public List<String> createStr1List() {
        List<String> arr = new ArrayList<String>();
        for (int i = 0; i < fizzbuzzList.size(); i++) {
            arr.add(fizzbuzzList.get(i).getStr1());
        }
        return arr;
    }

    /**
     * Create str 2 list list.
     *
     * @return the list
     */
    public List<String> createStr2List() {
        List<String> arr = new ArrayList<String>();
        for (int i = 0; i < fizzbuzzList.size(); i++) {
            arr.add(fizzbuzzList.get(i).getStr2());
        }
        return arr;
    }

    /**
     * Int max list.
     *
     * @param arr the arr
     * @return the list
     */
    public List<Integer> intMax(List<Integer> arr) {
        List<Integer> resultList = new ArrayList<>();

        Map<Integer, Long> f = arr
                .stream()
                .collect(Collectors.groupingBy(v -> v, Collectors.counting()));
        Integer maxOccurence =
                Collections.max(f.entrySet(), Comparator.comparing(Map.Entry::getValue)).getKey();
        Integer frequency =
                Collections.max(f.entrySet(), Comparator.comparing(Map.Entry::getValue)).getValue().intValue();

        resultList.add(maxOccurence);
        resultList.add(frequency);
        return resultList;
    }

    /**
     * Str max list.
     *
     * @param arr the arr
     * @return the list
     */
    public List<String> strMax(List<String> arr) {
        List<String> resultList = new ArrayList<>();

        Map<String, Long> f = arr
                .stream()
                .collect(Collectors.groupingBy(Function.identity(), Collectors.counting()));
        String mostFrequentString =
                Collections.max(f.entrySet(), Map.Entry.comparingByValue()).getKey();
        Integer frequency =
                Collections.max(f.entrySet(), Comparator.comparing(Map.Entry::getValue)).getValue().intValue();

        resultList.add(mostFrequentString);
        resultList.add(String.valueOf(frequency));
        return resultList;
    }

}
