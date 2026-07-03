package com.cognizant.account_service.controller;

import com.cognizant.account_service.model.Account;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class AccountController {

    @GetMapping("/accounts/{number}")
    public Account getAccount(@PathVariable String number) {
        // Return a mock Account matching the requested account number for validation
        return new Account(number, "savings", 5000.0);
    }
}
