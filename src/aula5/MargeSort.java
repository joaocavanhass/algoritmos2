package src;

import java.util.*;

public class MargeSort {
    // método principal que inicia o processo de ordenação
    public static void mergeSort(int[] array) {
        // se o array tiver 1 ou 0 elemento ele ja esta ordenado
        if(array.length < 2){
            return;
        } 
        // encontrar o ponto médio do array
        int mid = array.length / 2
        // cria um sub-array para a metade da esquerda
        int[] left = new int[mid];
        // cria um sub-array para a metade da direita
        int[] right = new int[array.length - mid];

        // copia os elementos para o sub-array
        // array.copyOfRange é uma maneira eficiente de fazer isso
        System.arraycopy(array, 0, left, 0, mid);
        System.arraycopy(array, mid, right, 0, array.length - mid);

        // chamada recursiva para ordenar a metade da esquerda
        mergeSort(left);
        // chamada recursiva para ordenar a metade da direita
        mergeSort(right);

        // combina as duas ordenadas em um só array
        merge(array, left, right);
    }

    // método que eu vou mesclar (combinar) dois sub-arrays ordenados
    private static void merge (int[] array, int[] left, int[] right) {
        int i = 0; // ponteiro para o array left
        int j = 0; // ponteiro para o array right
        int k = 0; // ponteiro para o array original 

        // percorre os dois sub-arrays e insere o menor elemento no array principal
        while(i < left.length && j < right.length) {
            if(left[i] <= right[i]) {
                array[k++] = left[i++];
            } else {
                array[k++] = right[j++];
            }
        }

    }
        // copia os elementos restantes do array left (se houver)
        while(i < left.length) {
            array[k++] = left[i++];
        }
        // copia os elementos restantes do array right (se houver)
        while(i < right.length) {
            array[k++] = right[j++];
        }
    }
        public static void main(String[] args) {
            int[] dados = {38, 27, 43, 9, 2, 82, 10};
            
            System.out.println("\nArray original: " + Arrays.toString(dados));
            mergeSort(dados);
            System.out.println("\nArray ordenado: " + Arrays.toString(dados));
        }
        