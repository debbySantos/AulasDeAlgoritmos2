package debs;
import java.util.*;

public class aula02Exec02 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        int[][] matriz = new int[3][4];
        int qtdImpar = 0;
        int[] impares = new int[12];

        for (int l = 0; l < 3; l++) {
            for (int c = 0; c < 4; c++) {
                System.out.printf("Digite o número da linha %d e da coluna %d \n", l, c);
                matriz[l][c] = input.nextInt();
                if (matriz[l][c] % 2 != 0) {
                    impares[qtdImpar] = matriz[l][c];
                    qtdImpar++;
                }

            }
        }

        System.out.printf("Existem %d números impares na matriz e eles são: \n", qtdImpar);
        for(int i = 0; i < qtdImpar; i++){
            System.out.println(impares[i]);
        }

    }

}
