package info.cafeit.springbeandefinationoverriding.configuration;

import info.cafeit.springbeandefinationoverriding.bean.Actor;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration

public class ScenesConfig {

    @Bean
    public Actor actresses() {
        return new Actor("Maria Ozawa");
    }

}
