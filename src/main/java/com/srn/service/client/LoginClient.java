package com.srn.login.client;

import com.srn.common.Actions.LoginAction;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@ComponentScan
public class LoginClient implements LoginAction {


    @Override
    public String getStores() {
        System.out.print("nside asdfasdfdsafdsaadsfsa*************");
        return "Success";
    }
}
