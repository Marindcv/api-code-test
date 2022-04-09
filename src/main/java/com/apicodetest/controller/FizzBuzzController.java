package com.apicodetest.controller;

import com.apicodetest.model.FizzBuzzDAO;
import com.apicodetest.model.ReplacedNumber;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping
public class FizzBuzzController {

    @Autowired
    private FizzBuzzDAO fizzBuzzDAO;

    @GetMapping(path = "/stat", produces = "application/json")
    public String getStat() {
        StringBuilder sb = new StringBuilder();
        sb.append("Most frequent Int1 : ");
        sb.append(fizzBuzzDAO.getStatInt1().get(0));
        sb.append("\n");
        sb.append("Number of occurrence for Int1 : ");
        sb.append(fizzBuzzDAO.getStatInt1().get(1));
        sb.append("\n");
        sb.append("Most frequent Int2 : ");
        sb.append(fizzBuzzDAO.getStatInt2().get(0));
        sb.append("\n");
        sb.append("Number of occurrence for Int2 : ");
        sb.append(fizzBuzzDAO.getStatInt2().get(1));
        sb.append("\n");
        sb.append("Most frequent Limit : ");
        sb.append(fizzBuzzDAO.getStatLimit());
        sb.append("\n");
        sb.append("Number of occurrence for Limit : ");
        sb.append(fizzBuzzDAO.getStatLimit().get(1));
        sb.append("\n");
        sb.append("Most frequent str1 : ");
        sb.append(fizzBuzzDAO.getStatStr1());
        sb.append("\n");
        sb.append("Number of occurrence for Str1 : ");
        sb.append(fizzBuzzDAO.getStatStr1().get(1));
        sb.append("\n");
        sb.append("Most frequent str2 : ");
        sb.append(fizzBuzzDAO.getStatStr2());
        sb.append("\n");
        sb.append("Number of occurrence for Str2 : ");
        sb.append(fizzBuzzDAO.getStatStr2().get(1));
        sb.append("\n");
        sb.append("Number of POST call : ");
        sb.append(fizzBuzzDAO.getSize());
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
