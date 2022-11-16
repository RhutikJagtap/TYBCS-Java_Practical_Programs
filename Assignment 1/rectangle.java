//Set A-b)  programm to calculate and area of rectangle @Code by Rj

 import java.util.*;
class rectangle {
    public static void main(String[] args) 
    {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter length:");
        int length = sc.nextInt();
        System.out.println("Enter breadth:");
        int bredth= sc.nextInt();
        int area=length*bredth;
        System.out.println("Area of rectangle:"+area);
        int perimeter=2*(length+bredth);
        System.out.println("Perimeter of rectangle:"+perimeter);

    }
}
// @Code by Rj
