import java.util.Scanner;
public class main{
	public static void main(String[]args){
		Scanner l=new Scanner(System.in);
		System.out.println("Dame el dia: ");
		int dia=l.nextInt();
     while(dia<=0||dia>31){
System.out.println("Dame un dia correcto: ");
 dia=l.nextInt();
     }

     	System.out.println("Dame el mes: ");
		int mes=l.nextInt();
     while(mes<=0||mes>12){
System.out.println("Dame un mes correcto: ");
 mes=l.nextInt();
     }

     System.out.println("Dame el año: ");
		int ano=l.nextInt();
     while(ano<=0){
System.out.println("Dame un año correcto: ");
 ano=l.nextInt();
     }

     if (mes==1) {
     	System.out.println("Dia "+dia+" Del mes de enero del año "+ano);
     }
      if (mes==2) {
		  if(dia<=29){
     	System.out.println("Dia "+dia+" Del mes de febrero del año "+ano);
		  }else{
			  System.out.println("La fecha no es correcta , febrero maximo puede tener 29 dias");
		  }
     }
      if (mes==3) {
     	System.out.println("Dia "+dia+" Del mes de marzo del año "+ano);
     }
      if (mes==4) {
     	System.out.println("Dia "+dia+" Del mes de abril del año "+ano);
     }
      if (mes==5) {
     	System.out.println("Dia "+dia+" Del mes de mayo del año "+ano);
     }

      if (mes==6) {
     	System.out.println("Dia "+dia+" Del mes de junio del año "+ano);
     }
      if (mes==7) {
     	System.out.println("Dia "+dia+" Del mes de julio del año "+ano);
     }
      if (mes==8) {
     	System.out.println("Dia "+dia+" Del mes de agosto del año "+ano);
     }
      if (mes==9) {
     	System.out.println("Dia "+dia+" Del mes de septiembre del año "+ano);
     }
      if (mes==10) {
     	System.out.println("Dia "+dia+" Del mes de octubre del año "+ano);
     }
      if (mes==11) {
     	System.out.println("Dia "+dia+" Del mes de noviembre del año "+ano);
     }
      if (mes==12) {
     	System.out.println("Dia "+dia+" Del mes de diciembre del año "+ano);
     }



	}
}