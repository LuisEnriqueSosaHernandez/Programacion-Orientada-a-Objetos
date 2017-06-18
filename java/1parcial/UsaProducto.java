import java.util.*;
class UsaProducto{
public static void main(String []arg){
Double p;
Double p2;

	Scanner lee = new Scanner (System.in);

	Producto producto = new Producto();

         System.out.print ("Cual es el total de productos: ");
        int n=lee.nextInt();
	producto.setNumProductos (n);
	System.out.print ("Cual es el precio del producto: ");
	producto.setPrecio (lee.nextFloat());

        if(n<20){
	
	p= producto.CalculaPrecioTotal();
	System.out.println("El precio con iva es: " + producto.CalculaPrecioTotal());
} 
else {
       p2= producto.CalculaPrecioTotal2();
	System.out.println("El precio con iva y descuento mayoritario es: " + producto.CalculaPrecioTotal2());


	
	}
}
}