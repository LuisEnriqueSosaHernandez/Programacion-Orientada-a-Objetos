import java.util.Scanner;
public class main{
public static void main(String[]args){
	Scanner l=new Scanner(System.in);
	int[][] matriz=new int[4][6];

int a;
	for(int i=0;i<matriz.length;i++){
	for(int j=0;j<matriz[0].length;j++){
     System.out.println("Valor para la posicion["+(i)+"]"+"["+(j)+"]");
     matriz[i][j]=l.nextInt();
	}
	}

	do{
		System.out.println("****MENU****");
		System.out.println("1:Suma de los datos de cada uno de sus renglones");
         	System.out.println("2:El promedio de los datos de cada uno de sus renglones");
         	System.out.println("3:Extraer a otro arreglo los datos del renglon que desee");
         System.out.println("4:Transponer el arreglo");
         System.out.println("5:Eliminar el renglon que desee");
System.out.println("Que desea hacer? ");
a=l.nextInt();
	}while(a<=0||a>5);
switch(a){
case 1:
System.out.println("Matriz original");
for(int i=0;i<matriz.length;i++){
	System.out.println("");
	for(int j=0;j<matriz[0].length;j++){
     System.out.print("\t"+matriz[i][j]);
	}
	}
int suma;

for(int i=0;i<matriz.length;i++){
	suma=0;
	for(int j=0;j<matriz[0].length;j++){
     suma+=matriz[i][j];
     
	}
	System.out.println("");
	System.out.println("La suma del renglon "+(i+1)+" es: "+suma);
	}


break;

case 2:
System.out.println("Matriz original");
for(int i=0;i<matriz.length;i++){
	System.out.println("");
	for(int j=0;j<matriz[0].length;j++){
     System.out.print("\t"+matriz[i][j]);
	}
	}
double promedio;
for(int j=0;j<matriz[0].length;j++){
	promedio=0;
	for(int i=0;i<matriz.length;i++){
     promedio+=matriz[i][j];
 
	}
	promedio=(promedio/4);
	System.out.println("");
	System.out.println("El promedio de la columna "+(j+1)+" es: "+promedio);
	}

break;
case 3:
System.out.println("Matriz original");
for(int i=0;i<matriz.length;i++){
	System.out.println("");
	for(int j=0;j<matriz[0].length;j++){
     System.out.print("\t"+matriz[i][j]);
	}
	}
	System.out.println("");
int[]arreglo=new int[4];
System.out.println("De que renglon deseas extraer a otro arreglo?: ");
int y=l.nextInt();
 for(int i=0;i<matriz.length;i++){
 	
	for(int j=0;j<matriz[0].length;j++){
		if(y==i){
			
	arreglo[j]=matriz[i][j];
	System.out.print(arreglo[j]);
}

    }
	
	}


break;

case 4:
System.out.println("Matriz original");
for(int i=0;i<matriz.length;i++){
	System.out.println("");
	for(int j=0;j<matriz[0].length;j++){
     System.out.print("\t"+matriz[i][j]);
	}
	}
	System.out.println("");
	System.out.println("Matriz Transpuesta");
for(int j=0;j<matriz[0].length;j++){
	System.out.println("");
	for(int i=0;i<matriz.length;i++){
     System.out.print("\t"+matriz[i][j]);
	}
	}
break;

case 5:
System.out.println("Matriz original");
for(int i=0;i<matriz.length;i++){
	System.out.println("");
	for(int j=0;j<matriz[0].length;j++){
     System.out.print("\t"+matriz[i][j]);
	}
	}
	System.out.println("");
	System.out.println("Que renglon desea eliminar: ");
	int v=l.nextInt();
	for(int i=0;i<matriz.length;i++){
	System.out.println("");
	for(int j=0;j<matriz[0].length;j++){
		if((i+1)!=v){
     System.out.print("\t"+matriz[i][j]);
 }
	}
	}
	

break;




}

}	

}
