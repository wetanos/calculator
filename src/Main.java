import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Чтобы сложить числа - введите 1, чтобы умножить - 2");
        String method = scanner.nextLine();
        if (method == "1") {
            int a = scanner.nextInt();
            int b = scanner.nextInt();
            System.out.println("Результат сложения этих чисел: " + (a + b));
        } else if (method == "2") {
            int a = scanner.nextInt();
            int b = scanner.nextInt();
            System.out.println("Результат умножения этих чисел: " + (a * b));
        } else {
            System.out.println("Входные данные для определения метода некорретны, перезапустите программу, чтобы попробовать снова");
        }
    }
}
