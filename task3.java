import java.util.Scanner;

class NumberOutOfRangeException extends RuntimeException {

    public NumberOutOfRangeException(String message) {
        super(message);
    }
}

class NumberSumException extends RuntimeException {

    public NumberSumException(String message) {
        super(message);
    }
}

class DivisionByZeroException extends RuntimeException {

    public DivisionByZeroException(String message) {
        super(message);
    }
}

public class task3 {
    public static void main(String[] args) {
        try {
            func();
        } catch (NumberSumException | NumberOutOfRangeException | DivisionByZeroException e) {
            System.out.println(e.getMessage());
        }
    }

    private static void func() {
        Scanner scan = new Scanner(System.in);
        System.out.println("Введите число: ");
        int firstNum = Integer.parseInt(scan.nextLine());
        System.out.println("Введите второе число: ");
        int secondNum = Integer.parseInt(scan.nextLine());
        System.out.println("Введите третье число: ");
        int thirdNum = Integer.parseInt(scan.nextLine());
        scan.close();

        if (firstNum > 100) {
            throw new NumberOutOfRangeException("NumberOutOfRangeException: Первое число вне допустимого диапазона!");
        }
        if (secondNum < 0) {
            throw new NumberOutOfRangeException("NumberOutOfRangeException: Второе число вне допустимого диапазона!");
        }
        if ((firstNum + secondNum) < 10) {
            throw new NumberOutOfRangeException("NumberSumException: Сумма первого и второго чисел слишком мала!");
        }
        if (thirdNum == 0) {
            throw new DivisionByZeroException("DivisionByZeroException: Деление на ноль недопустимо!");
        }
        System.out.println("Проверка пройдена!");
    }
}
