package vetores;

import java.util.Random;
import java.util.Scanner;

public class NumerosSucessoresEAntecessores {
    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);
        Random aleatorios = new Random();

        int numerosAleatorios[] = new int[20];

        //Solicita ao usuario a maneira que deseja gerar os numeros do codigo.
        System.out.println("Por favor digite a opção que deseja executar esse codigo! \n\nDigite 1 se desejar digitar os numeros!" 
            + "\nDigite 2 se desejar que os numeros sejam gerados aleatoriamente!");
        int escolhaMenu = scan.nextInt();

        //Verifica se o numero digitado é valido e repete a solicitação ate que seja informao valido.
        while (escolhaMenu != 1 && escolhaMenu != 2) {
            System.out.println("Opção invalida!\nPor favor digite uma opção válida!");
            escolhaMenu = scan.nextInt();
        }
        
        // Verifica se a opção escolhida foi a opção 1 - digitar os numeros manualmente.
        if (escolhaMenu == 1) {
            int count = 0;
            do {
                //Solicita ao usuario os 20 numeros verificando se os numeros digitados estão dentro do intervalo valido 1 - 100.
                System.out.println("Por favor digite um numero inteiro entre 1 e 100!");
                numerosAleatorios[count] = scan.nextInt();
                while (numerosAleatorios[count] < 1 | numerosAleatorios[count] > 100) {
                    System.out.println("Numero invalido!\nPor favor digite um numero inteiro entre 1 e 100!");
                    numerosAleatorios[count] = scan.nextInt();
                }
                count++;
            } while (count < numerosAleatorios.length);
            //Retorna ao usuario o numero digitado por ordem de digitação seguido de seu antecessor e seu sucessor.
            for (int i = 0; i < numerosAleatorios.length; i++) {
                System.out.println("Esse é o " + (i + 1) + "º numero: " + numerosAleatorios[i]
                    + " e esse é seu antecessor: " + (numerosAleatorios[i] - 1)
                    + ", esse é seu sucessor: " + (numerosAleatorios[i] + 1));
            }
        }
        // Verifica se a opção escolhida foi a opção 2 - gerar os numeros automaticamente.
        if (escolhaMenu == 2) {
            //Gera os numeros automaticamente usando random.
            for (int i = 0; i < numerosAleatorios.length; i++) {
                int numero = aleatorios.nextInt(100);
                numerosAleatorios[i] = numero;
            }
            //Retorna ao usuario a confirmação dos numeros gerados e os numeros na ordem que foram gerados.
            System.out.print("Numeros gerados com Sucesso! \nEsses são seus numeros: ");
            for (int i = 0; i < numerosAleatorios.length; i++) {
                System.out.print(numerosAleatorios[i] + " ");
            }
            System.out.println("\n");
            //Retorna ao usuario o numero digitado por ordem de digitação seguido de seu antecessor e seu sucessor.
            for (int i = 0; i < numerosAleatorios.length; i++) {
                System.out.println("Esse é o " + (i + 1) + "º numero: " + numerosAleatorios[i]
                    + " e esse é seu antecessor: " + (numerosAleatorios[i] - 1)
                    + ", esse é seu sucessor: " + (numerosAleatorios[i] + 1));
            }
        }
    }
}
