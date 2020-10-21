package ua.step.practice;

import java.time.LocalDateTime;
import java.time.ZoneOffset;
import java.util.Random;

/**
 * Задание: Заполнить массив на 10 элементов случайными числами
 * от -5 до +5. Посчитать количество повторяющихся значений.
 * Вывести на консоль только повторяющиеся элементы (больше одного повторения)
 * и количество повторений.
 * <p>
 * Пример:
 * 0 – 5 раз
 * 2 – 3 раза
 * 7 – 2 раза
 */
public class Task05 {
    public static void main(String[] args) {
        // TODO: не менять стоки ниже - нобходимо для тестирования @see ua.step.homework01.TaskTest05
        long seed = args.length > 0 ? Long.parseLong(args[0]) : LocalDateTime.now().toEpochSecond(ZoneOffset.UTC);

        // Использовать для генерирования элементов массива
        Random rnd = new Random(seed);

        // TODO: Пишите код здесь
        int[] arr1 = new int[10];
        int[] arr2=new int[10];
        for (int i = 0; i < arr1.length; i++) {
            arr1[i] = rnd.nextInt(6 + 5) - 5;
        }
        con:
        for (int i=0;i<arr1.length;i++) {
            int kol=0;
            for(int p=0;p<arr2.length;p++){
                if(arr1[i]==arr2[p]) {
                    continue con;
                }
            }
            for(int j=0;j<arr1.length;j++) {
                if(arr1[i]==arr1[j]) {
                    kol++;
                }
            }
            if(kol>1) {
                arr2[i]=arr1[i];
                System.out.println(arr1[i]+" "+kol+"\n");
            }
        }

    }
}