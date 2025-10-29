package com.harpreetsaund.{{ cookiecutter.project_name | replace('-', '') }};

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class {{ cookiecutter.project_name_camel }}Application {

    public static void main(String[] args) {
        SpringApplication.run({{ cookiecutter.project_name_camel }}Application.class, args);
    }

}
