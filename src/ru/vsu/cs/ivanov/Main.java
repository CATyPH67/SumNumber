package ru.vsu.cs.ivanov;

import java.util.Scanner;

public class Main
{

    public static void main(String[] args)
    {
        int number = inputNumber();
        conclusionSumNumber(number);
    }

    private static int inputNumber  ()
    {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter number: ");
        return scanner.nextInt();
    }

    private static void conclusionSumNumber(int number)
    {
        System.out.printf("Sum of the last 3 digits: %d", sumNumber(number));
    }

    private static int sumNumber (int number)
    {
        int sum = 0;
        for(int i = 0; i < 3; i++)
        {
            sum += number % 10;
            number /= 10;
        }
        return sum;
    }

}
