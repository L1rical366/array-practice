package ua.step.practice;

import java.util.Scanner;

/**
 * Задание: Написать программу, которая проверяет, все ли значения
 * элементов массива одинаковые. Вывести: Yes – если все оди-
 * наковы и No – если имеется хоть одно различие.
 * Размер массива задается и инициализируется в начале программы.
 */
public class Task03 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Vvedite razmer massiva: ");
        int len = scanner.nextInt();

        // TODO: Пишите код здесь
        int[] arr = new int[len];
        for (int i = 0; i < arr.length; i++) {
            arr[i] = scanner.nextInt();
        }
        int k=0;
        for(int i=0;i<arr.length;i++)
        {
            if(arr[0]==arr[i])
            {
                k=0;
            }
            else
            {
                k=1;
                break;
            }
        }
        if(k==0)
        {
            System.out.println("Yes\t");
        }
        else
        {
            System.out.println("No\t");
        }

    }
}