// 2. Вывести все простые числа от 1 до 1000


public class zadacha_2 {

    public static boolean check_num(int num, int divisor){
        if (divisor > num*0.5 + 1 ) return true;
        if (num % divisor == 0) return false;
        else return check_num(num, divisor+1);
    }

    public static void main (String[] args) {
        String result = "2 ";

        for (int i = 3; i < 1000 ; i++) {
            if (check_num(i, 2)){
                result = result + String.valueOf(i) + " ";
            }

        }
        System.out.printf(result);
    }
}
