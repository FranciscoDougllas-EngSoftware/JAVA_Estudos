import java.util.Scanner;

public class condicao_if_else {
    public static void main(String[] args){
        //If e Else
        Scanner sc = new Scanner(System.in);
        System.out.printf("Digite o primeiro numero: ");
        double num1 = sc.nextDouble();

        System.out.printf("Digite o segundo numero: ");
        double num2 = sc.nextDouble();
        double media = (num1 + num2) / 2;

        if(media >= 7 && media <= 8){
            System.out.printf("Aprovado com media %.2f Pontos", media);
        }else if(media >= 9){
            System.out.printf("Aprovado com media %.2f Pontos", media);
        }else if(media >= 5 && media <= 6){
            System.out.printf("Recuperacao com media %.2f Pontos", media);
        }else{
            System.out.printf("Reprovado com media %.2f Pontos", media);
        }


    }
}
