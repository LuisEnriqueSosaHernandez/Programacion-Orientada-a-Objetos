import java.util.*;
public class main {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        numeros n=new numeros();
        int i, z;
        System.out.println("Dame primer num :");
        i=sc.nextInt();
        n.setX(i);
        System.out.println("\n Dame el segundo num :");
        i=sc.nextInt();
        n.setY(i);
        
        System.out.println("\n\t"+n.imprime());
    }
}
