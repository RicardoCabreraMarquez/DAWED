public class holaContador {
	public static void main(String[] args) {

		int cont = 0;

		int numero = Integer.parseInt(args[0]);

		String nombre = args[1];

		while(cont < numero){
			cont += 1;
			System.out.println("Hola "+ nombre +"!");
		}		
	}
}