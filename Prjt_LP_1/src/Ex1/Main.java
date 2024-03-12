package Ex1;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        int contpar = 0;
        int contimpar = 0;
        int num = -1;
        Scanner scn = new Scanner(System.in);
        while(num!=0){
            System.out.println("Digite um número: ");
            num = scn.nextInt();
            if(num !=0){
                if(num %2 == 0){
                    contpar = contpar +1;
                }else{
                    contimpar = contimpar + 1;
                    System.out.println("A quantidade de números pares é: " + contpar);
                    System.out.println("A quantidade de números impares é: "+ contimpar);
                }
            }
        }
    }
}
