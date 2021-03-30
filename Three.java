package com.company;
//Задача3
import java.util.Random;
import java.util.Scanner;

public class Three {
    public static void main(String[] args) {
        Random random = new Random();
        int numbers = random.nextInt(10 + 1);
        System.out.println("Число сгенерировано. Выберите число:");
        Scanner in = new Scanner(System.in);
        int num = in.nextInt();
        select(num, numbers);
        while(num != numbers) {
            System.out.println("Выберите число:");
            num = in.nextInt();
            select(num, numbers);
        }
    }
    public static void select(int num, int numbers) {
        if(num < numbers) {
            System.out.println("Неверно! Число слишком маленькое, попытайтесь снова.");
        } else if(num > numbers) {
            System.out.println("Неверно! Число слишком большое, попытайтесь снова.");
        } else {
            System.out.println("Верно! Вы угадали, поздравляем с победой.");
        }
    }
}
