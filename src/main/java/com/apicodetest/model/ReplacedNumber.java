package com.apicodetest.model;

import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import java.util.ArrayList;

@NoArgsConstructor
@Getter
@Setter
public class ReplacedNumber {

    private int int1;

    private int int2;

    private int limit;

    private String str1;

    private String str2;

    public ReplacedNumber(int int1, int int2, int limit, String str1, String str2) {

        super();

        this.int1 = int1;

        this.int2 = int2;

        this.limit = limit;

        this.str1 = str1;

        this.str2 = str2;
    }

    private ArrayList<String> createFizzBuzz() {
        ArrayList<String> fizzbuzz = new ArrayList<String>();
        for (int i = 0; i < getLimit(); i++) {
            if (i % getInt1() == 0 && i % getInt2() == 0)
                fizzbuzz.add(getStr1().concat(getStr2()));
            else if (i % getInt1() == 0)
                fizzbuzz.add(getStr1());
            else if (i % getInt2() == 0)
                fizzbuzz.add(getStr2());
            else fizzbuzz.add(Integer.toString(i));

        }

        return fizzbuzz;
    }

    @Override
    public String toString() {
        StringBuilder string = new StringBuilder();
        string.append("FizzBuzz [");
        string.append(createFizzBuzz());
        string.append("]");
        return String.valueOf(string);
    }
}
