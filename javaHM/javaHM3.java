// Пусть дан произвольный список целых чисел, удалить из него четные числа

package ru.geekbrains;

import java.util.ArrayList;
import java.util.Random;

public class Task001 {
    public static void main(String[] args) {
        Random rnd = new Random();
        ArrayList<Integer> list1 = new ArrayList<Integer>();
        for (int i = 0; i < 10; i++) {
            int val = rnd.nextInt(-100, 100);
            list1.add(val);
        }
        System.out.printf("Первоначальный список %s\n", list1);
        int i = 0;
        while (i < list1.size()) {
            if (list1.get(i) % 2 == 0) {
                list1.remove(i);
            }
            else {
                i++;
            }
        }
        System.out.printf("Список с удаленными четными числами %s", list1);
    }
}

// MAX -- Solution 1
primes.stream() //
    .max(Comparator.comparing(i -> i)) //
    .ifPresent(max -> System.out.println("Maximum found is " + max));

// MAX -- Solution 2
primes.stream() //
    .max((i1, i2) -> Integer.compare(i1, i2)) //
    .ifPresent(max -> System.out.println("Maximum found is " + max));

// MAX -- Solution 3
int max = Integer.MIN_VALUE;
for (int i : primes) {
    max = (i > max) ? i : max;
}
if (max == Integer.MIN_VALUE) {
    System.out.println("No result found");
} else {
    System.out.println("Maximum found is " + max);
}

// MAX -- Solution 4 
max = Collections.max(primes);
System.out.println("Maximum found is " + max);
// MAX -- Solution 1
primes.stream() //
    .max(Comparator.comparing(i -> i)) //
    .ifPresent(max -> System.out.println("Maximum found is " + max));


// MIN -- Solution 1
primes.stream() //
    .min(Comparator.comparing(i -> i)) //
    .ifPresent(min -> System.out.println("Minimum found is " + min));

// MIN -- Solution 2
primes.stream() //
    .max(Comparator.comparing(i -> -i)) //
    .ifPresent(min -> System.out.println("Minimum found is " + min));

// MIN -- Solution 3
int min = Integer.MAX_VALUE;
for (int i : primes) {
    min = (i < min) ? i : min;
}
if (min == Integer.MAX_VALUE) {
    System.out.println("No result found");
} else {
    System.out.println("Minimum found is " + min);
}

// MIN -- Solution 4
min = Collections.min(primes);
System.out.println("Minimum found is " + min);


// AVERAGE -- Solution 1
primes.stream() //
    .mapToInt(i -> i) //
    .average() //
    .ifPresent(avg -> System.out.println("Average found is " + avg));

// AVERAGE -- Solution 2
int sum = 0;
for (int i : primes) {
    sum+=i;
}
if(primes.isEmpty()){
    System.out.println("List is empty");
} else {
    System.out.println("Average found is " + sum/(float)primes.size());         
}
