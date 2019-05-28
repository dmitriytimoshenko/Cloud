package Calculator.operations;

import org.springframework.stereotype.Component;

@Component("division")
public class Division implements Operation{



    @Override
    public double calculate(double a, double b) {
        return a / b;
    }
}
