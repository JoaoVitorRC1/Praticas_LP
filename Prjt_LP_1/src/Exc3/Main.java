package Exc3;
import java.util.Scanner;
public class Main {
    public static void main(String[] args) {

        Scanner scn = new Scanner(System.in);
        Double nota;
        Double soma = 0.0;
        for(int i = 1; i <= 3; i++){
            System.out.println("Digite a " + i + "ª nota:");
            nota = scn.nextDouble();
            soma = soma + nota;
        }
        System.out.println("A soma das notas foi: " + soma);
        System.out.println("A média das notas foi: " + (soma/3));
    }
}
