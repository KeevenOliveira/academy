import java.util.Scanner;
import static java.util.Collections.nCopies;
import static java.lang.String.join;
public class Main {
    public static String converterEmRomanos(int decimal) {
    	String[] ROMANOS =
            {"M", "CM", "D", "CD", "C", "XC", "L", "XL", "X", "IX", "V", "IV", "I"};
    	int[] DECIMAIS =
            {1000, 900, 500, 400, 100, 90, 50, 40, 10, 9, 5, 4, 1};
        StringBuilder resultado = new StringBuilder();
        for (int i = 0; i < DECIMAIS.length; i++) {
            int parteInteira = decimal / DECIMAIS[i];
            decimal -= DECIMAIS[i] * parteInteira;
            resultado.append(join("", nCopies(parteInteira, ROMANOS[i])));
        }
        return resultado.toString();
    }
    public static void main(String[] args) {
    	Scanner input = new Scanner(System.in);
    	
    	System.out.println("digite um número a ser convertido: ");
    	int numero = input.nextInt();
    	
    	String resultado = converterEmRomanos(numero);
    	System.out.println(resultado);
    }

}
