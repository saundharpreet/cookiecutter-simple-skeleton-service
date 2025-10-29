package com.harpreetsaund.{{ cookiecutter.project_name | replace('-', '') }};

import org.junit.jupiter.api.Test;
import org.springframework.boot.test.context.SpringBootTest;

@SpringBootTest
class {{ cookiecutter.project_name_camel }}ApplicationTests {

    @Test
    void contextLoads() {
    }

}
