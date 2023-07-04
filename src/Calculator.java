public class Calculator {

    public static void main(String[] args) {
//        Математические знаки:+, -, *, /, ^, %
        char sign = '*';
        int num1 = 4;
        int num2 = 3;
        int result = 1;
        if (sign == '+') {
            result = num1 + num2;
        } else if (sign == '-') {
            result = num1 - num2;
        } else if (sign == '*') {
            result = num1 * num2;
        } else if (sign == '/') {
            if (num2 == 0) {
                System.out.println("Не нужно делить на ноль!");
                return;
            } else result = num1 / num2;
        } else if (sign == '^')
            for (int i = 1; i <= num2; i++) {
                result *= num1;
            }
        else if (sign == '%') {
            if (num2 == 0) {
                System.out.println("Не нужно делить на ноль!");
                return;
            } else result = num1 % num2;
        } else {
            System.out.println("Используйте для математического знака только +, -, *, /, ^, %");
            return;
        }
        System.out.println(num1 + " " + sign + " " + num2 + " = " + result);
    }
}