package com.example.wftest;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;


/**
 * HomeController
 */
@RestController
@RequestMapping("/")
public class HomeController {
    public HomeController() {
    }

    @Autowired
    private JdbcTemplate jdbcTemplate;

    @GetMapping
    public String getString() {
        /*tring sql = "INSERT INTO multiplication (id, value) VALUES ("
                + "0, 3.14)";

        int rows = jdbcTemplate.update(sql);
        if (rows > 0) {
            System.out.println("A new row has been inserted.");
        }*/
        return "Go to /testpi to view all Pi multiplication results.";
    }
}