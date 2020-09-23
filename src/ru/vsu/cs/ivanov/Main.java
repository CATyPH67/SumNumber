package ru.vsu.cs.ivanov;

import java.util.Scanner;

public class Main
{

    private static int sumNumber (int number)
    {
        int sum = 0;
        for(int i = 1; i < 4; i++)
        {
            sum += number % 10;
            number /= 10;
        }
        return sum;
    }

    public static void main(String[] args)
    {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter number: ");
        int number = scanner.nextInt();
        System.out.printf("Sum of the last 3 digits: %d", sumNumber(number));
    }
}
