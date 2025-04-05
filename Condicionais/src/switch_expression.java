//Utilizando o Switch Expression
public class switch_expression {
    public static void main(String[] args) {
        int diaSemana = 3;
        switch (diaSemana){
            case 1 -> System.out.println("Domingo");
            case 2 -> System.out.println("Segunda");
            case 3 -> System.out.println("Terça");
            case 4 -> System.out.println("Quarta");
            case 5 -> System.out.println("Quinta");
            case 6 -> System.out.println("Sexta");
            case 7 -> System.out.println("Sábado");
            default -> System.out.println("Dia inválido");
        }
    }
}
