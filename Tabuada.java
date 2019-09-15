import java.util.Scanner;

	public class Tabuada {

	    public static void main(String[] args) {
	        Scanner scanner = new Scanner(System.in);

	        System.out.println("Digite o número da tabuada: ");
	        mostraTabuada(scanner.nextInt());
	    }

	    public static void mostraTabuada(int n){

	        for(int i = 1; i <= 10; i ++){
	            System.out.printf("%d x %d = %d\n", n, i, n * i);
	        }
	    }
	}


