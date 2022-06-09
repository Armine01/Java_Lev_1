package Lesson3;

public class Main {
    public static void main(String[] args) {
        invertArray();
        fillArray();
        Multiply();
        fillDiagonal();
    }

    public static void invertArray() {
        int[] arr = {1, 1, 0, 1, 0, 1, 1, 0, 1};
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] == 1) {
                arr[i] = 0;
            } else {
                arr[i] = 1;
            }
            System.out.print(arr[i] + " ");
        }
        System.out.println();
    }

    public static void fillArray() {
        int[] arr1 = new int[100];
        for (int i = 0; i < arr1.length; i++) {
            arr1[i] = i + 1;
            System.out.print(arr1[i] + " ");
        }
        System.out.println();
    }

    public static void Multiply() {
        int[] arr2 = {1, 5, 3, 2, 11, 4, 5, 2, 4, 8, 9, 1};
        for (int i = 0; i < arr2.length; i++) {
            if (arr2[i] < 6) {
                arr2[i] *= 2;
                System.out.print(arr2[i] + " ");
            }
            System.out.println();
        }
    }

    public static void fillDiagonal() {
        int[][] arr3 = new int[8][8];
        for (int i = 0; i < arr3.length; i++)  {
            for (int j = 0; j < arr3[i].length; j++) {
                if (i ==j) {
                    arr3[i][j]= 1;
                }
                if (i + j == arr3.length - 1) {
                    arr3[i][j]=1;
                }
                System.out.print(arr3[i][j] + " ");
            }
            System.out.println();
        }
    }
    public static int[] getArray(int len, int initialValue) {
        int[] result = new int[len];
        for (int i = 0; i < result.length; i++) {
            result[i] = initialValue;
        }
        return result;
    }
}