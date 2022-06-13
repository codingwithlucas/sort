public class Selectionsort {
    public Selectionsort() {}

    public int[] ordenar(int[] vetor) {
        int menor = 0;
        int indexMenor = 0;
        for (int i = 0; i < (vetor.length - 1); i++) {
            for (int j = i + 1; j < vetor.length; j++) {
                if (j == i + 1) {
                    menor = vetor[j];
                    indexMenor = j;
                } else {
                    if (vetor[j] < menor) {
                        menor = vetor[j];
                        indexMenor = j;
                    }
                }
            }
            if (menor < vetor[i]) {
                int temp;
                temp = vetor[i];
                vetor[i] = menor;
                vetor[indexMenor] = temp;
            }

            // Mostrando o vetor parcialmente ordenado depois de cada repetição.
            // Apenas para debug
            // System.out.println("\n\n----- " + (i + 1) + ". ordenação -----");
            // for (int l = 0; l < vetor.length; l++) {
            //     System.out.print(vetor[l] + ", ");
            // }
        }
        return vetor;
    }
}