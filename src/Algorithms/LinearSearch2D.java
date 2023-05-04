package Algorithms;

public class LinearSearch2D {
    public static void main(String[] args) {
        int a[][] = {{2, 3, 4, 5, 6},
                {1, 7, 8, 9},
                {10, 11, 12},
                {13, 14, 15}
        };

        int item = 14;
        for (int i = 0; i < a.length; i++) {
            for (int j = 0; j < a[i].length; j++) {
                if (a[i][j] == item) {
                    System.out.println(a[i][j] + "  element is found at row" + i + "column " + j);
                }
            }
        }
    }
}