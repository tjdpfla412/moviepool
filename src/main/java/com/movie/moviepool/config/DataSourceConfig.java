package com.movie.moviepool.config;

import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.boot.jdbc.DataSourceBuilder;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import javax.sql.DataSource;

@Configuration
public class DataSourceConfig {
    @ConfigurationProperties(prefix = "spring.datasource")
    @Bean
    public DataSource dataSource() {
        return DataSourceBuilder.create().build();
    }
}


    /*@Bean
    public DataSource dataSource() {
        return DataSourceBuilder
                .create()
                .username("MySql 유저 이름")
                .password("MySql 비밀번호")
                .url("MySql 경로")
                .driverClassName("com.mysql.cj.jdbc.Driver")
                .build();
    }*/