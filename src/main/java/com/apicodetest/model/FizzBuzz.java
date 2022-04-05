package com.apicodetest.model;

import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import java.util.ArrayList;
import java.util.List;

@NoArgsConstructor
@Getter
@Setter
public class FizzBuzz {

    private List<ReplacedNumber> fizzbuzzList;

    public List<ReplacedNumber> getFizzBuzzList() {

        if (null == fizzbuzzList)
            fizzbuzzList = new ArrayList<>();

        return fizzbuzzList;
    }

    public int size() {
        return fizzbuzzList.size();
    }
}
