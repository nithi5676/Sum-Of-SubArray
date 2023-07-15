package sumOfSubArray;

import java.util.Scanner;

public class SumOfSUbArray {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter the size ");
        int size = scanner.nextInt();
        // System.out.print("Enter maximum Limit ");
        // int limit = scanner.nextInt();
        System.out.println("Enter array elements");
        int array[] = new int[size];
        for (int i = 0; i < array.length; i++) {
            array[i] = scanner.nextInt();
        }
        scanner.close();
        limitSum(array, size);
    }

    public static void limitSum(int array[], int size) {
        int sum = 0, temp;
        //
        for (int i = 0; i < size; i++) {
            temp = 0;
            for (int j = i; j < size; j++) {
                temp += array[j];
                sum += temp;

            }
        }
        System.out.println(sum);
    }

}
