package com.foxwho.demo.config;

import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.ImportResource;

@Configuration
@ImportResource(locations = {"classpath:uid/uid-spring.xml"})
public class UidConfig {
}
