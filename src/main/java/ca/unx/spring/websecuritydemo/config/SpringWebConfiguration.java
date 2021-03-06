package ca.unx.spring.websecuritydemo.config;

import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.web.servlet.config.annotation.EnableWebMvc;
import org.springframework.web.servlet.config.annotation.WebMvcConfigurerAdapter;

@Configuration
@EnableWebMvc
@ComponentScan(basePackages = {"ca.unx.spring.websecuritydemo"},
        excludeFilters = {@ComponentScan.Filter(Configuration.class)})
public class SpringWebConfiguration extends WebMvcConfigurerAdapter {
}
