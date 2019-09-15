import java.util.Scanner;

public class Prefeitura {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Digite aqui o salário bruto: ");
        double salario = scanner.nextDouble();
        System.out.println("Digite aqui o valor da prestação: ");
        double prestacao = scanner.nextDouble();

        System.out.println(prestacao <= salario * 0.3 ? "O empréstimo pode ser concedido!" : "O empréstimo não pode ser concedido :(");
    }
}
