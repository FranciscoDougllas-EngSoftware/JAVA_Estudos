public class casting {
    public static void main(String[] args){
        // Casting em Java
        // Casting é o processo de converter um tipo de dado em outro.
        // Existem dois tipos de casting: widening (amplo) e narrowing (estreito).

        // Widening casting (automático)
        // Ocorre quando não há perda de dados.
        int i = 100;
        long l = i; // int para long
        float f = l; // long para float
        double d = f; // float para double

        System.out.println("Widening casting:");
        System.out.println("int: " + i);
        System.out.println("long: " + l);
        System.out.println("float: " + f);
        System.out.println("double: " + d);

        // Narrowing casting (manual)
        // Ocorre quando há perda de dados.
        double d2 = 9.78;
        float f2 = (float) d2; // double para float
        long l2 = (long) f2; // float para long
        int i2 = (int) l2; // long para int

        System.out.println("\nNarrowing casting:");
        System.out.println("double: " + d2);
        System.out.println("float: " + f2);
        System.out.println("long: " + l2);
        System.out.println("int: " + i2);
    }
}
