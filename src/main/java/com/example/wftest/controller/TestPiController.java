package com.example.wftest.controller;

import com.example.wftest.entity.TestPi;
import com.example.wftest.repository.TestPiRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.ArrayList;
import java.util.List;

@RestController
public class TestPiController {
    @Autowired
    private TestPiRepository testPiRepo;
    @GetMapping("/run")
    public void run(Model model) { // Benchmark
        double pi = Math.PI;
        List<Double> piArray = new ArrayList<Double>();  // List of pi to increasy memory load
        // Endless loop for CPU and memory load
        do {
            TestPi testPi = new TestPi();
            if (Double.isInfinite(pi * Math.PI)) { // Checking if "pi" is reached double variable maximum
                pi = 0; // Set "pi" to zero if reached
            }
            pi *= Math.PI; // Main CPU load - multiply operation
            testPi.setValue(pi); // Set new "pi" value before write it to PGSQL database

            // Additional memory and CPU load. A new "pi" value adds to the list 100 000 times
            for(int i = 0; i < 100000; i++)
                piArray.add(pi);

            testPiRepo.save(testPi); // Write the "pi" value to PGSQL database
        } while (true);
    }

    @GetMapping("/testpi")
    public   List<TestPi>  listAll(Model model) {
        return testPiRepo.findAll();
    }

}