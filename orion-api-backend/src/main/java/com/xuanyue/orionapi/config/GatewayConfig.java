package com.xuanyue.orionapi.config;

import lombok.Data;
import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.context.annotation.Configuration;

@Configuration
@ConfigurationProperties(prefix = "orion.gateway")
@Data
public class GatewayConfig {

    private String host;

}
