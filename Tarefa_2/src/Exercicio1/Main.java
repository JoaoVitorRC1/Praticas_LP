package Exercicio1;

public class Main {
    public static void main(String[] args) {
        int contador = 0;

        for (int i = 2; i <= 1000; i+=2)
        {
            if (i % 3 == 0)
            {
                System.out.println(i + "");
                contador++;
            }
        }

        System.out.println("Total de números: " + contador);
    }
}

