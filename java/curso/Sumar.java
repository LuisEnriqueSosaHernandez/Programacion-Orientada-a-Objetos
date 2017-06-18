import java.util.Scanner;
public class Sumar{

public static void main(String[]arg){

Scanner Lee=new Scanner(System.in);

int a,b,c=0,d=0;
System.out.print("Dame un numero: ");
a=Lee.nextInt();
System.out.print("Dame un numero mayor: ");
b=Lee.nextInt();
a+=1;
int i=a;
while(i<b){

c+=i;
System.out.print(i+" ");
i++;
}
System.out.print("="+" "+c);
System.out.print("\n");

for(int j=a;j<b;j++){
d+=j;

System.out.print(j+" ");

}
System.out.print("="+" "+d);

}
}