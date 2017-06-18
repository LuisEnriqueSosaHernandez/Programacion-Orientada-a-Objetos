import java.util.Scanner;
public class main{
public static void main(String[]args){
	Scanner l=new Scanner(System.in);
	System.out.print("Hora :");
	int a=l.nextInt();
	int b=l.nextInt();
	int c=l.nextInt();
	if(a>=0&&a<24){
	if(b>=0&&b<60){
	if(c>=0&&c<60){
	System.out.println("La hora: "+a+":"+b+":"+c+" Es correcta");
	}
	}
	}else{
		System.out.println("La hora: "+a+":"+b+":"+c+" Es incorrecta");
	}
	}
}