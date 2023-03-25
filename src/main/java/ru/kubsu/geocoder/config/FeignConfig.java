package ru.kubsu.geocoder.config;

import org.springframework.cloud.openfeign.EnableFeignClients;
import org.springframework.context.annotation.Configuration;

/**
 *
 */
@Configuration
@EnableFeignClients(basePackages = "ru.kubsu.geocoder")
public class FeignConfig {
}
