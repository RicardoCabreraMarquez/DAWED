public class contador{
	public static void main(String[] args) {

		boolean bucle = true;

		String n1S;
		String n2S;
		String n3S;
		String n4S;
		String n5S;

		
		for (n1 = 0; n1<10;n1++) {
			for (n2 = 0; n2<10;n2++) {
				for (n3 = 0; n3<10;n3++) {
					for (n4 = 0; n4<10;n4++) {
						for (n5 = 0; n5<10;n5++) {

							if (n1 == 3 || n2 == 3 || n3 == 3 || n4 == 3 || n5 == 3) {
								System.out.println(n1 + " - " + n2 + " - " + n3 + " - " + n4 + " - " + n5);
							}
						}
					}	
				}		
			}
		}
	}
}