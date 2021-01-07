package com.examen.accounts.service;

import com.examen.accounts.model.AccountResponse;
import io.reactivex.Single;

public interface IAccountService {

    public Single<AccountResponse> findAccountResponse (String carNumber);

}
