package config;

import org.example.Destop;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;

@Configuration
@ComponentScan(basePackages = {"org.example","config"})
public class AppConfig {
    //@Bean(name = {"com1","Beast"})
    //public Destop destop(){
    //    return new Destop();
    //}
}
