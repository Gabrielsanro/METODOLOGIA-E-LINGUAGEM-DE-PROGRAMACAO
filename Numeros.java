import java.util.Scanner;

public class Numeros {

	


	    public static void main(String[] args) {

	        Scanner scanner = new Scanner(System.in);

	        for(int i = 0; i < 10; i++){
	            System.out.println("Digite aqui um n�mero: ");
	            System.out.println(scanner.nextInt() % 2 == 0 ? "N�mero par!" : "N�mero �mpar!");
	        }
	    }
	}
