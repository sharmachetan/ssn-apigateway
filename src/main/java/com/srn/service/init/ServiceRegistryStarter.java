package com.srn.service.init;


import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import org.springframework.cloud.netflix.eureka.server.EnableEurekaServer;
import org.springframework.cloud.openfeign.EnableFeignClients;
import springfox.documentation.swagger2.annotations.EnableSwagger2;





@SpringBootApplication
@EnableSwagger2
@EnableFeignClients
@EnableEurekaServer
public class ServiceRegistryStarter {



    public static void main(String[] args){
        SpringApplication.run(ServiceRegistryStarter.class, args);

    }


}
