import java.util.Scanner;

public class Prefeitura {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Digite aqui o sal�rio bruto: ");
        double salario = scanner.nextDouble();
        System.out.println("Digite aqui o valor da presta��o: ");
        double prestacao = scanner.nextDouble();

        System.out.println(prestacao <= salario * 0.3 ? "O empr�stimo pode ser concedido!" : "O empr�stimo n�o pode ser concedido :(");
    }
}
