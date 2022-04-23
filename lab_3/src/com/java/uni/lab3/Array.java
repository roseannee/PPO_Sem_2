package com.java.uni.lab3;

import java.util.Arrays;
import java.util.Scanner;

public class Array {
    Scanner scanner = new Scanner(System.in);

    int[] array = new int[0];
    int arraySize;
    int startNumber;
    int position;
    int newNumber;
    int sum = 0;
    int average = 0;
    int min = 0;
    int max = 0;
    int intervalA;
    int intervalB;
    int intervalNumber;
    int newLength;


    public void setArraySize() {
        arraySize = scanner.nextInt();

        array = new int[arraySize];
    }

    public void outputArray() {
        System.out.println("\n\nOutput : ");

        for (int i : array) {
            System.out.print(i + " ");
        }

        System.out.println();
    }

    public void fillArray() {
        startNumber = scanner.nextInt();

        for (int i = 0; i < array.length; i++) {
            array[i] = startNumber++;
        }
    }

    public void newNumberPosition() {
        array[position - 1] = newNumber;
    }

    public void calcSumAverage() {

        sum = 0;

        for (int i : array) {
            sum += i;
        }

        average = sum / array.length;
    }

    public void findMinMax() {
        min = Integer.MAX_VALUE;
        for (int i : array) {
            if (i >= 0)
                min = Math.min(i, min);
        }

        for (int i : array) {
            if (max < i)
                max = i;
        }
    }

    public void fillNumberInterval() {
        intervalA--;
        intervalB--;

        for (int i = intervalA; i <= intervalB; i++) {
            array[i] = intervalNumber;
        }
    }

    public void increaseArray() {
        newLength = scanner.nextInt();

        int[] increaseArray = Arrays.copyOfRange(array, 0, array.length + newLength);

        outputIncreaseDecrease(increaseArray);

        array = increaseArray;
    }

    public void decreaseArray() {
        newLength = scanner.nextInt();

        int[] decreaseArray = Arrays.copyOfRange(array, 0, array.length - newLength);

        outputIncreaseDecrease(decreaseArray);

        array = decreaseArray;
    }

    public void outputIncreaseDecrease(int[] x) {
        System.out.println("\nNew output : ");

        for (int i : x) {
            System.out.print(i + " ");
        }

        System.out.println();
    }
}