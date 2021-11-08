package com.example.demo1;

import lombok.Data;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.Configuration;

@Configuration
@Data
public class Approach2 {
    @Value("${app.name}")
    private String host;
}
