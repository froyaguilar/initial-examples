package com.exercises.spring.config.databases;

import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Import;

import com.exercises.spring.config.databases.datasources.DataSourceH2Config;
import com.exercises.spring.config.databases.jpa.JPAH2Config;

@Configuration
@Import({DataSourceH2Config.class, JPAH2Config.class})
public class H2Config {
}
