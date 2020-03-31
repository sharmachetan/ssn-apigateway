package com.srn.service.init;

import com.srn.login.bp.LoginBP;

public class ServiceRegistryInit {

    private static ServiceRegistryInit loginInit = null;

    ServiceRegistryInit(){
        init();
    }

    private void init(){

        LoginBP loginBp = new LoginBP();
      //  loginBp.run();
    }

    public ServiceRegistryInit getInstance (){
        if(loginInit == null){
            ServiceRegistryInit loginInit = new ServiceRegistryInit();
        }
        return loginInit;

    }
}
