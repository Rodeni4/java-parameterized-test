package ru.yandex.praktikum;

import ru.yandex.praktikum.Calculator;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.print("Input a first number: ");
        int firstNumber = in.nextInt();
        System.out.print("Input a second number: ");
        int secondNumber = in.nextInt();

        Calculator calculator = new Calculator();
        System.out.println("Sum = " + calculator.sum(firstNumber, secondNumber));
    }
}
