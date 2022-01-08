package com.abc;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.data.mongodb.repository.config.EnableReactiveMongoRepositories;

// 开启MongoDB的Spring data jpa
@EnableReactiveMongoRepositories
@SpringBootApplication
public class ApplicationCom {

    public static void main(String[] args) {
        SpringApplication.run(ApplicationCom.class, args);
    }

}

