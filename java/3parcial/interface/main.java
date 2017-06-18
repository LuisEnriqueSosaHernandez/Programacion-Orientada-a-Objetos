public class main{
public static void main(String[]args){
primera p=new primera();
segunda s=new segunda();

System.out.println("Operaciones faciles");
System.out.println(p.suma());
System.out.println(p.resta());
System.out.println(p.operacion());
System.out.println(p.calculo());

System.out.println("Operaciones dificiles");
System.out.println(s.multiplicacion());
System.out.println(s.division());
System.out.println(s.operacion());
System.out.println(s.calculo());
}
}