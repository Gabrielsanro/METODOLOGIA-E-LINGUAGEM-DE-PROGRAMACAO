import java.util.Scanner;
public class AumentoSalario2 {
	    public static void main(String[] args) {
	        String nome = "";

	        while(true){
	            Scanner scanner = new Scanner(System.in);

	            System.out.println("Qual seu nome?");
	            nome = scanner.nextLine();
	            if(nome.equals("fim")) break;

	            System.out.println("Digite aqui o valor do seu sal�rio: ");
	            double salario = scanner.nextInt();

	            System.out.println(salario <= 500 ? nome + ", seu novo sal�rio � de: " + (salario += salario * 0.2) : "Voc� n�o tem aumento!");
	        }
	    }
	}

