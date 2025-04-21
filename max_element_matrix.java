public class max_element_matrix {
    public static void main(String[] args) {
        int[][] matrix = { {10 ,20,30},{50,60,80}};
        int maxElement = matrix[0][0];
        for (int i = 0; i < matrix.length; i++) {
            for (int j = 0; j < matrix[i].length; j++) {
                if (matrix[i][j] > maxElement) {
                    maxElement = matrix[i][j];
                    }
                }
            }
                     System.out.println("Maximum Element: " + maxElement);
        
    }
    
}
