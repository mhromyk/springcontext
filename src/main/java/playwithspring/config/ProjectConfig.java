package playwithspring.config;

import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;

@Configuration
@ComponentScan(basePackages = {"playwithspring.proxy", "playwithspring.repository", "playwithspring.service"})
public class ProjectConfig {

}
