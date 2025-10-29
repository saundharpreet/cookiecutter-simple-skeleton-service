package com.harpreetsaund.{{ cookiecutter.project_name | replace('-', '') }}.service;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Service;

import java.time.Instant;
import java.util.UUID;

@Service
public class {{ cookiecutter.project_name_camel }} {

    private static final Logger logger = LoggerFactory.getLogger({{ cookiecutter.project_name_camel }}.class);

}
