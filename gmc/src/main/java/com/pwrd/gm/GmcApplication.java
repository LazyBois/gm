package com.pwrd.gm;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class GmcApplication {

    // 这个类用来标记代码在哪个包下，所以此类的包名应该高于所有代码（包括其他模块）的包，不然扫不到
    public static void main(String[] args) {
        SpringApplication.run(GmcApplication.class, args);
    }

}
