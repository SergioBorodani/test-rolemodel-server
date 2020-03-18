package ru.curs.sergio.testrolemodel;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.ComponentScan;

@SpringBootApplication
@ComponentScan({"ru.curs.rolemodel.controller", "ru.curs.rolemodel.service", "ru.curs.lyra.controller", "ru.curs.lyra.service"})
public class TestRolemodelApplication {

    public static void main(String[] args) {
        SpringApplication.run(TestRolemodelApplication.class, args);
    }

}
