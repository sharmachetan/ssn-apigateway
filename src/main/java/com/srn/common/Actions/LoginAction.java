package com.srn.common.Actions;


import com.srn.common.config.LoginConfiguration;
import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;


@FeignClient(value = "login",path = "/login")
public interface LoginAction {


    @RequestMapping(method = RequestMethod.GET, value = "/basic")
    public String getStores();



}
