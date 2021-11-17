package by.overone.lesson25;

import java.util.Random;

public class HomeTask2 {
    public static void main(String[] args) {
        Random random = new Random();
        int[] array = new int[6];
        for (int i = 0; i <= array.length; i++) {
            try {
                array[i] = random.nextInt(20);
                System.out.println(i);
            } catch (ArrayIndexOutOfBoundsException exception) {
                exception.printStackTrace();
            } finally {
                System.out.println("finally block");
            }
        }
    }
}

