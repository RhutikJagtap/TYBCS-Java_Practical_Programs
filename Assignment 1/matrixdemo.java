/* Set C-c) Menu driven Program to perform the foolowing operations on 2D array:
i)Sum of Diagonal Elements
ii)Sum of Upper Diagonal Elements
iii)Sum of Lower Diagonal Elements
iv)Exit*/
import java.util.*;

public class matrixdemo {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter size of row and column: ");
        int n = sc.nextInt();
        int sum = 0;
        int[][] m = new int[n][n];
        System.out.println("\nEnter values of matrix :\n");

        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                m[i][j] = sc.nextInt();
            }
        }

        System.out.println("\nEntered Matrix...\n");
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                System.out.print(m[i][j] + " ");
            }
            System.out.println();
        }
        do {
            System.out.println("\nMatrix Operations\n");
            System.out.println("\n1.Sum of Diagonal Elements.");
            System.out.println("\n2.Sum of Upper Diagonal Elements.");
            System.out.println("\n3.Sum of Lower Diagonal Elements.");
            System.out.println("\n4.Exit");
            System.out.println("Enter Your Choice :");
            int ch = sc.nextInt();

            switch (ch) {
                case 1:
                    sum = 0;
                    for (int i = 0; i < m.length; i++) {
                        for (int j = 0; j < m.length; j++) {
                            if (i == j) {
                                sum = sum + m[i][j];
                            }
                        }
                    }
                    System.out.println("\nAddition of Diagonal Elements:" + sum);
                    break;

                case 2:
                    sum = 0;
                    for (int i = 0; i < m.length; i++) {
                        for (int j = 0; j < m.length; j++) {
                            if (j > i) {
                                sum = sum + m[i][j];
                            }
                        }
                    }
                    System.out.println("\nAddition of Upper Diagonal Elements:" + sum);
                    break;

                case 3:
                    sum = 0;
                    for (int i = 0; i < m.length; i++) {
                        for (int j = 0; j < m.length; j++) {
                            if (i > j) {
                                sum = sum + m[i][j];
                            }
                        }
                    }
                    System.out.println("\nAddition of Lower Diagonal Elements:" + sum);
                    break;

                case 4:
                    System.exit(0);
                default:
                    break;
            }
        } while (true);

    }
}