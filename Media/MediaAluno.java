import java.text.DecimalFormat;
import java.util.Scanner;

public class MediaAluno {

    private static final int SIZE = 6;

    public static void main(String[] args) {
        Aluno[] alunos = new Aluno[SIZE];
        Scanner scanner = new Scanner(System.in);
        int aprovados = 0;
        int reprovados = 0;
        int emExame = 0;
        double mediaGeral = 0;


        
        for(int i = 0; i < SIZE; i++){
            alunos[i] =  new Aluno();
            System.out.println("Digite aqui a primeira nota: ");
            alunos[i].setNota1(scanner.nextDouble());
            System.out.println("Digite aqui a segunda nota: ");
            alunos[i].setNota2(scanner.nextDouble());
            alunos[i].setMedia(calculaMedia(alunos[i].getNota1(), alunos[i].getNota2()));

            System.out.println("Sua média foi de: " + alunos[i].getMedia());

            if(alunos[i].getMedia() >= 7){
                System.out.println("Parabéns! Você foi aprovado!");
                aprovados++;
            } else if(alunos[i].getMedia() < 7 && alunos[i].getMedia() >= 3){
                System.out.println("Você está em exame, estude mais!");
                emExame++;
            } else if(alunos[i].getMedia() < 3){
                System.out.println("Você infelizmente está reprovado, estude mais da próxima vez.");
                reprovados++;
            }
        }

        
        for(int j = 0; j < SIZE; j++) mediaGeral += alunos[j].getMedia();
        DecimalFormat decimalFormat = new DecimalFormat("#.##");
        decimalFormat.format(mediaGeral /= 2);

        
        System.out.println("Média geral da turma: " + mediaGeral);
        System.out.println("Alunos aprovados: " + aprovados);
        System.out.println("Alunos reprovados; " + reprovados);
        System.out.println("Alunos em exame: " + emExame);
    }

    private static double calculaMedia(double nota1, double nota2){
        return (nota1 + nota2) / 2;
    }
}

