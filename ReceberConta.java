package ReceberConta;

import java.util.Scanner;

public class ReceberConta {
     public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        System.out.println("Qual o nome do cliente? ");
        String dono =s.next();

        s = new Scanner(System.in);
        System.out.println("\nQual o valor na conta? ");
        int valor = s.nextInt();

        System.out.println("\nQual a divida do cliente? ");
        int divida = s.nextInt();

        System.out.println("\nO nome do cliente é: " + dono);
        System.out.println("\nO valor na conta é: R$" + valor + " Reais");
        System.out.println("\nA divida do cliente é de: R$" + divida + " Reais");


    }
}
