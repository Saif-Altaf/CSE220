package Lab9_Graph;

public class DirectedWeightedMatrix {
    public int[][] matrix;

    public DirectedWeightedMatrix() {
        this.matrix = new int[9][9];
        for (int row = 0; row < matrix.length; row++) {
            for (int col = 0; col < matrix[0].length; col++) {
                matrix[row][col] = 0;
            }
        }

        matrix[1][2] = 4;
        matrix[1][3] = 3;
        matrix[1][6] = 5;
        matrix[2][3] = 5;
        matrix[2][5] = 3;
        matrix[2][8] = 3;
        matrix[3][7] = 4;
        matrix[4][1] = 2;
        matrix[4][2] = 10;
        matrix[4][5] = 6;
        matrix[4][7] = 8;
        matrix[4][8] = 5;
        matrix[5][3] = 2;
        matrix[6][2] = 9;
        matrix[6][4] = 2;
        matrix[7][5] = 7;
        matrix[8][6] = 4;
    }

    //Task #3 for Task #1
    public int Task_3A() {
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

    //Task #3 for Task #2
    public int Task_3B() {
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

    //Task #4
    public void task_4(int[][] matrix) {
        for (int r = 1; r < matrix.length; r++) {
            for (int c = 1; c < r; c++) {
                if (matrix[r][c] < matrix[c][r]) {
                    matrix[r][c] = matrix[c][r];
                } else if (matrix[r][c] > matrix[c][r]) {
                    matrix[c][r] = matrix[r][c];
                }
            }
        }
    }

    //for checking
    public void print() {
        for (int row = 1; row < matrix.length; row++) {
            for (int col = 1; col < matrix[0].length; col++) {
                System.out.print(matrix[row][col] + " ");
            }
            System.out.println();
        }
    }
}
