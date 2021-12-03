public class Ejercicio1casa {
	public static void main(String[] args) {

		int numero = Integer.parseInt(args[0]);

		int cont = 0; 

		while(cont < numero){
			cont += 1;
			System.out.println(cont);
		}		
	}
}