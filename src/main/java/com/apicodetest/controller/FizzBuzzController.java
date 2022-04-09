package com.apicodetest.controller;

import com.apicodetest.model.FizzBuzzDAO;
import com.apicodetest.model.ReplacedNumber;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping(path = "/fizzbuzz")
public class FizzBuzzController {

    @Autowired
    private FizzBuzzDAO fizzBuzzDAO;

    @GetMapping(path = "/stat", produces = "application/json")
    public String getStat() {
        StringBuilder sb = new StringBuilder();
        sb.append("Most frequent Int1 : ");
        sb.append(fizzBuzzDAO.getStatInt1());
        sb.append("\n");
        sb.append("Most frequent Int2 : ");
        sb.append(fizzBuzzDAO.getStatInt2());
        sb.append("\n");
        sb.append("Most frequent Limit : ");
        sb.append(fizzBuzzDAO.getStatLimit());
        sb.append("\n");
        sb.append("Most frequent str1 : ");
        sb.append(fizzBuzzDAO.getStatStr1());
        sb.append("\n");
        sb.append("Most frequent str2 : ");
        sb.append(fizzBuzzDAO.getStatStr2());
        return String.valueOf(sb);
    }

    @PostMapping(path = "/",
            consumes = "application/json",
            produces = "application/json")
    public String addFizzBuzz(@RequestBody ReplacedNumber replacedNumber) {
        fizzBuzzDAO.addFizzBuzz(replacedNumber);

        return fizzBuzzDAO.getFizzBuzz().toString();
    }
}
