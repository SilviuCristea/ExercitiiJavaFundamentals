package config;


import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;

@Configuration
@ComponentScan(basePackages = {"bisiness.service", "persistence.dao", "entryPoint"})
public class SpringConfiguration {
}
