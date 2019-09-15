import java.util.Scanner;
public class AumentoSalario2 {
	    public static void main(String[] args) {
	        String nome = "";

	        while(true){
	            Scanner scanner = new Scanner(System.in);

	            System.out.println("Qual seu nome?");
	            nome = scanner.nextLine();
	            if(nome.equals("fim")) break;

	            System.out.println("Digite aqui o valor do seu salário: ");
	            double salario = scanner.nextInt();

	            System.out.println(salario <= 500 ? nome + ", seu novo salário é de: " + (salario += salario * 0.2) : "Você não tem aumento!");
	        }
	    }
	}

