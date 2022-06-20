import java.util.Scanner;

public class Calculator {
    public void SumOrMultiply() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Чтобы сложить числа - введите 1, чтобы умножить - 2");
        int method = scanner.nextInt();
        if (1 == method) {
            System.out.println("Поочередно введите два целочисленных числа");
            int a = scanner.nextInt();
            int b = scanner.nextInt();
            System.out.println("Результат сложения этих чисел: " + (a + b));
        } else if (method == 2) {
            System.out.println("Поочередно введите два целочисленных числа");
            int a = scanner.nextInt();
            int b = scanner.nextInt();
            System.out.println("Результат умножения этих чисел: " + (a * b));
        } else {
            System.out.println("Входные данные для определения метода некорретны, перезапустите программу, чтобы попробовать снова");
        }
    }
}
