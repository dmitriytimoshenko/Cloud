package Calculator.operations;

import org.springframework.stereotype.Component;

@Component("addition")
public class Addition implements Operation {



    @Override
    public double calculate(double a, double b) {
        return a + b;
    }
}
