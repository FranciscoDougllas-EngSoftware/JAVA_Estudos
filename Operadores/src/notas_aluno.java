import java.util.Scanner;
public class notas_aluno {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        double nota1, nota2, media;
        System.out.printf("Digite a Primeira nota: ");
        nota1 = sc.nextDouble();

        System.out.printf("Digite a Segunda nota: ");
        nota2 = sc.nextDouble();

        media = (nota1 + nota2) /2;
        System.out.printf("A media do aluno e: %.2f\n", media);

        if(media >= 9){
            System.out.printf("Aprovado com a media de %.2f Pontos", media);
        }else if(media >= 7 && media < 9){
            System.out.printf("Aprovado com a media de %.2f Pontos", media);
        }else{
            System.out.printf("Reprovado com a media de %.2f Pontos", media);
        }

    }
}
