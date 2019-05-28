package Calculator;

import Calculator.config.CalculatorConfig;
import Calculator.operations.*;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;


import java.util.Scanner;

public class Calculator {
    public static void main(String[] args) {
        // Определение переменных
        double a;
        double b;
        char op;

        // Определение контекста
        ApplicationContext context = new ClassPathXmlApplicationContext("calconf.xml");
        Scanner scanner = new Scanner(System.in);
        Operation addition = (Operation) context.getBean("addition", Operation.class);
        Operation division = (Operation)context.getBean("division", Operation.class);
        Operation multiplication = (Operation)context.getBean("multiplication", Operation.class);
        Operation substraction = (Operation)context.getBean("substraction", Operation.class);

        // Логика
        System.out.println("Введите 1-е число:");
        a = scanner.nextDouble();
        System.out.println(a);
        do {
                System.out.println("Введите операцию (+, -, *, /) или q для завершения: ");
                op = scanner.next().charAt(0);

                System.out.println(op);
                switch (op) {
                    case '+':
                        System.out.println("Введите 2-е число:");
                        b = scanner.nextDouble();
                        System.out.println(b);
                        a = addition.calculate(a, b);
                        break;
                    case '-':
                        System.out.println("Введите 2-е число:");
                        b = scanner.nextDouble();
                        System.out.println(b);
                        a = substraction.calculate(a, b);
                        break;
                    case '*':
                        System.out.println("Введите 2-е число:");
                        b = scanner.nextDouble();
                        System.out.println(b);
                        a = multiplication.calculate(a, b);
                        break;
                    case '/':
                        System.out.println("Введите 2-е число:");
                        b = scanner.nextDouble();
                        System.out.println(b);
                        a = division.calculate(a, b);
                        break;
                    default:
                        a = 0.0;
                        break;
                }
                System.out.println(a);

        }   while (op != 'q') ;

    }
}
