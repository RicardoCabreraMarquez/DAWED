public class TiposDatos {
	public static void main(String[] args){
		/* Booleano */
		boolean verdad = true;
		boolean falso = false;
		/* Caracterer */
		char caracter = 'A';
		/* Numero Entero */
		byte b = Byte.MAX_VALUE;
		short s = Short.MAX_VALUE;
		int i = Integer.MAX_VALUE;
		long l = Long.MAX_VALUE;
		/* Numero Decimal */
		float f = Float.MAX_VALUE;
		double d = Double.MAX_VALUE;

		/* Extra: Guardar numero */
		int dec = 10;
		int bin = 0b1010;
		int hex = 0xA;

		System.out.println(verdad);
		System.out.println(falso);
		System.out.println(caracter);
		System.out.println(b);
		System.out.println(s);
		System.out.println(i);
		System.out.println(l);
		System.out.println(f);
		System.out.println(d);
		System.out.println(dec);
		System.out.println(bin);
		System.out.println(hex);  
	}
}