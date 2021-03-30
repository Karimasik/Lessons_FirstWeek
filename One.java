package com.company;
//Задача 1
import java.util.Scanner;
public class One {
   public static void main(String[] args) {
       Scanner in = new Scanner(System.in);
       long k = in.nextLong();
       if(k < 9) {
           System.out.println(k+1);
       }
       else {
           k -= 9; //т.к. в диапазоне от 1 до 10, 11 до 20 и т.д. -> 9 чисел
           long num_k = 9 + (k + 1) / 2; //приведение к числу, которое стоит в ряду, при помощи этой же 9
           if (k % 2 == 0) { //создается условие, позволяющее вытаскивать нужную цифру
               System.out.println(num_k / 10);
           } else {
               System.out.println(num_k % 10);
           }
       }
   }
}
