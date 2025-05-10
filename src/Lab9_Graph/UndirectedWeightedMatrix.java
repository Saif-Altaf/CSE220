package Lab9_Graph;

public class UndirectedWeightedMatrix {
    private int[][] matrix;

    public UndirectedWeightedMatrix() {
        this.matrix = new int[9][9];
        for (int row = 0; row < matrix.length; row++) {
            for (int col = 0; col < matrix[0].length; col++) {
                matrix[row][col] = 0;
            }
        }

        matrix[1][2] = 4;
        matrix[1][3] = 3;
        matrix[1][4] = 2;
        matrix[1][6] = 5;

        matrix[2][1] = 4;
        matrix[2][3] = 5;
        matrix[2][4] = 10;
        matrix[2][5] = 3;
        matrix[2][6] = 9;
        matrix[2][8] = 3;

        matrix[3][1] = 3;
        matrix[3][2] = 5;
        matrix[3][5] = 2;
        matrix[3][7] = 4;

        matrix[4][1] = 2;
        matrix[4][2] = 10;
        matrix[4][5] = 6;
        matrix[4][6] = 2;
        matrix[4][7] = 8;
        matrix[4][8] = 5;

        matrix[5][2] = 3;
        matrix[5][3] = 2;
        matrix[5][4] = 6;
        matrix[5][7] = 7;

        matrix[6][1] = 5;
        matrix[6][2] = 9;
        matrix[6][4] = 2;
        matrix[6][8] = 4;

        matrix[7][3] = 4;
        matrix[7][4] = 8;
        matrix[7][5] = 7;

        matrix[8][2] = 3;
        matrix[8][4] = 5;
        matrix[8][6] = 4;
    }

    public int task_2() {
        int maxWeight = 0;
        int heavyVertex = 0;
        for (int r = 0; r < matrix.length; r++) {
            int sum = 0;
            for (int c = 0; c < matrix[0].length; c++) {
                if (matrix[r][c] != 0) {
                    sum += matrix[r][c];
                }
            }
            if (r == 0) {
                maxWeight = sum;
            }
            if (maxWeight < sum) {
                maxWeight = sum;
                heavyVertex = r;
            } else {
                maxWeight = Math.max(maxWeight, sum);
            }
        }
        return heavyVertex;
    }
}
