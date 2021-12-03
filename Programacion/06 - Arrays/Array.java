public class Array {
	public static void main(String[] args) {
		int[] numeros = new int[10]; /* [0,0,0,0,0,0,0,0,0,0] */
		int[] numeros2 = {0,1,2,3,4,5,6,7,8,9};

		for (int i=0; i < numeros.length ; i++){
			System.out.print(numeros[i]+" - ");
		}

		System.out.println();

		for (int i=0; i<numeros.length ; i++) {
			numeros[i] = (int)Math.floor(Math.random()*10)+1;
		}

		for (int i=0; i<numeros.length ; i++) {
			System.out.print(numeros[i]+" - ");
		}
	}
}