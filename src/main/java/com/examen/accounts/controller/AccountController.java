package com.examen.accounts.controller;

import com.examen.accounts.model.AccountResponse;
import com.examen.accounts.service.IAccountService;
import io.reactivex.Single;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class AccountController {

    @Autowired
    IAccountService service;

    @GetMapping("/core/account/cardNumber={carNumber}")
    public Single<AccountResponse> findAccountResponse(@PathVariable String carNumber){

        return service.findAccountResponse(carNumber);
    }
}
