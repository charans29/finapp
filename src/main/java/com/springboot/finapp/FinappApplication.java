// package com.springboot.finapp;

// import com.springboot.finapp.config.CassandraConfig; 
// import org.springframework.boot.SpringApplication;
// import org.springframework.boot.autoconfigure.SpringBootApplication;
// import org.springframework.context.annotation.Import;
// import org.springframework.context.annotation.ComponentScan;

// @SpringBootApplication
// @ComponentScan(basePackages = "com.springboot.finapp")
// @Import({CassandraConfig.class})
// public class FinappApplication {

//     public static void main(String[] args) {
//         SpringApplication.run(FinappApplication.class, args);
//     }
// }


package com.springboot.finapp;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.ComponentScan;

@SpringBootApplication
@ComponentScan(basePackages = "com.springboot.finapp")
public class FinappApplication {

    public static void main(String[] args) {
        SpringApplication.run(FinappApplication.class, args);
    }
}
