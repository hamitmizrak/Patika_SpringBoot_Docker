package com.hamitmizrak;

import lombok.extern.log4j.Log4j2;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.data.jpa.repository.config.EnableJpaAuditing;
import org.springframework.jdbc.core.JdbcTemplate;


@SpringBootApplication
@EnableJpaAuditing(auditorAwareRef = "auditorAware")
@Log4j2
public class PatikaSpringBootDockerApplication  {

    public static void main(String[] args) {
        SpringApplication.run(PatikaSpringBootDockerApplication.class, args);
    }

}
