package aula2;

public class BuscaLinear {

    public static int buscar(int[] array, int valorProcurado) {
        for(int i = 0; i < array.length; i++) {
            if(array[i] == valorProcurado) {
                System.out.println("\nBusca Linear: Valor: " + valorProcurado + " encontrado no índice " + i);
                return i;
            }
        }
        System.out.println("\nBuscaLinear: Valor: " + valorProcurado + " não encontrado");
        return -1;
    }
    public static void main(String[] args) {
        int[] idsCliente = {105, 201, 350, 422, 599, 608};
        int idProcurado = 422;
        int idInexistente = 999;

        buscar(idsCliente, idProcurado);
        buscar(idsCliente, idInexistente);
    } 
}