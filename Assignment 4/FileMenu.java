
/*
Set C
a) Write a menu driven program to perform the following operations on a set of integers as shown in the following figure. 
A load operation should generate 10 random integers (2 digit) and display the number on screen.
The save operation should save the number to a file "number.txt". 
The short menu provides various operations and the result is displayed on the screen.
*/
import java.io.*;
import java.util.*;

public class FileMenu {
    public static void main(String[] args) {
        try {
            FileOutputStream fout = new FileOutputStream("number.txt");
            FileReader fr = new FileReader("number.txt");
            Scanner sc = new Scanner(System.in);
            int choice, n;
            String num = "";
            do {

                System.out.println("\n\n\tFile Menu\n");
                System.out.println("1. Generate and Disply Numbers");
                System.out.println("2. Save Numbers in file");
                System.out.println("3. View File Content");
                System.out.println("4. Exit");
                System.out.println("Enter Your Choice");
                choice = sc.nextInt();
                switch (choice) {
                    case 1:
                        Random r = new Random();
                        for (int i = 0; i < 10; i++) {
                            n = r.nextInt(99);
                            num += n + " ";
                            System.out.print(n + " ");
                        }
                        break;
                    case 2:
                        byte b[] = num.getBytes();
                        fout.write(b);
                        System.out.println("\n\tFile Content Saved");
                        fout.close();
                        break;
                    case 3:
                        int ch;
                        System.out.println("\n\tFile Content\n");

                        while ((ch = fr.read()) != -1) {
                            System.out.print((char) ch);
                        }
                        fr.close();

                        break;
                    case 4:
                        System.exit(0);
                        break;
                }// switch
            } while (choice != 4);
        } catch (Exception e) {
            System.out.println(e);

        }
    }
}
/* 

PS C:\Users\dell6\Rhutik\Documents\Desktop\java -1 Assignment\assignment-4> javac FileMenu.java                                                                                                                                                                          

        File Menu

1. Generate and Disply Numbers
2. Save Numbers in file
3. View File Content
4. Exit
Enter Your Choice
1
51 10 75 19 7 81 98 43 73 17 

        File Menu

1. Generate and Disply Numbers
2. Save Numbers in file
3. View File Content
4. Exit
Enter Your Choice
2

        File Content Saved


        File Menu

1. Generate and Disply Numbers
2. Save Numbers in file
3. View File Content
4. Exit
Enter Your Choice
3

        File Content

51 10 75 19 7 81 98 43 73 17

        File Menu

1. Generate and Disply Numbers
2. Save Numbers in file
3. View File Content
4. Exit
Enter Your Choice
4

*/
