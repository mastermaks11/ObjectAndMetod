import java.util.Scanner;

/**
 * Created by user on 01.06.2018.
 */
public class ArraysMetod {
    public static void main(String[] args) {
        int[] arrays = new int[10];
        ArraysMetod linkArraysMetod = new ArraysMetod();
        linkArraysMetod.enterArrays(arrays);
        System.out.println("Original Arrays");
        linkArraysMetod.printArray(arrays);
        linkArraysMetod.sortArrays(arrays);
        System.out.println("");
        System.out.println("Sort Arrays");
        linkArraysMetod.printArray(arrays);
    }

    void enterArrays(int[] arrays) {
        System.out.println("Enter the elements of the array");
        Scanner scan = new Scanner(System.in);
        for (int i = 0; i < arrays.length; i++) {
            int numberArrays = scan.nextInt();
            arrays[i] = numberArrays;
        }
    }

    void printArray(int[] arrays) {
        for (int i = 0; i < arrays.length; i++) {
            System.out.print(" ' " + arrays[i] + " ' | ");
        }
    }

    void sortArrays(int[] arr) {
        for (int i = 0; i < arr.length; i++) {
            int min = arr[i];
            int min_i = i;
            for (int j = i + 1; j < arr.length; j++) {
                if (arr[j] < min) {
                    min = arr[j];
                    min_i = j;
                }
            }
            if (i != min_i) {
                int tmp = arr[i];
                arr[i] = arr[min_i];
                arr[min_i] = tmp;
            }
        }
    }
}
