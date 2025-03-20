package ReceberAluno;

import java.util.Scanner;

public class ReceberAluno {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        System.out.println("Qual o nome do aluno? ");
        String NomeAluno =s.next();

        s = new Scanner(System.in);
        System.out.println("\nQual a idade do aluno? ");
        int idade = s.nextInt();

        System.out.println("\nQual o curso do aluno? ");
        String curso = s.next();

        System.out.println("\nO Nome do aluno é: " + NomeAluno);
        System.out.println("\nA idade do aluno é: " + idade + " anos");
        System.out.println("\nO curso do aluno é: " + curso);


    }
}
