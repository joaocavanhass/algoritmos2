package src;

import java.util.Arrays;

public class BuscaBinaria {
    public static int buscar(int[] array, int valorProcurado) {
        Arrays.sort(array);
        System.out.println("\nArray ordenado: " + Arrays.toString(array));
        int inicio = 0;
        int fim = array.length -1;

        while(inicio <= fim) {
            int meio = inicio + (fim - inicio) / 2;
            if(array[meio] == valorProcurado) {
                System.out.println("\nBuscaBinaria: valor: " + valorProcurado + " encontrado no meio "  + meio);
                return meio;
            }
            if(array[meio] > valorProcurado) {
                fim = meio -1;
            } else {
                inicio = meio + 1;
            }
        }
        System.out.println("\nBuscaBinaria. Valor: " + valorProcurado + " não foi encontrado");
    }

    public static void main(String[] args) {
        int[] idsCliente = {105, 608, 350, 201, 599, 422};
        int idProcurado = 350;
        int idInexistente = 999;

        buscar(idsCliente, idProcurado);
        buscar(idsCliente, idInexistente);
    }
}
