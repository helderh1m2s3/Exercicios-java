package loops;

import java.util.Scanner;

public class Tabuada {
    
    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);

        int numero;
        int multiplicador = 0;

        System.out.println("Por favor digite o numero, entre 1 e 10, da tabuada desejada!");
        numero = scan.nextInt();

        for (int i = 0; i < 11; i++){
        System.out.println(i + " x " + numero + " = " + i * numero);
        }


}
}