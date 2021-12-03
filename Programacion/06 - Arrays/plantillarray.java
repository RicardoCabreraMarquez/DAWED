public class plantillarray {
	public static void main(String[] args) {
		
		int[][] tablaNumeros = {
			{1,0,0,0},
			{0,1,0,0},
			{0,0,1,0},
			{0,0,0,1}
		};

		boolean simetrica = true;

		// Tabla Numero [Fila] [Columna]

		for(int numFila = 0; numFila < tablaNumeros.length; numFila++) {
			for(int numCol = 0; numFila < tablaNumeros[numFila].length; numCol++){
				if (tablaNumeros[numFila][numCol] != tablaNumeros[numCol][numFila]) {
					simetrica = false;
				}
			}
		}

		System.out.println("¿es simetrica? => "+ simetrica);
	}
}