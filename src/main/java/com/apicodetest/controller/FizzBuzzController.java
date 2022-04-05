package com.apicodetest.controller;

import com.apicodetest.model.FizzBuzzDAO;
import com.apicodetest.model.ReplacedNumber;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.servlet.support.ServletUriComponentsBuilder;

import java.net.URI;

@RestController
@RequestMapping(path = "/fizzbuzz")
public class FizzBuzzController {

    @Autowired
    private FizzBuzzDAO fizzBuzzDAO;

    @GetMapping(path = "/",
            produces = "application/json")
    public ReplacedNumber getReplacedNumber() {
        return fizzBuzzDAO.getFizzBuzz(); //TODO return toString
    }

    @GetMapping(path = "/result", produces = "application/json")
    public String getReplacedNumberToString() {
        return fizzBuzzDAO.getFizzBuzz().toString();
    }

    @PostMapping(path = "/",
            consumes = "application/json",
            produces = "application/json")
    public ResponseEntity<Object> addFizzBuzz(@RequestBody ReplacedNumber replacedNumber) {
        fizzBuzzDAO.addFizzBuzz(replacedNumber);

        URI location = ServletUriComponentsBuilder
                .fromCurrentRequest()
                .path("/fizzbuzz")
                .buildAndExpand(replacedNumber.getLimit()).toUri();

        return ResponseEntity.created(location).build();
    }
}
