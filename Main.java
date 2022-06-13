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
        // Showing the original vector
        System.out.println("----- Vetor não ordenado -----");
        System.out.println("----- Non-ordered vector -----");
        mostrarVetor(vetor);

        // Mostrando o vetor ordenado pela classe Selectionsort
        // Showing the vector sorted by the Selectionsort algorithm
        Selectionsort alg1 = new Selectionsort();
        result = alg1.ordenar(vetor);
        Systen.out.println("\n\n----- Vector sorted by Selectionsort -----");
        System.out.println("\n\n----- Vetor ordenado pelo Selectionsort -----");
        mostrarVetor(result);

        // Mostrando o vetor ordenado pela class Bubblesort
        // Showing the vector sorted by the Bubblesort class
        Bubblesort alg2 = new Bubblesort();
        result = alg2.ordenar(vetor);
        System.out.println("\n\n----- Vector sorted by Bubblesort -----");
        System.out.println("\n\n----- Vetor ordenado pelo Bubblesort ------");
        mostrarVetor(result);
    }
}
