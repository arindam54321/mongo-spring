package com.mongo.db.controller;

import com.mongo.db.model.AccountDTO;
import com.mongo.db.service.AccountService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("accounts")
public class AccountController {

    @Autowired
    AccountService accountService;

    @PostMapping("/add")
    public ResponseEntity<?> addAccount(@RequestBody AccountDTO accountDTO) {
        return ResponseEntity.ok(accountService.addAccount(accountDTO));
    }

    @GetMapping("/")
    public ResponseEntity<?> getAccounts() {
        return ResponseEntity.ok(accountService.getAccounts());
    }
}
