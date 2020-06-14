package com.srn.service.init;


import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import org.springframework.cloud.netflix.eureka.server.EnableEurekaServer;
import org.springframework.cloud.openfeign.EnableFeignClients;
import org.springframework.context.annotation.ComponentScan;
import springfox.documentation.swagger2.annotations.EnableSwagger2;





@SpringBootApplication
@EnableSwagger2
@EnableFeignClients
@EnableEurekaServer
@ComponentScan(basePackages ="com.srn" )
public class ServiceRegistryStarter {



    public static void main(String[] args){
        SpringApplication.run(ServiceRegistryStarter.class, args);

    }


}
