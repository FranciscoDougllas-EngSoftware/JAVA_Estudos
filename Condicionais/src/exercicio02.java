import java.util.Random;

public class exercicio02 {
    public static void main(String[] args) {
        Random random = new Random();
        int velocidade = random.nextInt(150);
        int velocidadeMaxima = 80;
        int custo = (velocidade - velocidadeMaxima) * 10;
        System.out.printf("Sua velocidade e de %d km/h\n", velocidade);

        if(velocidade <= 60){
            System.out.printf("Voce e um Motorista Prudente\n");
        }else if(velocidade <= 80){
            System.out.printf("Voce e um Motorista Moderado\n");
        }else if(velocidade <= 120){
            System.out.printf("Voce e um Motorista Agressivo\n");
            System.out.printf("Voce deve pagar uma multa de R$ %d\n", custo);
        }else if(velocidade <= 160){
            System.out.printf("Voce e um Motorista Perigoso\n");
            System.out.printf("Voce deve pagar uma multa de R$ %d\n", custo);
        }
    }
}
