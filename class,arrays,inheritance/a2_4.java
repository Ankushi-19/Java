public class a2_4 {
    public static void main(String[] args) {
        // Define two 2x2 matrices
        int[][] matrix1 = {
            {1, 2},
            {3, 4}
        };

        int[][] matrix2 = {
            {5, 6},
            {7, 8}
        };

        int[][] resultMatrix = new int[2][2];
        
        for (int i = 0; i < 2; i++) {
            for (int j = 0; j < 2; j++) {
                resultMatrix[i][j] = matrix1[i][j] + matrix2[i][j];
            }
        }

        System.out.println("Result of the  Matrix is:");
        for (int i = 0; i < 2; i++) {
            for (int j = 0; j < 2; j++) {
                System.out.print(resultMatrix[i][j] + " ");
            }
            System.out.println();
        }
    }
}