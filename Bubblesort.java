public class Bubblesort {
    public Bubblesort() {}
    public int[] ordenar(int[] vetor) {
        boolean trocou = false;
        for (int i = 0; i < (vetor.length - 1); i++) {
            if (vetor[i + 1] < vetor[i]) {
                int temp;
                temp = vetor[i];
                vetor[i] = vetor[i + 1];
                vetor[i + 1] = temp;
                trocou = true;
            }
        }

        // Mostrando a ordenação do vetor (etapa por etapa)
        // Apenas para debug.
        // It shows the sorted vector at the end of every loop.
        // Debug only
        // System.out.println("");
        // for (int l = 0; l < vetor.length; l++) {
        //    System.out.print(vetor[l] + ", ");
        // }

        if (trocou) {
            // Se pelo menos uma troca aconteceu, o vetor não está ordenado.
            // Por isso trocou é igual a true e a função irá chamar a si própria novamente.
            // If a number changed places at least once, the vector is not sorted.
            // That's why the variable trocou is true and the method will called itself again.
            return ordenar(vetor);
        } else {
            // Se nenhuma troca ocorreu, o vetor está totalmente ordenado.
            // Logo trocou é igual a false.
            // If any number changed places, the vector is ordered.
            // So trocou is false now.
            return vetor;
        }
    }
}
