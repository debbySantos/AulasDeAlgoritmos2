import java.util.Scanner;

public class exercicio1Matriz {

    public static void main(String[] args) {
        int[][] matriz = new int[3][3];
        Scanner input = new Scanner(System.in);
        int somaDiagonal = 0;
        System.out.println("Soma de Matrizes ");

        for (int linha = 0; linha < 3; linha++) {
            for (int coluna = 0; coluna < 3; coluna++) {
                System.out.printf("Insira os elementos da matriz: [%d][%d]", linha + 1, coluna + 1);
                matriz[linha][coluna] = input.nextInt();
                if(linha==0 && coluna == 0 || linha == 1 && coluna==1|| linha == 2 && coluna == 2){
                    somaDiagonal+=matriz[linha][coluna];
                }
            }

        }
        System.out.println("\nMatriz");
        for (int linha = 0; linha < 3; linha++) {
            for (int coluna = 0; coluna < 3; coluna++) {
                System.out.print(matriz[linha][coluna] + "\t");
            }
            System.out.println();


        }
        System.out.printf("A soma diagonal da matriz é:  %d", somaDiagonal);
    }
}
