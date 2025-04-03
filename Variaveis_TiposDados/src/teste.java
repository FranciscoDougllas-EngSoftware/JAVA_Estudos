import java.util.Scanner;

public class teste {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.printf("Digite o Primeiro Numero: ");
        int primeiroNumero = sc.nextInt();

        System.out.printf("Digite o Segundo Numero: ");
        int segundoNumero = sc.nextInt();

        for(int i = 1; i <= segundoNumero; i++) {
            System.out.printf("%d + %d = %d %n", primeiroNumero, i, primeiroNumero+i);
        }
    }
}
