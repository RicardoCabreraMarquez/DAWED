	import java.util.Scanner;
public class PostNegNum {
	public static void main(String[] args) {
		
		Scanner console = new Scanner(System.in);

		double n;
		double numeroPo = 0;
		double sumaPo = 0;
		double mediaPo = 0;

		double numeroNeg = 0;
		double sumaNeg = 0;
		double mediaNeg = 0;

		int numeroCero = 0;

		int a = 10;

		for (int b = 1; a >= b; b++) {
			System.out.print("Introduce un numero: ");
			n = Integer.parseInt(console.nextLine());

				if (n > 0) {
					numeroPo++;
					sumaPo = n + sumaPo;
				} else if (n < 0) {
					numeroNeg++;
					sumaNeg = n + sumaNeg;
				} else {
					numeroCero++;
				}
		}

		mediaPo = sumaPo/numeroPo;
		mediaNeg = sumaNeg/numeroNeg;

		System.out.println("La media de los numeros positivo son: " + mediaPo);
		System.out.println("La media de los numeros negativos son: " + mediaNeg);
		System.out.println("La cantidad de 0 introducida es: "+ numeroCero);
	}
}