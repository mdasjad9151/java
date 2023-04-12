

// Java Program to Find the Transpose.
public class Array06 {
    public static void Transpose(int matrix[][], int size) {
        int tempmatrix[][]=  new int[100][100];
        for (int i = 0; i < size; i++) {
            for (int j = 0; j < size; j++) {

                tempmatrix[i][j] = matrix[j][i];
            }
        }
        for (int i = 0; i < size; i++) {
            for (int j = 0; j < size; j++) {

                System.out.print(tempmatrix[i][j] + "' ");
            }
            System.out.println();
        }

    }

    public static void main(String[] args) {
        int[][] b = { { 8, 2, 13, 4 },
                      { 9, 16, 17, 8 },
                      { 1, 22, 3, 14 },
                      { 15, 6, 17, 8 } };
        Transpose(b, 4);

    }
}
