package ReceberEndereco;

import java.util.Scanner;

public class ReceberEndereco {
    
     public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        System.out.println("Qual o nome da rua? ");
        String rua =s.next();

        s = new Scanner(System.in);
        System.out.println("\nQual o nome da cidade? ");
        String cidade = s.next();

        System.out.println("\nQual o número da casa? ");
        int numero = s.nextInt();

        System.out.println("\nO nome da rua é: " + rua);
        System.out.println("\nA cidade é: " + cidade);
        System.out.println("\nO número da casa é: " + numero);


    }
}
