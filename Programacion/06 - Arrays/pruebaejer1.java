	import java.util.Scanner;
public class pruebaejer1 {
	public static void main(String[] args) {

		Scanner entrada = new Scanner(System.in);

		//creación de un arreglo de 10 elementos

		int[] tabla = new int[10];

		int numero, posicion;

		//Leer 8 números

		System.out.println("Guardando 8 elementos de la tabla.");

		for(int i=0;i<8;i++){

		System.out.print((i+1) + ". Digite un numero:");

		tabla[i] = entrada.nextInt();

		}

		//Pedir un numero

		System.out.print("Ahora digite un numero que usted desee:");

		numero = entrada.nextInt();

		//Elegir la posición donde ese numero va a ir

		System.out.println("Ahora elija una posición de la tabla donde quiera insertar dicho numero");

		posicion = entrada.nextInt();

		//colocar numero en la posición indicada

		tabla[posicion] = numero;
	}
}