package playwithspring.config;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.EnableAspectJAutoProxy;
import playwithspring.service.LoggingAspect;
import playwithspring.service.SecurityAspect;

@Configuration
@ComponentScan(basePackages = {"playwithspring.proxy", "playwithspring.repository", "playwithspring.service"})
@EnableAspectJAutoProxy
public class ProjectConfig {

    @Bean
    public LoggingAspect loggingAspect(){
        return new LoggingAspect();
    }

    @Bean
    public SecurityAspect securityAspect(){
        return new SecurityAspect();
    }

}
