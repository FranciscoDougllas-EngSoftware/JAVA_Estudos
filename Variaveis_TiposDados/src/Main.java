import java.util.Scanner;

public class Main {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.printf("Digite o nome do Aluno: ");
        String nome = sc.nextLine();

        System.out.printf("Digite a Idade do %s. ", nome);
        int idade = sc.nextInt();

        System.out.printf("Seu nome e %s e sua idade e %d", nome, idade);
    }
}