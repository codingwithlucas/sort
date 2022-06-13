public class Main {
    public static void mostrarVetor(int[] vetor) {
        for (int i = 0; i < vetor.length; i++) {
            System.out.print(vetor[i] + ", ");
        }
    }

    public static void main(String[] args) {
        int[] vetor = {3, 6, 8, 1, 4, 9, 0};
        int[] result = {};

        // Monstrando o vetor original
        System.out.println("----- Vetor não ordenado -----");
        mostrarVetor(vetor);

        // Mostrando o vetor ordenado pela classe Selectionsort
        Selectionsort alg1 = new Selectionsort();
        result = alg1.ordenar(vetor);
        System.out.println("\n\n----- Vetor ordenado pelo Selectionsort -----");
        mostrarVetor(result);

        // Mostrando o vetor ordenado pela class Bubblesort
        Bubblesort alg2 = new Bubblesort();
        result = alg2.ordenar(vetor);
        System.out.println("\n\n----- Vetor ordenado pelo Bubblesort ------");
        mostrarVetor(result);
    }
}
