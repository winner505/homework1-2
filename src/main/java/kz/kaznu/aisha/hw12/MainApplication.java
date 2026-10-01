package kz.kaznu.aisha.hw12;

public class MainApplication {
    public static void main(String[] args) {
        System.out.println("hello");
        checkSign(5, 10, -3);
        checkSign(-10, -5, 2);
    }

    public static void checkSign(int a, int b, int c) {
        int sum = a + b + c;
        if (sum >= 0) {
            System.out.println("Сумма положительная");
        } else {
            System.out.println("Сумма отрицательная");
        }
    }
}










