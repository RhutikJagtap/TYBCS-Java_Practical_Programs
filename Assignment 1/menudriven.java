/*Set A-c)Menu driven program to perform the Following Operations
i)Calculate the Volume Of Cylinder
ii)Find the Factorial of given number
iii)Check the number is Armstrong Or Not
iv)Exit
 */
import java.util.Scanner;
public class menudriven {
    public static void main(String[] args) {
        int  Choice;
        while (true) {
            System.out.println("Enter Your choice");
            System.out.println("1.Volume of cylinder");
            System.out.println("2.Factorial of number");
            System.out.println("3.Check Number is Armstrong or Not");
            System.out.println("4.exit");
            Scanner sc = new Scanner(System.in);
            Choice = sc.nextInt();
            switch (Choice) {
                case 1: Double radius,height,volume;
                    Scanner s = new Scanner(System.in);
                    System.out.println("Enter radius of cylinder:");
                    radius = s.nextDouble();
                    System.out.println("Enter height of cylinder:");
                    height = sc.nextDouble();
                    final Double PI = 3.14;
                    volume = PI * (radius * radius) * height;
                    System.out.println("Volume of Cylinder:" + volume);
                    break;
                case 2:int num,fact=1,sum;
                    System.out.println("Enter any number:");
                    num = sc.nextInt();
                    while (num > 0) {
                        fact = fact * num;
                        num = num - 1;
                    }
                    System.out.println("Factorial=" + fact);
                    break;
                case 3:int temp,rem;
                    Scanner b = new Scanner(System.in);
                    System.out.println("Enter number:");
                    int n = b.nextInt();
                    temp = n;
                    sum = 0;
                    while (n > 0) {
                        rem = n % 10;
                        sum = sum + (rem * rem * rem);
                        n = n / 10;
                    }
                    if (temp == sum)
                        System.out.println(temp + " is an Armstrong number");
                    else
                        System.out.println(temp + " is not an Armstrong number");
                    break;
                case 4:
                    System.out.println("exit");
                    break;
                default:
                    System.out.println("Invalid choice");
                    break;
            }
        }
    }
}