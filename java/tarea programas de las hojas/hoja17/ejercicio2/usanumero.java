import java.util.Scanner;
class usanumero
{
    public static void main(String[] args)
    {
        Scanner sc=new Scanner(System.in);
        numero n= new numero();
        int x, y, z;
        
        System.out.println("Dame 1° num :");
        x=sc.nextInt();
        n.setA(x);
        System.out.println("Dame 2° num :");
        y=sc.nextInt();
        n.setB(y);
        System.out.println("Dame 3° num :");
        z=sc.nextInt();
        n.setC(z);
        
             System.out.println("EL num mayor es :" + n.Mayor());
        }
}