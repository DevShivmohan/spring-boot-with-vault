package com.vault.example.model;

import lombok.Data;
import org.springframework.boot.context.properties.ConfigurationProperties;

@Data
@ConfigurationProperties("example")
public class Credential {
    /**
     * username will comes from vault server
     */
    private String username;
    /**
     * password will comes from vault server
     */
    private String password;
}
