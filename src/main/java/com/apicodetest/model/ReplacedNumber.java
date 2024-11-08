package com.apicodetest.model;

import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import java.util.ArrayList;
import java.util.Objects;

/**
 * The type Replaced number.
 */
@NoArgsConstructor
@Getter
@Setter
public class ReplacedNumber {

    private int int1;

    private int int2;

    private int limit;

    private String str1;

    private String str2;

    /**
     * Instantiates a new Replaced number.
     *
     * @param int1Param  the int 1 param
     * @param int2Param  the int 2 param
     * @param limitParam the limit param
     * @param str1Param  the str 1 param
     * @param str2Param  the str 2 param
     */
    public ReplacedNumber(int int1Param, int int2Param, int limitParam, String str1Param, String str2Param) {

        super();

        this.int1 = int1Param;

        this.int2 = int2Param;

        this.limit = limitParam;

        this.str1 = str1Param;

        this.str2 = str2Param;
    }

    private ArrayList<String> createFizzBuzz() {
        ArrayList<String> fizzbuzz = new ArrayList<>();
        for (int i = 0; i < getLimit(); i++) {
            String output = "";
            if (i % getInt1() == 0)
                output = getStr1();
            if (i % getInt2() == 0)
                output = getStr2();
            if (Objects.equals(output, ""))
                output = String.valueOf(i);
            fizzbuzz.add(output);
        }

        return fizzbuzz;
    }

    @Override
    public String toString() {
        StringBuilder string = new StringBuilder();
        string.append(createFizzBuzz());
        return String.valueOf(string);
    }
}
