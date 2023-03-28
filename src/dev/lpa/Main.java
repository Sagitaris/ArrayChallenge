package dev.lpa;

import java.util.Arrays;
import java.util.Random;

public class Main {

    public static void main(String[] args) {

        int[] unsortedArray = getRandomArray(5);
        System.out.println(Arrays.toString(unsortedArray));
        int[] sortedArray = sortIntegers(unsortedArray);
        System.out.println(Arrays.toString(sortedArray));
        int[] reversedArray = reverseArray(sortedArray);
        System.out.println(Arrays.toString(reversedArray));

    }

    private static int[] getRandomArray(int length) {
        Random random = new Random();
        int[] randomArray = new int[length];
        for (int i = 0; i < length; i++) {
            randomArray[i] = random.nextInt(1000);
        }

        return randomArray;
    }

    private static int[] sortIntegers(int[] array) {

        int[] sortedArray = Arrays.copyOf(array, array.length);
        Arrays.sort(sortedArray);

        return sortedArray;
    }

    private static int[] reverseArray(int[] array) {

        int[] reversedArray = new int[array.length];

        for (int i = 0; i < reversedArray.length; i++) {
            reversedArray[i] = array[reversedArray.length - i - 1];
        }

        return reversedArray;
    }
}
