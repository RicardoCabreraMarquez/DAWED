public class Exerxice1profesor {
	public static void main(String[] args) {
		int[] numeros = {0,1,2,3,4,5,6,7,8,9};

		boolean creciente = true;
		boolean decreciente = true;

		for (int i = 0; i < numeros.length-1, i++) {
			if(numeros[i] > numeros[i+1]) {
				creciente = false;
			} else if (numeros[i] < numeros[i+1]) {
				decreciente = false;
			}
		}

		if(creciente && decreciente){
			System.out.println("Todos los numeros son iguales");
		} else if(creciente){
			System.out.println("Los numeros están ordenados de forma creciente");
		} else if (decreciente){
			System.out.println("Los numeros están ordenados de forma decreciente");
		} else {
			System.out.println("Los numeros estan desordenados");
		}
	}
}
                        