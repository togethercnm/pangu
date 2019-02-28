package com.cnm.pangu;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.web.servlet.ServletComponentScan;

@SpringBootApplication(scanBasePackages = "com.cnm")
@ServletComponentScan
public class PanguApplication {

    public static void main(String[] args) {
        SpringApplication.run(PanguApplication.class, args);
    }

}
