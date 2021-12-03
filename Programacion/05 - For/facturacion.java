	import java.util.Scanner;
public class facturacion {
	public static void main(String[] args) {

		Scanner console = new Scanner(System.in);

		int articulo1= 0;
		String codArticulo ="";
		String nombre = "manuel";
		int cantLitrVend = 0;
		int precioLitro = 0;
		int sumaFac = 0;
		int facTotal = 0;
		int facAlta = 0;
		
	
		for (int b = 1;5 >= b; b++){

			

			System.out.println("Factura " + b);
			System.out.print("Introduce codigo de articulo: ");
			codArticulo = console.nextLine();


			
			System.out.print("Introduce la cantidad de litros vendidas: ");
			cantLitrVend = Integer.parseInt(console.nextLine());

				if (codArticulo.equals(nombre)) {				
					articulo1 += cantLitrVend;
				} 

			System.out.print("Introduce el precio por litro: ");
			precioLitro = Integer.parseInt(console.nextLine());
			System.out.println("");

			sumaFac =  cantLitrVend * precioLitro;
			facTotal += sumaFac;

			if (facTotal > 600) {
				facAlta++;
			}
		}

		System.out.println("La facturacion es: " + facTotal);
		System.out.println("La cantidad vendida del articulo 1 es: " + articulo1);
		System.out.println("Hay " + facAlta + " factura de mas de 600€");
	}
}