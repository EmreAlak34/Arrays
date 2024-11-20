package de.neuefische;



public class Main {
    public static void main(String[] args) {

        int[] array1 = new int[10];
        for (int i = 0; i < 10; i++) {
            array1[i] = i + 1;
        }

        // Print the array
        System.out.println("Array 1: ");
        for (int num : array1) {
            System.out.print(num + " ");
        }
        System.out.println();

        // Aufgabe 2:
        int sum = 0;
        for (int num : array1) {
            sum += num;
        }
        System.out.println("Sum of numbers in Array 1: " + sum);

        //Aufgabe 3
        int largest = array1[0];
        for (int num : array1) {
            if (num > largest) {
                largest = num;
            }
        }
        System.out.println("Largest number in Array 1: " + largest);

        // Aufgabe 4
        int[] array2 = new int[10];
        for (int i = 0; i < 10; i++) {
            array2[i] = i + 11;
        }
        // Ausgabe 2. Array
        System.out.println("Array 2: ");
        for (int num : array2) {
            System.out.print(num + " ");
        }
        System.out.println();

        //Augabe 5
        int[] resultArray = new int[10];
        for (int i = 0; i < 10; i++) {
            resultArray[i] = array1[i] + array2[i];
        }
        // Ausgabe result array
        System.out.println("Result Array (Element-wise addition): ");
        for (int num : resultArray) {
            System.out.print(num + " ");
        }
        System.out.println();
        }


    }

