import java.util.Scanner;

class InvalidNumberException extends RuntimeException {

    public InvalidNumberException(String message) {
        super(message);
    }
}

public class task1 {
    public static void main(String[] args) {
        try {
            positive();
        } catch (InvalidNumberException e) {
            System.out.println("InvalidNumberException: " + e.getMessage());

        }
    }

    public static void positive() {

        Scanner scan = new Scanner(System.in);
        System.out.println("Введите число: ");
        int num = Integer.parseInt(scan.nextLine());
        scan.close();

        if (num <= 0) {
            throw new InvalidNumberException("Некорректное число!");
        }
        System.out.println("Число корректно!");

    }
}
