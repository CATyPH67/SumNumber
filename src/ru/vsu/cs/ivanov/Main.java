package ru.vsu.cs.ivanov;

import java.util.Scanner;

public class Main {

    public static int sumNum (int num) {
        int sum = 0;
        for(int i = 1; i < 4; i++) {
            sum += num % 10;
            num /= 10;
        }
        return sum;
    }

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.print("Введите целое неотрицательное число: ");
        int num = scan.nextInt();
        System.out.printf("Сумма 3-х последних цифр: %d", sumNum(num));
    }
}
