import java.lang.reflect.Array;
import java.util.*;

public class Estoque {

	public static void main(String[] args) {
	Locale.setDefault(Locale.US);
	Scanner scan = new Scanner(System.in);
	
	System.out.print("Informe a quantidade de produtos: ");
	int quant_prod = scan.nextInt();
	
	double produtos[][] = new double[quant_prod][2];
	
	double total = 0;
		for(int i = 0; i < produtos.length; i++) {
			System.out.printf("Informe a ID do %d produto: ", i+1);
			produtos[i][0] = scan.nextDouble();
			
			System.out.printf("Informe o valor do %d produto: ", i+1);
			produtos[i][1] = scan.nextDouble();
			total += produtos[i][1];
		}
	System.out.printf("\n\n\n\nQuantidade de produtos no estoque: %d", quant_prod);
	System.out.printf("%nValor total do estoque R$: %.2f", total);
	System.out.printf("\n––––––––––––––––––––––––––––––––––––––––––––––");
	System.out.printf("\n------Lista de Produtos no estoque------");
	System.out.printf("\n           ID		Valor\n");
	for(int i = 0; i < quant_prod; i++) {
		System.out.printf("Produto %d: ", i+1);
		for(int j=0; j<2; j++) {
			if(j==1) {
				System.out.printf("R$ ");
			}
			System.out.printf("%.2f\t", produtos[i][j]);
		}
		System.out.println();
	}
	System.out.printf("––––––––––––––––––––––––––––––––––––––––––––––");
	}
	
	
	
}
