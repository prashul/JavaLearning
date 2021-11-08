package com.example.demo1;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class Demo1Application implements CommandLineRunner {

    @Autowired
    private Approach1 approach1;

    @Autowired
    private Approach2 approach2;

    public static void main(String[] args) {
        SpringApplication.run(Demo1Application.class, args);

    }
    @Override
    public void run(String...args) throws Exception {
        System.out.println(approach1.getConnection());
        System.out.println( approach2.getHost() );

    }
}
