	import java.util.Scanner;
public class Ejercicio5 {
	public static void main(String[] args) {
		
		int[] tabla1 = {0,1,2,3,4,5,6,7,8,9};
		int[] tabla2 = {10,11,12,13,14,15,16,17,18,19};
		int[] tabla3 = new int[tabla1.length+tabla2.length];


 
		for (int i=0; i<tabla1.length; i++) {
			tabla3 [i*2] = tabla1[i];
			tabla3 [i*2+1] = tabla2[i];
		}

	}	
}  