package com.mongo.db.controller;

import com.mongo.db.model.AccountDTO;
import com.mongo.db.service.AccountService;
import com.mongo.db.utils.ResponseWrapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@CrossOrigin
@RestController
@RequestMapping("accounts")
public class AccountController {

    @Autowired
    AccountService accountService;

    @GetMapping(value = "/")
    public ResponseEntity<?> getAccounts() {
        ResponseWrapper response
                = ResponseWrapper.getResponse(accountService.getAccounts(), HttpStatus.OK);
        return new ResponseEntity<>(response, HttpStatus.OK);
    }

    @PostMapping(value = "/add", produces = MediaType.APPLICATION_JSON_VALUE)
    public ResponseEntity<?> addAccount(@RequestBody AccountDTO accountDTO) {
        System.out.println(accountDTO.toString());
        ResponseWrapper response
                = ResponseWrapper.getResponse(accountService.addAccount(accountDTO), HttpStatus.OK);
        return new ResponseEntity<>(response, HttpStatus.OK);
    }

    @DeleteMapping("/delete/{id}")
    public ResponseEntity<?> deleteAccount(@PathVariable("id") Integer id) {
        ResponseWrapper response
                = ResponseWrapper.getResponse(accountService.deleteAccount(id), HttpStatus.OK);
        return new ResponseEntity<>(response, HttpStatus.OK);
    }
}
