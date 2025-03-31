import java.util.Scanner;

public class estruturasBasicas {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.printf("Digite o nome do Aluno: ");
        String nome = sc.nextLine();

        System.out.printf("Digite o nome do Curso: ");
        String curso = sc.nextLine();

        System.out.printf("Digite a primeira nota: ");
        double nota1 = sc.nextDouble();

        System.out.printf("Digite a segunda nota: ");
        double nota2 = sc.nextDouble();

        double media = (nota1 + nota2) / 2;
        System.out.println("A Media do Aluno e de: " + media + " Pontos");
        System.out.printf("%s Tirou no curso de %s %.2f Pontos: %n", nome, curso,  media);
    }
}