import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Pousada {


    public static void main(String[] args) {

        int taxa = 0;
        String esc = "";
        int ganhosPousada = 0;
        List<Cliente> clientes = new ArrayList<Cliente>();

        
        while (!esc.equals("N") && !esc.equals("n")) {

            Cliente cliente = new Cliente();

            clientes.add(cliente);

            Scanner scanner = new Scanner(System.in);
            System.out.println("Digite aqui o nome do cliente: ");
            cliente.setNome(scanner.nextLine());
            System.out.println("Digite aqui a quantidade de dias hospedado: ");
            cliente.setDiasHospedado(scanner.nextInt());

            
            if (cliente.getDiasHospedado() < 10) taxa = 15;
            else if (cliente.getDiasHospedado() >= 10) taxa = 8;

            int custo = cliente.getDiasHospedado() * (40 + taxa);
            cliente.setCustoTotal(custo);

            System.out.println("Deseja continuar? S/N");
            esc = scanner.next();
        }

        for (Cliente cliente: clientes) {
            System.out.println("Nome: " + cliente.getNome());
            System.out.println("Dias hospedados: " + cliente.getDiasHospedado());
            System.out.println("Custos: R$" + cliente.getCustoTotal());
            ganhosPousada += cliente.getCustoTotal();
        }

        
        System.out.println("Ganhos totais: R$" + ganhosPousada);
    }

}

