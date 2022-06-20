import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        System.out.println("-----Изначальный вариант-----");
        Calculator calculator = new Calculator();
        calculator.SumOrMultiply();
        System.out.println("-----Вариант с разделениями методов-----");
        Calculatorv2 calculatorv2 = new Calculatorv2();
        calculatorv2.Sum();
        calculatorv2.Multiply();
    }
}
