package com.chen.cloudapiclientsdk;

import com.chen.cloudapiclientsdk.client.CloudApiClient;
import com.chen.cloudapiclientsdk.model.User;
import lombok.Data;
import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;

@Configuration
@ConfigurationProperties("cloud.client")
@Data
@ComponentScan
public class CloudApiClientConfig {

    private String accessKey;

    private String secretKey;

    @Bean
    public CloudApiClient cloudApiClient(){
        return new CloudApiClient(accessKey, secretKey);
    }
}
