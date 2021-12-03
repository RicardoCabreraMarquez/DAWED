public class EjercicioWhile{
	public static void main(String[] args) {
		int palabra = args.length;
		int letra = 0;
		String frase; 

		while(palabra > 0) {
			palabra--;

			frase = args[palabra];
			letra = palabra.length();
			while(letra > 0){
				letra--;
				System.out.print(palabra.charAt(letra));
			}
			System.out.print(" ");
		}
	}
}