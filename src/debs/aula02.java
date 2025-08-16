package debs;
import java.util.Scanner;

public class aula02 {
    public static void main(String[] args) throws Exception {
        Scanner input = new Scanner(System.in);

        int[][] matriz = new int[3][3];
        int soma = 0;
        System.out.println("Digite os valores da matriz");

        for (int l = 0; l < 3; l++) {
            for (int c = 0; c < 3; c++) {
                System.out.printf("Insira o valor da linha %d e da coluna %d: ", l + 1, c + 1);
                matriz[l][c] = input.nextInt();
                if (l == 0 && c == 0 || l == 1 && c == 1 || l == 2 && c == 2) {
                    soma += matriz[l][c];
                }

            }
        }

        System.out.println("A matriz ficou: ");
        for (int l = 0; l < 3; l++) {
            for (int c = 0; c < 3; c++) {
                System.out.printf("\t %d \t", matriz[l][c]);

            }
            System.err.println();
        }

        System.out.println("A soma da diagonal ficou: " + soma);
    }
}
