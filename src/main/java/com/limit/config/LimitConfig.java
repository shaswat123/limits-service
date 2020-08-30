package com.limit.config;

import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.cloud.context.config.annotation.RefreshScope;
import org.springframework.context.annotation.Configuration;

@Configuration
@ConfigurationProperties(prefix = "limits-service")
@RefreshScope
public class LimitConfig {

    private Integer minimum;
    private Integer maximum;

    public Integer getMinimum() {
        return minimum;
    }

    public Integer getMaximum() {
        return maximum;
    }

    public void setMinimum(Integer minimum) {
        this.minimum = minimum;
    }

    public void setMaximum(Integer maximum) {
        this.maximum = maximum;
    }
}
