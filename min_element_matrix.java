public class min_element_matrix {
    public static void main(String[] args) {
        int[][] matrix = {{10, 2, 3}, {4, 45, 6}, {7, 8, 99}};
        int minElement = matrix[0][0];
        for (int i = 0; i < matrix.length; i++) {
            for (int j = 0; j < matrix[i].length; j++) {
                if (matrix[i][j] < minElement) {
                    minElement = matrix[i][j];
                    }
                }
            }
            System.out.println("Minimum element in the matrix is: " + minElement);

        
    }
    
}
