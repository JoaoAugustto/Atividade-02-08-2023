import br.edu.umfg.tecnologia.Aluno;

import java.util.Scanner;

public class Atividade {
    public static void main(String[] args) {
        int RA;
        double provaUm, provaDois, trabalho;
        String nomeAluno;
        boolean teste = true;
        Scanner scanner = new Scanner(System.in);

        System.out.println("Sistema de Calculo de media do Aluno");
        System.out.println(" ");
        while (teste) {
            try {
                do {
                    System.out.print("Coloque o seu RA(Registro Academico): ");
                    RA = scanner.nextInt();
                    scanner = new Scanner(System.in);
                } while (RA < 0);

                System.out.print("Coloque o seu nome: ");
                nomeAluno = scanner.nextLine();
                scanner = new Scanner(System.in);

                do {
                    System.out.print("Coloque nota da primeira prova de 0 a 10: ");
                    provaUm = scanner.nextDouble();
                    scanner = new Scanner(System.in);
                    if (provaUm < 0 || provaUm > 10) {
                        System.out.println("!Valor invalido!");
                    }
                    System.out.println(" ");
                } while (provaUm < 0 || provaUm > 10);

                do {
                    System.out.print("Coloque nota da segunda prova de 0 a 10: ");
                    provaDois = scanner.nextDouble();
                    scanner = new Scanner(System.in);
                    if (provaDois < 0 || provaDois > 10) {
                        System.out.println("!Valor invalido!");
                    }
                    System.out.println(" ");
                } while (provaDois < 0 || provaDois > 10);

                do {
                    System.out.print("Coloque a nota do seu Trabalho de 0 a 10: ");
                    trabalho = scanner.nextDouble();
                    scanner = new Scanner(System.in);
                    if (trabalho < 0 || trabalho > 10) {
                        System.out.println("!Valor invalido!");
                    }
                    System.out.println("");
                } while (trabalho < 0 || trabalho > 10);

                Aluno aluno = new Aluno(nomeAluno, RA, provaUm, provaDois, trabalho);

                System.out.println("RESULTADO");
                aluno.toString();
                aluno.Media();
                aluno.Situacao();

                teste = false;
            } catch (Exception ex) {
                System.out.println("!Algo deu errado!");
                scanner = new Scanner(System.in);
            }
        }
    }
}