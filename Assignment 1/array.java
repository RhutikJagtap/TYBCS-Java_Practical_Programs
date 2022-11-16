//Set A-d) Aprogramm to accept the array element and display in reverse order
import java.util.*;
public class array {
    public static void main(String args[]) {
        int n, i,j;
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the Size of array:");
        n = sc.nextInt();
        int[] x = new int[5];
        System.out.println("Enter the elements of the array");
        for (i = 0; i < n; i++) {
            x[i] = sc.nextInt();
        }
        System.out.println("Array elements are:");
        for (i = 0; i < n; i++) {
            System.out.println(x[i]);
        }
        System.out.println("Reverse data list");
        for(j=n-1;j>=0;j--)
        {
            System.out.println(x[j]);
        }

    }
}


