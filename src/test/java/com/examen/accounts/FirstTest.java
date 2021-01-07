package com.examen.accounts;

import com.examen.accounts.model.AccountResponse;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import org.springframework.boot.test.context.SpringBootTest;

@SpringBootTest
public class FirstTest {

    @Test
    public void getInstanceAccountResponse(){
        AccountResponse account = new AccountResponse("test",1);
        Assertions.assertNotNull(account);

    }

    @Test
    public void getNumberAccountResponse(){
        AccountResponse account = new AccountResponse("test",1);
        account.setAccountNumber("test2");
        Assertions.assertEquals(account.getAccountNumber(), "test2");
    }

    @Test
    public void getAmountAccountResponse(){
        AccountResponse account = new AccountResponse("test",1);
        account.setAmount(2);
        Assertions.assertEquals(account.getAmount(), 2);

    }

    @Test
    public void getAccountResponse(){
        AccountResponse account = new AccountResponse();
        Assertions.assertNotNull(account);
    }
    @Test
    public void equalAccountResponse(){
        AccountResponse account = new AccountResponse("test",1);
        AccountResponse account2 = new AccountResponse("test",1);
        account.setAccountNumber("1");
        account.toString();
        account.equals(account2);
        account.hashCode();
        Assertions.assertTrue(account.getAccountNumber().equals("1"));

    }
    @Test
    public void equalAccountResponse2(){
        AccountResponse account = new AccountResponse("test",1);
        AccountResponse account2 = new AccountResponse("test",1);

        account2.hashCode();
        Assertions.assertTrue(account2.equals(account));

    }


}
