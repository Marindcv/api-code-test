package com.apicodetest.model;

import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

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
        int mostFrequentNumber = 0;
        int frequency = 0;
        for (int i : arr) {
            int mostFrequentNumberJ = 0;
            int frequencyJ = 0;
            for (int j : arr) {
                if (i == j) {
                    frequencyJ++;
                    mostFrequentNumberJ = i;
                }
            }
            if (frequencyJ > frequency) {
                frequency = frequencyJ;
                mostFrequentNumber = mostFrequentNumberJ;
            }
        }
        if (mostFrequentNumber == 0) {
            mostFrequentNumber = arr.get(0);
            frequency = 1;
        }
        resultList.add(mostFrequentNumber);
        resultList.add(frequency);
        return resultList;
    }

    public List<String> strMax(List<String> arr) {
        List<String> resultList = new ArrayList<>();
        String mostFrequentString = new String();
        int frequency = 0;
        for (int i = 0; i < arr.size(); i++) {
            String mostFrequentStringJ = new String();
            int frequencyJ = 0;
            for (int j = 0; j < arr.size(); j++) {
                if (arr.get(i).equals(arr.get(j))) {
                    frequencyJ++;
                    mostFrequentStringJ = arr.get(i);
                }
            }
            if (frequencyJ > frequency) {
                frequency = frequencyJ;
                mostFrequentString = mostFrequentStringJ;
            }
        }
        if (mostFrequentString == null) {
            mostFrequentString = arr.get(0);
            frequency = 1;
        }
        resultList.add(mostFrequentString);
        resultList.add(String.valueOf(frequency));
        return resultList;
    }

}
