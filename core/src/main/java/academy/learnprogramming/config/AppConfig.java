package academy.learnprogramming.config;

import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Import;

@Configuration
@Import(GameConfig.class)
@ComponentScan(basePackages = "academy.learnprogramming")
public class AppConfig {
//    @Bean
//    public NumberGenerator numberGenerator(){
//        return new NumberGeneratorImpl();
//    }

//    @Bean
//    public Game game(){
//        return new GameImpl();
//    }
//    @Bean
//    public MessageGenerator messageGenerator(){
//        return new MessageGeneratorImpl();
//    }
}
