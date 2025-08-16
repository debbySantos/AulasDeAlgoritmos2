import java.util.Scanner;
public class exercicioMatriz2 {
    public static void main(String[] args){
        Scanner input = new Scanner(System.in);
        int numerosImpares = 0;
        String imparesEncontrados = "";
        System.out.println("Números Ímpares ");

        int matriz [][] = new int[3][4];
        for(int linha = 0; linha<3; linha++){
            for(int coluna = 0; coluna<4; coluna++){
                System.out.printf("Insira os elementos da matriz: [%d][%d]", linha + 1, coluna + 1);
                matriz[linha][coluna] = input.nextInt();
                if(matriz[linha][coluna] % 2 != 0){
                    numerosImpares++;
                    imparesEncontrados += matriz[linha][coluna] + " ";
                    
                }

                
              


            }

        }  
        System.out.println("=========MATRIZ============");
        for(int linha =0; linha<3; linha++){
            for(int coluna = 0; coluna<4;coluna++){
                System.out.print(matriz[linha][coluna] + "\t");
            }
            System.out.println();
        }
        System.out.printf("Os número ímpares na matriz são :  %d", numerosImpares);
        System.out.printf("\nNúmeros ímpares digitados: %s, ",imparesEncontrados);
    }

    
}
