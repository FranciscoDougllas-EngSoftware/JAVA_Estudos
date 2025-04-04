public class OperadoresLogicos {
    //Em Java temos 3 Operadores logicos que são
    // && (E) - || (OU) - ! (NAO)
    public static void main(String[] args){
        // && (E)
        boolean condicao1 = true;
        boolean condicao2 = false;
        boolean resultado = condicao1 && condicao2; // false
        System.out.println("Resultado do operador E: " + resultado);

        // || (OU)
        resultado = condicao1 || condicao2; // true
        System.out.println("Resultado do operador OU: " + resultado);

        // ! (NAO)
        resultado = !condicao1; // false
        System.out.println("Resultado do operador NAO: " + resultado);
    }
}
