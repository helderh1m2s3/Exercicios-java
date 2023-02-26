package vetores;

import java.util.Random;

public class ArrayMultidimensional {
public static void main(String[] args) {
    Random random = new Random();

    int[][] matrizM = new int[4][4];

    for (int i = 0; i < matrizM.length; i++) {
        for (int j = 0; j < matrizM[i].length; j++) {
            matrizM[i][j] = random.nextInt(9);
        }
    }

    for (int[] linha : matrizM) {
        for (int elementoDaColuna : linha ) {
            System.out.print(elementoDaColuna + " ");
        }
            System.out.println();
    }
}
}
