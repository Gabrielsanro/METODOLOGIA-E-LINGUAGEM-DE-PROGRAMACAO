import java.util.Scanner;

public class Gasolina {

	public static void main(String[] args) {
	        Scanner scanner = new Scanner(System.in);
	        System.out.println("Quantos litros de gasolina voc� deseja colocar?");
	        double litros = scanner.nextInt();

	        System.out.printf("Voc� gastou: %.2f reais.", (litros *= 2.50) + 6);


	   }
}

