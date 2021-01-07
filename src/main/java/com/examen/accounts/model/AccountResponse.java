package com.examen.accounts.model;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@AllArgsConstructor
@Data
@NoArgsConstructor
public class AccountResponse {

    private String accountNumber;
    private Integer amount;

}
