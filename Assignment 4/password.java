/* SET B
b) Define class EmailId with members ,username and password. Define default and parameterized constructors.
  Accept values from the command line Throw user defined exceptions – "InvalidUsernameException" or
  "InvalidPasswordException" if the username and password are invalid.
 */
class InvalidUsernameException extends Exception {
    String msg = "Invalid Username....\nTry Again\n";

    public String toString() {
        return msg;
    }
}

class InvalidPasswordException extends Exception {
    String msg = "Invalid Pasword....\nTry Again\n";

    public String toString() {
        return msg;
    }
}

class EmailId {
    String username;
    String password;

    EmailId() {
        username = "rhutik";
        password = "rj@7385";
    }

    EmailId(String u, String p) {
        username = u;
        password = p;
    }

}// EmailId

public class password {
    public static void main(String[] args) {
        EmailId e1 = new EmailId(args[0], args[1]);
        EmailId e2 = new EmailId();

        String s1 = e1.username;
        String s2 = e2.username;

        String s3 = e1.password;
        String s4 = e2.password;

        try {
            if (s1.equals(s2)) {
                System.out.println("Username Matched..!");
            } else {
                throw new InvalidUsernameException();
            }
        } catch (InvalidUsernameException e) {
            System.out.println(e);
        }

        try {
            if (s3.equals(s4)) {
                System.out.println("Password Matched..!");
            } else {
                throw new InvalidPasswordException();
            }
        } catch (InvalidPasswordException e) {
            System.out.println(e);
        }
    }
}
/* OP:
PS C:\Users\dell6\RhutikJagtap\Documents\Desktop\java -1 Assignment\assignment-4> javac Password.java
PS C:\Users\dell6\RhutikJagtap\Documents\Desktop\java -1 Assignment\assignment-4> java password rhutik rj@7385
Username Matched..!
Password Matched..!
PS C:\Users\dell6\RhutikJagtap\Documents\Desktop\java -1 Assignment\assignment-4> java password rhutikjagtap rj@7385                                         
Invalid Username....                                                                                                                                       
Try Again

Password Matched..!
PS C:\Users\dell6\RhutikJagtap\Documents\Desktop\java -1 Assignment\assignment-4> java password rj@7385 rhutik      
Invalid Username....
Try Again

Invalid Pasword....
Try Again
 */

