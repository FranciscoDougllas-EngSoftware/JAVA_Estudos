public class operadoresRelacionais {
    //Os Operadores Relacionais são
    // ==, !=, >, <, >=, <=
    public static void main(String[] args) {
        // == igual
        // != diferente
        // > maior
        // < menor
        // >= maior ou igual
        // <= menor ou igual

        int a = 10;
        int b = 20;

        System.out.println(a == b); // false
        System.out.printf("%d e == %d: %b\n", a, b, a == b);
        System.out.printf("%d e != %d: %b\n", a, b, a != b);
        System.out.printf("%d e > %d: %b\n", a, b, a > b);
        System.out.printf("%d e < %d: %b\n", a, b, a < b);
        System.out.printf("%d e >= %d: %b\n", a, b, a >= b);
        System.out.printf("%d e <= %d: %b\n", a, b, a <= b);
    }
}
