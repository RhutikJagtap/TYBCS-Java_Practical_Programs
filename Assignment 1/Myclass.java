/*Set A-a)using javap,view the methods of the following classes from the lang package
java.lang.object,java.lang.string and java.util.scanner. and also compile sample programm.
 type the command and view the bytecodes. javap -c Myclass
 @Code by Rj
 */
public class Myclass {
    int num;
    public Myclass()
    {
        num=0;
    }
    public Myclass(int num)
    {
        this.num=num;
    }
  public static void main(String[] args) 
    //public static void main(java.lang.String[]) 
   {
    Myclass m1=new Myclass();
    if(args.length>0)
    {
        int n=Integer.parseInt(args[0]);
        Myclass m2=new Myclass(n);
        System.out.println(m1.num);
        System.out.println(m2.num);
    }
    else
    System.out.println("Insufficient arguments");
   }
}
// @Code by Rj


