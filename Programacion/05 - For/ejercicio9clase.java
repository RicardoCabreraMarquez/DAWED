public class ejercicio9clase {
public static void main(String[] args) {


    int numero=Integer.parseInt(args[0]);

        for(int contador=1;contador<numero;contador++){

        for (int repe=0; repe<=contador; repe++) {

            for (int ars=repe;ars<numero-1; ars++){
                System.out.print(" ");
            }
            for (int repe2=0;repe2<2*repe+1; repe2++){
                System.out.print("*");
            }

            System.out.println("");
            }
        }
    }
}