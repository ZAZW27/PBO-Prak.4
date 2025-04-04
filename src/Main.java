import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int[][] A = new int[2][2], B = new int[2][2], C = new int[2][2];

        System.out.println("Operasi yang dipilih:\nPekralian[1]\nPengurangan[2]\n===========Pilihan");
        String operaotor = input.nextLine();

        switch(operaotor){
            case "1":
                Perkalian(input, A, B, C);
                break;
            case "2":
                Pengurangan(input, A, B, C);
                break;
            default:
                System.out.println("Pilihan tidak sesuai coba lagi!");
        }

    }

    public static void inputMatrix(Scanner input, int[][] matrix){
        for (int i=0; i<2; i++){
            for (int j=0; j<2; j++){
                System.out.print("[" + (i+1) + "] [" + (j+1) + "]: ");
                matrix[i][j] = input.nextInt();
            }
        }
    }

    public static void printMatrix(int[][] matrix){
        for (int i=0; i<2; i++){
            for (int j=0; j<2; j++){
                System.out.print(+ (matrix[i][j]) + " ");
            }
            System.out.println(" ");
        }
    }

    public static void Perkalian(Scanner input, int[][] A, int[][] B, int[][] C ){
        System.out.println("Masukkan Nilai Matriks X");
        System.out.println("=============================");
        inputMatrix(input, A);

        System.out.println("Masukkan Nilai Matriks Y");
        System.out.println("=============================");
        inputMatrix(input, B);

        for (int i=0; i<2; i++){
            for (int j=0; j<2; j++){
                C[i][j] = A[i][j] * B[i][j];
            }
        }

        System.out.println("Hasil Perkalian Matriks");
        System.out.println("=============================");
        printMatrix(C);
    }

    public static void Pengurangan(Scanner input, int[][] A, int[][] B, int[][] C ){
        System.out.println("Masukkan Nilai Matriks X");
        System.out.println("=============================");
        inputMatrix(input, A);

        System.out.println("Masukkan Nilai Matriks Y");
        System.out.println("=============================");
        inputMatrix(input, B);

        for (int i=0; i<2; i++){
            for (int j=0; j<2; j++){
                C[i][j] = A[i][j] - B[i][j];
            }
        }

        System.out.println("Hasil Pengurangan Matriks");
        System.out.println("=============================");
        printMatrix(C);
    }
}