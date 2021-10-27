package com.catninja;

import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;

@SpringBootApplication
public class CatninjaApplication {

    public static void main(String[] args) {
        SpringApplication.run(CatninjaApplication.class, args);
    }

    @Bean
    public CommandLineRunner runSomething() {
        return args -> {
            final var noToString = new ClassWithoutToString("no", "toString");
            System.out.println("Object reference in memory is: " + noToString);
            final var classWithToString = new ClassWithToString("no", "toString");
            System.out.println(classWithToString);

        };
    }

}
