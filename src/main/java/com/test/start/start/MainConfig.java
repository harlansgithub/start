package com.test.start.start;

import com.pop.order.annotation.TulingEnableAutoConfig;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;

@Configuration
@ComponentScan(basePackages = "com.test.start.*")
@TulingEnableAutoConfig
public class MainConfig {
}
