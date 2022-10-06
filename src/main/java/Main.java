import java.util.Scanner;

import static java.lang.Math.*;

class Lambda{
    interface MathOp{
        double operation(double a, double b);
    }

    public static double calculate(double a, double b, MathOp op){
        return op.operation(a, b);
    }

    public static void main (String[] args) {
        Lambda lm = new Lambda();

        Scanner sc = new Scanner(System.in);

        double a = sc.nextDouble();
        double b = sc.nextDouble();

        MathOp addition = (x, y) -> x + y;
        MathOp subtraction = (x, y) -> x - y;
        MathOp multiply = (x, y) -> x * y;
        MathOp divide = (x, y) -> x / y;
        MathOp pow = (x, y) -> pow(x, y);
        MathOp sqrt = (x, y) -> sqrt(x);

        try {
            System.out.println("Сложение: " + lm.calculate(a, b, addition));
            System.out.println("Вычитание: " + lm.calculate(a, b, subtraction));
            System.out.println("Умножение: " + lm.calculate(a, b, multiply));
            System.out.println("Деление: " + lm.calculate(a, b, divide));
            System.out.println("Возведение в степень: " + lm.calculate(a, b, pow));
            System.out.println("Iзвлечение корня: " + lm.calculate(a, b, sqrt));
        } catch (Exception ex) {
            System.out.println(ex);
        }
    }
}