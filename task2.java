import java.util.Scanner;

class DivisionByZeroException extends RuntimeException {

    public DivisionByZeroException(String message) {
        super(message);
    }
}

public class task2 {
    public static void main(String[] args) {
        try {
            division();
        } catch (DivisionByZeroException e) {
            System.out.println("DivisionByZeroException: " + e.getMessage());
        }
    }

    private static void division() {
        Scanner scan = new Scanner(System.in);
        System.out.println("Введите первое число: ");
        int firstNum = Integer.parseInt(scan.nextLine());
        System.out.println("Введите второе число: ");
        int secondNum = Integer.parseInt(scan.nextLine());
        scan.close();

        if (secondNum == 0) {
            throw new DivisionByZeroException("Деление на ноль не допустимо!");
        }
        System.out.println((float) firstNum / secondNum);
    }
}
