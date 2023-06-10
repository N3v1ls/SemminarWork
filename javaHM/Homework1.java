
     // 1. Задать одномерный массив и найти в нем минимальный и максимальный элементы ;

    static int[] minMax(int[] array) {
        int min = 0;
        int max = 0;

        for (int item : array) {
            if (item < min) min = item;
            if (item > max) max = item;
        }
        return new int[]{min, max};
    }


 // Создать квадратный двумерный целочисленный массив (количество строк и столбцов одинаковое),
 //  и с помощью цикла(-ов) заполнить его диагональные элементы единицами 
 // (можно только одну из диагоналей, если обе сложно). 
 // Определить элементы одной из диагоналей можно по следующему принципу:
 //  индексы таких элементов равны, то есть [0][0], [1][1], [2][2], …, [n][n];


    public static void task4() {
        int[][] arr = new int[3][3];
        for (int i = 0; i < arr.length; i++) {
            for (int j = 0, x = arr[i].length - 1; j < arr[i].length; j++, x--) {
                if (i == j || i == x) arr[i][j] = 1;
                else arr[i][j] = 0;
                System.out.print(arr[i][j] + " ");
            }
            System.out.print("\n");
        }
    }


// В консоли запросить имя пользователя. В зависимости от текущего времени, вывести приветствие вида:
// - "Доброе утро, <Имя>!", если время от 05:00 до 11:59;
// - "Добрый день, <Имя>!", если время от 12:00 до 17:59;
// - "Добрый вечер, <Имя>!", если время от 18:00 до 22:59; 
// - "Доброй ночи, <Имя>!", если время от 23:00 до 4:59

package Lesson1.Task1;

import java.util.Scanner;
import java.time.LocalTime;

/**
 * program
 */
public class program {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in, "866");
        System.out.print("Введите Ваше имя: ");
        String Name = in.next();
        String s1;
        int Hour = LocalTime.now().getHour();
        if (Hour == 23 || Hour < 5)
            s1 = "Доброй ночи";
        else if (Hour < 12)
            s1 = "Доброе утро";
        else if (Hour < 18)
            s1 = "Добрый день";
        else
            s1 = "Добрый вечер";
        System.out.println(Name);
        System.out.println(s1 + ", " + Name + "!");
        in.close();
    }

}
