package com.company;
//Задача2

import java.io.BufferedReader;
import java.io.InputStreamReader;

public class Two {
    public static void main(String[] args) throws Exception{
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        System.out.println("Введите ширину рамки");
        int width = Integer.parseInt(reader.readLine());
        System.out.println("Введите длину рамки");
        int length = Integer.parseInt(reader.readLine());
        System.out.println("Введите строку, помещаемую в рамку");
        String s = reader.readLine();
        if(s.length() > length-2) {
            System.out.println("Ошибка");
        } else {
            System.out.println("Результат выполнения:");
            for(int i = 0; i < width; i++) {
                if(i == 0 || i == width-1) {
                    System.out.println(String.format("%" + length + "s", "*").replace(" ", "*")); //replace() заменяет пробелы на звезды в данном случае
                } else if (i == width/2) {
                    System.out.println(String.format("%" + -((length - s.length())/2) + "s" + "%s" + "%" +(((length - s.length())/2)+1) + "s", "*", s, "*"));
                } else {
                    System.out.println(String.format("%s" + "%" + (length-1) + "s", "*", "*"));
                }
            }
        }
        reader.close(); //закрываем поток
    }
}
