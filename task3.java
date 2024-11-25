import java.util.Scanner;

public class task3 {
    public static void main(String[] args) {
        Scanner myScan = new Scanner(System.in);
        System.out.println("Добро пожаловать в калькулятор.");
        System.out.print("Введите первое число (от 1 до 10) : ");
        float num_a = myScan.nextFloat();
        if ((num_a >= 1) && (num_a <= 10)) {
            System.out.print("Введите второе число (от 1 до 10) : ");
            float num_b = myScan.nextFloat();
            if ((num_b >= 1) && (num_b <= 10)) {
                System.out.print("Выберите операцию из предложенных: + - / * : ");
                char operation = myScan.next().charAt(0);
                float res;
                switch (operation) {
                    case '+':
                        res = num_a + num_b;
                        System.out.printf("%.2f + %.2f = %.2f\n", num_a, num_b, res);
                        break;
                    case '-':
                        res = num_a - num_b;
                        System.out.printf("%.2f - %.2f = %.2f\n", num_a, num_b, res);
                        break;
                    case '/':
                        res = num_a / num_b;
                        System.out.printf("%.2f / %.2f = %.2f\n", num_a, num_b, res);
                        break;
                    case '*':
                        res = num_a * num_b;
                        System.out.printf("%.2f * %.2f = %.2f\n", num_a, num_b, res);
                        break;
                }
                myScan.close();
            }
        } else { System.out.print("Вы ввели неверое число!");
        }
    }
}