package com.ecofoo.test;

import lombok.extern.slf4j.Slf4j;
import lombok.val;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.builder.SpringApplicationBuilder;
import org.springframework.context.ConfigurableApplicationContext;

@SpringBootApplication
@Slf4j
public class Application {
    private static ConfigurableApplicationContext context;

    public static void main(String[] args) {
        SpringApplicationBuilder builder = new SpringApplicationBuilder(Application.class);

        context = builder.run(args);

        val applicationName = context.getEnvironment().getProperty("spring.application.name");

        log.info("------ [Application '{}' running...] ------", applicationName);
    }
}
