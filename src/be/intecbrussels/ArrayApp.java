package be.intecbrussels;

public class ArrayApp {
    public static void main(String[] args) {

        //Ex:2 Een array vullen
        int[] incrementedNumbers = IntegerArrayUtils.generateArrayWithIncrement(3);  //0 3 6 9 12 15 18 21 24 27
        for (int num : incrementedNumbers) {
            System.out.print(num + " ");
        }
        System.out.println("");

        //Ex:3 Is de array gesorteerd?
        int[] testArray = new int[]{5, 6, 3, 7, 1, 5, 10, 2}; //fasle
        int[] testArray2 = new int[]{1, 2, 3, 4, 9, 10};       //true
        System.out.println(IntegerArrayUtils.isSorted(testArray));
        System.out.println(IntegerArrayUtils.isSorted(testArray2));

        //Ex:4 Array Omkeren
        IntegerArrayUtils.reverseArray(testArray); // 2 10 5 1 7 3 6 5
        for (int num : testArray) {
            System.out.print(num + " ");
        }

        System.out.println("");

        // Ex:5.Meer Wiskunde
        String[] data = IntegerArrayUtils.getIntArrayData(testArray2);  // The minimum value is: 1
        for (String value : data) {                                     // The maximum value is: 10
            System.out.println(value);                                  // The average value is: 4.833333333333333
        }                                                               // The sum is: 29

        //Ex:6 Vind de dublicaten
        int[] dublicateNumbers = IntegerArrayUtils.findDuplicates(testArray, testArray2); // 2 10 1 3
        for (int num : dublicateNumbers) {
            System.out.print(num + " ");
        }

    }
}


