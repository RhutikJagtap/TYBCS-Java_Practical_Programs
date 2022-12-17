
/*Set A
b) Write a program to read a text file "sample.txt" and display the contents of a file in reverse order and also original contents change the case (display in upper case).
*/
import java.io.*;

public class FileContentReverse {

    public static void main(String[] args) {
        try {
            FileInputStream fin = new FileInputStream("rj.txt");
            String str = "";
            int ch;
            System.out.println("Original Content of File :\n");

            while ((ch = fin.read()) != -1) {
                System.out.printf("%c", ch);
                str += (char) (ch);
            }
            // reverse File Content
            StringBuffer sbf = new StringBuffer(str);

            System.out.println("\n\nReverse File Content: \n" + sbf.reverse());

            System.out.println("\nOriginal file content in UpperCase: \n" + str.toUpperCase());
            fin.close();

        } catch (Exception e) {
            System.out.println(e);
        }

    }
}
// @Code By Rj

/*
 * // rj.txt file content
 * Hi i am Rhutik
 * Student Of computer Science
 */

/*
 * OP:
 * Original Content of File :
 * 
 * Hi i am Rhutik
 * Student Of computer Science
 * 
 * Reverse File Content:
 * ecneicS retupmoc fO tnedutS
 * kituhR ma i iH
 * 
 * Original file content in UpperCase:
 * HI I AM RHUTIK
 * STUDENT OF COMPUTER SCIENCE
 */
