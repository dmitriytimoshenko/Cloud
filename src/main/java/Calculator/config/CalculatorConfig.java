package Calculator.config;


import Calculator.aspects.Speaker;
import Calculator.operations.*;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class CalculatorConfig {

    @Bean
    public Operation addition() {
        return new Addition();
    }

    @Bean
    public Operation division() {
        return new Division();
    }

    @Bean
    public Operation multiplication() {
        return new Multiplication();
    }

    @Bean
    public Operation substraction() {
        return new Substraction();
    }

    @Bean
    public Speaker speaker() {
        return new Speaker();
    }

}
