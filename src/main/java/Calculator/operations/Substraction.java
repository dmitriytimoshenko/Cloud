package Calculator.operations;

import org.springframework.stereotype.Component;

@Component("substraction")
public class Substraction implements Operation {


    @Override
    public double calculate(double a, double b) {
        return a - b;
    }
}
