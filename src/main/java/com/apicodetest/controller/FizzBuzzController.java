package com.apicodetest.controller;

import com.apicodetest.model.BuildString;
import com.apicodetest.model.FizzBuzzDAO;
import com.apicodetest.model.ReplacedNumber;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

/**
 * The type Fizz buzz controller.
 */
@RestController
@RequestMapping
public class FizzBuzzController {

    @Autowired
    private FizzBuzzDAO fizzBuzzDAO;

    /**
     * Gets stat.
     *
     * @return the stat
     */
    @GetMapping(path = "/stat", produces = "application/json")
    public String getStat() {
        BuildString st = new BuildString();
        return st.buildAString(fizzBuzzDAO);
    }

    /**
     * Add fizz buzz string.
     *
     * @param replacedNumber the replaced number
     * @return the string
     */
    @PostMapping(path = "/",
            consumes = "application/json",
            produces = "application/json")
    public String addFizzBuzz(@RequestBody ReplacedNumber replacedNumber) {
        fizzBuzzDAO.addFizzBuzz(replacedNumber);

        return fizzBuzzDAO.getFizzBuzz().toString();
    }
}
