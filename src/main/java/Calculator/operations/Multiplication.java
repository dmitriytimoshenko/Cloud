package Calculator.operations;

import org.springframework.stereotype.Component;

@Component("multiplication")
public class Multiplication implements Operation {

    @Override
    public double calculate(double a, double b) {
        return a * b;
    }
}
