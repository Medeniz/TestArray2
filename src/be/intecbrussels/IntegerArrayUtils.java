package be.intecbrussels;

import jdk.dynalink.beans.StaticClass;

public class IntegerArrayUtils {

    public static int[] generateArrayWithIncrement(int increment) {
        int[] list = new int[10];
        for (int i = 0; i < list.length; i++) {
            list[i] = i * increment;
        }
        return list;
    }

    public static boolean isSorted(int[] numbers) {
        int smallest = numbers[0];
        for (int i = 1; i < numbers.length; i++) {
            if (numbers[i] < numbers[i - 1]) {
                return false;
            }
        }
        return true;
    }

    public static void reverseArray(int[] numbers) {
        int temp = 0;
        int i = 0;

        for (int j = numbers.length - 1; j > i; j--) {
            temp = numbers[i];
            numbers[i] = numbers[j];
            numbers[j] = temp;
            i++;
        }
    }

    public static String[] getIntArrayData(int[] integerNumbers) {
        String[] data = new String[4];

        data[0] = "The minimum value is: " + findMin(integerNumbers);
        data[1] = "The maximum value is: " + findMax(integerNumbers);
        data[2] = "The average value is: " + 1.0 * findSum(integerNumbers) / integerNumbers.length;
        data[3] = "The sum is: " + findSum(integerNumbers);
        return data;
    }

    private static int findMin(int[] integerNumbers) {
        int min = integerNumbers[0];
        for (int i = 1; i < integerNumbers.length; i++) {
            if (integerNumbers[i] < min) {
                min = integerNumbers[i];
            }
        }
        return min;
    }

    private static int findMax(int[] integerNumbers) {
        int max = integerNumbers[0];
        for (int i = 1; i < integerNumbers.length; i++) {
            if (integerNumbers[i] > max) {
                max = integerNumbers[i];
            }
        }
        return max;
    }

    private static int findSum(int[] integerNumbers) {
        int sum = 0;
        for (int num : integerNumbers) {
            sum += num;
        }
        return sum;
    }

    public static int[] findDuplicates(int[] arr1, int[] arr2){
        int[] arr = new int[arr1.length < arr2.length ? arr1.length : arr2.length];
        int index = 0;
        for (int i = 0; i < arr1.length; i++) {
            for (int j = 0; j < arr2.length; j++) {
                if(arr1[i] == arr2[j]){
                    arr[index] = arr1[i];
                    index++;
                }
            }
        }
        int[] duplicates = new int [index];
        for (int i = 0; i < index; i++) {
            duplicates[i] = arr[i];
        }
        return duplicates;
    }
}








