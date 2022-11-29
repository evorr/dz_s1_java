// 3. Реализовать простой калькулятор (операции + - / * )

import java.util.Scanner;

public class zadacha_3 {
    public static void main (String[] args) {
        Scanner numScanner = new Scanner(System.in);
        System.out.printf("Введите выражение (ЧислоОпереаторЧисло): ");
        String str_val = numScanner.nextLine();
        String[] sub_str;
        if(str_val.contains("+")){
            sub_str = str_val.split("\\+");
            int res = Integer.parseInt(sub_str[0]) + Integer.parseInt(sub_str[1]);
            System.out.printf("%s + %s = %d", sub_str[0], sub_str[1], res);
        }
        else if(str_val.contains("-")){
            sub_str = str_val.split("-");
            int res = Integer.parseInt(sub_str[0]) - Integer.parseInt(sub_str[1]);
            System.out.printf("%s - %s = %d", sub_str[0], sub_str[1], res);
        }
        else if(str_val.contains("*")){
            sub_str = str_val.split("\\*");
            int res = Integer.parseInt(sub_str[0]) * Integer.parseInt(sub_str[1]);
            System.out.printf("%s * %s = %d", sub_str[0], sub_str[1], res);
        }
        else if(str_val.contains("/")){
            sub_str = str_val.split("/");
            int res = Integer.parseInt(sub_str[0]) / Integer.parseInt(sub_str[1]);
            System.out.printf("%s / %s = %d", sub_str[0], sub_str[1], res);
        }
    }
}
