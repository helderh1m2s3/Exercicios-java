package loops;

import java.util.Scanner;

public class NotaValida {
    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);

        double nota;

            System.out.println("Digite uma nota entre 0 e 10");
            nota = scan.nextDouble();

        while(nota < 0 || nota > 10){
            System.out.println("A Nota informada é inválida");
            System.out.println("Digite uma nota entre 0 e 10");
            nota = scan.nextDouble();
        }

    }
}
