package com.zedlab.interest.jjwt;

import static com.google.common.net.HttpHeaders.AUTHORIZATION;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.context.annotation.Configuration;

@ConfigurationProperties(prefix = "application.jwt")
@Configuration
@NoArgsConstructor
@Getter
@Setter
public class JwtConfig {

    private String secretKey;
    private String tokenPrefix;
    private Integer tokenExpirationAfterDays;

    public String getAuthorizationHeader() {
        return AUTHORIZATION;
    }

}
