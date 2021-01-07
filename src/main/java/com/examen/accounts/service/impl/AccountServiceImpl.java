package com.examen.accounts.service.impl;

import com.examen.accounts.model.AccountResponse;
import com.examen.accounts.service.IAccountService;
import io.reactivex.Completable;
import io.reactivex.Single;
import lombok.SneakyThrows;
import org.springframework.stereotype.Service;
import org.springframework.web.bind.annotation.RequestHeader;

import java.util.ArrayList;
import java.util.List;


@Service
public class AccountServiceImpl implements IAccountService {
    @SneakyThrows
    @Override
    public Single<AccountResponse> findAccountResponse(String carNumber) {
        //Completable.fromObservable(Single.just(saveAccountResponse(carNumber)).toObservable()).
        Thread.sleep(5000);
        return Single.just(saveAccountResponse(carNumber));

    }

    public AccountResponse saveAccountResponse(String carNumber){

        char ultimoCaracter = carNumber.charAt(carNumber.length()-1);

        return ultimoCaracter =='1' ?
                    new AccountResponse(carNumber.concat("XXX"), 1000):
                    ultimoCaracter == '2'?
                        new AccountResponse(carNumber.concat("XXX"), 500):
                        new AccountResponse(carNumber.concat("XXX"), 1500);


    }

}
