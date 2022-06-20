import java.util.Scanner;

public class Calculatorv2 {
    public void Sum() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Поочередно введите два целочисленных числа, чтобы сложить их");
        int a = scanner.nextInt();
        int b = scanner.nextInt();
        System.out.println("Результат сложения этих чисел: " + (a + b));
    }

    public void Multiply() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Поочередно введите два целочисленных числа, чтобы умножить их");
        int a = scanner.nextInt();
        int b = scanner.nextInt();
        System.out.println("Результат сложения этих чисел: " + (a * b));
    }
}
