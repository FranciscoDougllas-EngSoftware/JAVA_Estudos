public class variaveis_tiposDados {
    public static void main(String[] args) {
        // Tipos primitivos em Java

        // Tipo byte: armazena valores inteiros de -128 a 127
        byte b = 127;
        System.out.printf("Valor de byte %d\n", b);

        // Tipo short: armazena valores inteiros de -32.768 a 32.767
        short s = 32767;
        System.out.printf("Valor de short %d\n", s);

        // Tipo int: armazena valores inteiros de -2^31 a 2^31-1
        int i = 2147483647;
        System.out.printf("Valor de int %d\n", i);

        // Tipo long: armazena valores inteiros de -2^63 a 2^63-1
        long l = 9223372036854775807L;
        System.out.printf("Valor de long %d\n", l);

        // Tipo float: armazena valores de ponto flutuante de precisão simples
        float f = 3.14f;
        System.out.printf("Valor de float %f\n", f);

        // Tipo double: armazena valores de ponto flutuante de precisão dupla
        double d = 3.141592653589793;
        System.out.printf("Valor de double %f\n", d);

        // Tipo char: armazena um único caractere Unicode
        char c = 'A';
        System.out.printf("Valor de char %c\n", c);

        // Tipo boolean: armazena valores booleanos (true ou false)
        boolean bool = true;
        System.out.printf("Valor de boolean %b\n", bool);
    }
}