import java.util.Scanner;
import java.util.Locale;
public class Desafio1 {

	public static void main(String[] args) {
		Locale.setDefault(Locale.US);
		Scanner entrada = new Scanner(System.in);
		int quant_notas;
		
		System.out.print("Informe a quantidade de notas: ");
		quant_notas = entrada.nextInt();
		
		double notas[] = new double[quant_notas];
		double media = 0;
		
		for (int i = 0; i < notas.length; i++) {
			System.out.printf("Informe a %d° nota: " , i +1);
			notas[i] = entrada.nextDouble();
			media += notas[i];
		}
		
		media = media/notas.length;
		
		System.out.printf("A média é: %.2f" , media );
		
		entrada.close();
	}

}
