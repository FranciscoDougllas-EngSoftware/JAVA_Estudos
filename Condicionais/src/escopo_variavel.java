public class escopo_variavel {
    public static void main(String[] args) {
        //Escopo de variavel
        int x = 10; //variavel global
        System.out.println("Valor de x: " + x);
        {
            int y = 20; //variavel local
            System.out.println("Valor de y: " + y);
            System.out.println("Valor de x dentro do bloco: " + x);
        }
    }
}
