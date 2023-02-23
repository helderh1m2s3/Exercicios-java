package loops;

import java.util.Scanner;

public class ContandoParEImpar {
    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);

        int quantidadeDeNumeros;
        int numero;
        int quantidadePar = 0;
        int quantidadeImpar = 0;


        System.out.println("Por favor informe a quantidade de numeros!");
        quantidadeDeNumeros = scan.nextInt();

        int count = 0;

    do
    {
        System.out.println("Por favor digite um numero!");
        numero = scan.nextInt();
        if (numero % 2 == 0) quantidadePar++;
        else quantidadeImpar++;
        
        count++;
    } while (count < quantidadeDeNumeros);

    System.out.println("A quantidade de numeros pares informado foi: " + quantidadePar);
    System.out.println("A quantidade de numeros impares informado foi: " + quantidadeImpar);

    }
}
