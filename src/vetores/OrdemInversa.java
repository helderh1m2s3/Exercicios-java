package vetores;

public class OrdemInversa {
    public static void main(String[] args) {
        
        int[] vetor = { 5, 3, 8, 9, 1, 12 };

        System.out.print("Vetor Normal: ");
        int count = 0;
        while (count < (vetor.length)) {
            System.out.print(vetor[count] + ", ");
            count++;
        }
        
        System.out.print("\n" + "Vetor Invertido: ");
        for(int i = (vetor.length - 1); i >= 0;i--){
            System.out.print(vetor[i] + ", ");
        }
    }
}
