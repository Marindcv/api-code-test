package com.apicodetest.model;

import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import java.util.*;
import java.util.function.Function;
import java.util.stream.Collectors;

@NoArgsConstructor
@Getter
@Setter
public class FizzBuzz {

    private List<ReplacedNumber> fizzbuzzList;

    Map<Integer, Integer> integersCount = new HashMap<Integer, Integer>();

    public List<ReplacedNumber> getFizzBuzzList() {

        if (null == fizzbuzzList)
            fizzbuzzList = new ArrayList<>();

        return fizzbuzzList;
    }

    public int size() {
        return fizzbuzzList.size();
    }

    public List<Integer> createInt1List() {
        List<Integer> arr = new ArrayList<Integer>();
        for (int i = 0; i < fizzbuzzList.size(); i++) {
            arr.add(fizzbuzzList.get(i).getInt1());
        }
        return arr;
    }

    public List<Integer> createInt2List() {
        List<Integer> arr = new ArrayList<Integer>();
        for (int i = 0; i < fizzbuzzList.size(); i++) {
            arr.add(fizzbuzzList.get(i).getInt2());
        }
        return arr;
    }

    public List<Integer> createLimitList() {
        List<Integer> arr = new ArrayList<Integer>();
        for (int i = 0; i < fizzbuzzList.size(); i++) {
            arr.add(fizzbuzzList.get(i).getLimit());
        }
        return arr;
    }

    public List<String> createStr1List() {
        List<String> arr = new ArrayList<String>();
        for (int i = 0; i < fizzbuzzList.size(); i++) {
            arr.add(fizzbuzzList.get(i).getStr1());
        }
        return arr;
    }

    public List<String> createStr2List() {
        List<String> arr = new ArrayList<String>();
        for (int i = 0; i < fizzbuzzList.size(); i++) {
            arr.add(fizzbuzzList.get(i).getStr2());
        }
        return arr;
    }

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
