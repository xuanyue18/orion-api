package com.xuanyue.orionapisdk;

import com.xuanyue.orionapisdk.client.OrionApiClient;
import lombok.Data;
import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;

/**
 * Orion API 客户端配置类
 * @author xuanyue_18
 */
@Data
@Configuration
@ConfigurationProperties("orion.client")
@ComponentScan
public class OrionApiClientConfig {

    private String accessKey;

    private String secretKey;

    /**
     * 此处方法取名无所谓的，不影响任何地方
     *
     * @return
     */
    @Bean
    public OrionApiClient getApiClient() {
        return new OrionApiClient(accessKey, secretKey);
    }
}
