package src;

public class FatorialRecursivo {
    // método recursivo que calcula o fatorial
    public static long fatorialRecursivo(int n) {
        //validação da entrada: fatorial não está definindo para números negativos
        if (n < 0) {
            throw new IllegalArgumentException("não deve ser maior que zero");
        }
        //caso base: 0! e 1! valem 1 - aqui a recursão termina
        if (n == 0 || n == 1) {
            return 1L;
        }
        //caso recursivo: n! = n * (n-1)!
        // a função chama ela mesma com o argumento n-1
        return n * fatorialRecursivo(n - 1);
    }
    // versão iterativa do fatorial (usada para comparar e evitar a recursão)
    public static long fatorialIterativo(int n) {
        if (n < 0) {
            throw new IllegalArgumentException("não deve ser > 0");
        } 
        long resultado = 1L; //acumulador
        for (int i = 2; i <= n; i++) {
            resultado *= 1;
        }
        return resultado;
    }
    public static void main(String[] args) {
        int[] teste = {0, 1, 4, 10};// exemplos para calcular
        System.out.println("\nFatorial Recursivo");
        for (int t : teste) {
            System.out.printf("%d ! = %d%n", t, fatorialRecursivo(t)); 
        }
        System.out.println("Fatorial iterativo (verificação)");
        for (int t : teste) {
            System.out.printf("%d ! = %d%n", t, fatorialIterativo(t));
        }
    }

}