package ReceberLivros;

import java.util.Scanner;

public class ReceberLivro {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        System.out.println("Qual o nome do livro? ");
        String NomeLivro =s.next();

        s = new Scanner(System.in);
        System.out.println("\nQual o autor do livro? ");
        String autor = s.next();

        System.out.println("\nQual o ano de lançamento? ");
        int data = s.nextInt();

        System.out.println("\nO Autor do livro é: " + autor);
        System.out.println("\nO nome do livro é: " + NomeLivro);
        System.out.println("\nO ano de lançamento é: " + data);


    }
}
