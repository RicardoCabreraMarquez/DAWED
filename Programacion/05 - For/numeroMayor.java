	import java.util.Scanner;
public class numeroMayor{
	public static void main(String[] args) {
		
		Scanner console = new Scanner(System.in);

		System.out.print("Introduzca el total de numero: ");
		int total = Integer.parseInt(console.nextLine());
		int valor;
		int max = Integer.MIN_VALUE;

		for (int i=0; i<total;i++){
			System.out.print("Introduzca un numero: ");
			valor = Integer.parseInt(console.nextLine());

				if (valor > max){
					max = valor;
				}
		}

		System.out.print("El numero mayor es: " + max);
	}
}