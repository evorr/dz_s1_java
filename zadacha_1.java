// 1. Вычислить n-ое треугольного число(сумма чисел от 1 до n), n!
// (произведение чисел от 1 до n)

import java.util.Scanner;


public class zadacha_1 {
    public static void main (String[] args) {
        Scanner numScanner = new Scanner(System.in);
        System.out.printf("Enter natural number: ");
        String num_str = numScanner.nextLine();
        int number = Integer.parseInt(num_str);

        int sum = 0;
        int mult = 1;

        for (int i = 1; i <= number; i++) {
            sum += i;
            mult *= i;
        }
        System.out.printf("Треугольное число %d = %d, %d! = %d", number, sum, number, mult);

    }
}
