package com.example.demo.Controller;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

@Component
public class AppConfig {
    @Value("${app.name}")
    public String appName;

    @Value("${app.version}")
    public String appVersion;

}
