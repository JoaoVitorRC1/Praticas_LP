package Exercicio2;

import java.util.Scanner;

// Faça um programa que leia 10 números inteiros, calcule e mostre ao final, a soma e a média.

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int soma = 0;
        int numero = 0;

        System.out.println("Digite 10 números inteiros:");
        for (int i = 0; i < 10; i++) {
            System.out.print("Número " + (i + 1) + ": ");
            numero = scanner.nextInt();
            soma = soma + numero;
        }

        double media = (double) soma / 10;


        System.out.println("A soma dos números: " + soma);
        System.out.println("A média dos números: " + media);

        scanner.close();
    }
}

