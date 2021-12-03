public class Ejercicio3casa {
	public static void main(String[] args) {
		int numero = args.length;
		int numero1;
		char[] letra;

		while (numero>0){
			numero--;
		

		letra = args[numero].toCharArray();
		numero1 = letra.length;

		while (numero1 > 0) {
			numero1--;
			System.out.println(letra[numero1]);
			System.out.println(" ");
		}

		}


			
		}

	}
