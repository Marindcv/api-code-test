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

    public int intMax(List<Integer> arr) {
        int max = 0;
        for (int i : arr) {
            int maxj = 0;
            for (int j : arr) {
                maxj = i == j ? maxj : maxj++;
            }
            max = maxj > max ? i : max;
        }
        if (max == 0) {
            max = arr.get(0);
        }
        return max;
    }


}
