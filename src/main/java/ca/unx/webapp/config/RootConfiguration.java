package ca.unx.webapp.config;

import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Import;

@Configuration
@Import({SpringSecurityConfig.class})
public class RootConfiguration {
}
