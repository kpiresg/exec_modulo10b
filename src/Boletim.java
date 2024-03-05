import java.util.Scanner;

public class Boletim {
    public static void main(String args[]) {
        Scanner scan = new Scanner (System.in);
        System.out.println("Digite o nome do aluno: ");
        String aluno = scan.nextLine();

        System.out.println("Digite a nota minima para recuperação: ");
        int notaRecup = scan.nextInt();

        System.out.println("Digite a nota minima para aprovação: ");
        int notaMedia = scan.nextInt();


        System.out.println("Digite a nota do aluno em MATEMATICA: ");
        int mate = scan.nextInt();
        System.out.println("Digite a nota do aluno em PORTUGUES: ");
        int port = scan.nextInt();
        System.out.println("Digite a nota do aluno em CIENCIAS: ");
        int cien = scan.nextInt();
        System.out.println("Digite a nota do aluno em HISTORIA: ");
        int hist = scan.nextInt();

        int media = (mate + port + cien + hist) / 4;

        if (media >= notaMedia) {
            System.out.println("APROVADO! a nota media de " + aluno + " foi: " + media);
        } else if (media >= notaRecup && notaRecup < notaMedia) {
            System.out.println("RECUPERAÇÃO! a nota media de " + aluno + " foi: " + media);
        } else {
            System.out.println("REPROVADO! a nota media de " + aluno + " foi: " + media);
        }
    }
}

