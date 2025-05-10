package Lab9_Graph;

public class UndirectedUnweightedMatrix {
    private int[][] matrix;

    public UndirectedUnweightedMatrix() {
        this.matrix = new int[9][9];
        for (int row = 0; row < matrix.length; row++) {
            for (int col = 0; col < matrix[0].length; col++) {
                matrix[row][col] = 0;
            }
        }

        matrix[1][2] = 1;
        matrix[1][3] = 1;
        matrix[1][4] = 1;
        matrix[1][6] = 1;
        matrix[2][1] = 1;
        matrix[2][3] = 1;
        matrix[2][4] = 1;
        matrix[2][5] = 1;
        matrix[2][6] = 1;
        matrix[2][8] = 1;
        matrix[3][1] = 1;
        matrix[3][2] = 1;
        matrix[3][5] = 1;
        matrix[3][7] = 1;
        matrix[4][1] = 1;
        matrix[4][2] = 1;
        matrix[4][5] = 1;
        matrix[4][6] = 1;
        matrix[4][7] = 1;
        matrix[4][8] = 1;
        matrix[5][2] = 1;
        matrix[5][3] = 1;
        matrix[5][4] = 1;
        matrix[5][7] = 1;
        matrix[6][1] = 1;
        matrix[6][2] = 1;
        matrix[6][4] = 1;
        matrix[6][8] = 1;
        matrix[7][3] = 1;
        matrix[7][4] = 1;
        matrix[7][5] = 1;
        matrix[8][2] = 1;
        matrix[8][4] = 1;
        matrix[8][6] = 1;
    }

    public int task_1() {
        int maxCount = 0;
        for (int r = 0; r < matrix.length; r++) {
            int count = 0;
            for (int c = 0; c < matrix[0].length; c++) {
                if (matrix[r][c] != 0) {
                    count++;
                }
            }
            maxCount = Math.max(count, maxCount);
        }
        return maxCount;
    }
}
