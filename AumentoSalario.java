import java.util.Scanner;

public class AumentoSalario {
 
	    public static void main(String[] args) {
	        double salario;
	        double percentual;
	        Scanner scan = new Scanner(System.in);
	        System.out.println("Digite aqui o sal�rio antigo: ");
	        salario = scan.nextDouble();
	        System.out.println("Digite aqui o percentual: ");
	        percentual = scan.nextDouble();
	        System.out.printf("O novo sal�rio � igual a : R$%.2f", (salario += salario * percentual/100));
	    }
	}
