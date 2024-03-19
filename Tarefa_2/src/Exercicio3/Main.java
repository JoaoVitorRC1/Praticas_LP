package Exercicio3;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Scanner scn = new Scanner(System.in);


        System.out.println("Digite as dimensões dos cômodos:");
        double largura, comprimento;


        System.out.println("Cômodo 1:");
        System.out.print("Largura: ");
        largura = scn.nextDouble();
        System.out.print("Comprimento: ");
        comprimento = scn.nextDouble();
        double areaComodo1 = largura * comprimento;
        System.out.println("Área do cômodo 1: " + areaComodo1);


        System.out.println("Cômodo 2:");
        System.out.print("Largura: ");
        largura = scn.nextDouble();
        System.out.print("Comprimento: ");
        comprimento = scn.nextDouble();
        double areaComodo2 = largura * comprimento;
        System.out.println("Área do cômodo 2: " + areaComodo2);


        System.out.println("Cômodo 3:");
        System.out.print("Largura: ");
        largura = scn.nextDouble();
        System.out.print("Comprimento: ");
        comprimento = scn.nextDouble();
        double areaComodo3 = largura * comprimento;
        System.out.println("Área do cômodo 3: " + areaComodo3);


        System.out.println("Cômodo 4:");
        System.out.print("Largura: ");
        largura = scn.nextDouble();
        System.out.print("Comprimento: ");
        comprimento = scn.nextDouble();
        double areaComodo4 = largura * comprimento;
        System.out.println("Área do cômodo 4: " + areaComodo4);


        scn.close();
    }
}
