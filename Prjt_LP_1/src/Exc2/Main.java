package Exc2;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        int cont = 0;
        int soma = 0;
        int num = 0;

        Scanner scanner = new Scanner(System.in);

        while (num != -1) {
            System.out.println("Digite o " + cont +  "ªnúmero: ");
            num = scanner.nextInt();
            if (num != -1) {
                cont = cont + 1;
                soma = soma + num;
            }
            System.out.println("Total de números digitados: " + (cont -1));
            System.out.println("Soma dos números: " + soma);
        }
    }
    }

