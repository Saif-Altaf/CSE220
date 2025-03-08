// Task 04: Matrix Compression
class Task4 {

    public static Integer[][] compressMatrix(Integer[][] matrix) {
        Integer[][] newArray = new Integer[matrix.length / 2][matrix[0].length / 2];
        int i = 0;
        for (int row = 0; row < matrix.length; row += 2) {
            int j = 0;
            for (int column = 0; column < matrix[0].length; column += 2) {
                int sum = matrix[row][column] + matrix[row + 1][column] + matrix[row][column + 1] + matrix[row + 1][column + 1];
                if (i < newArray.length) {
                    newArray[i][j] = sum;
                }
                j++;
            }
            i++;
        }
        return newArray;
    }

    //DO NOT CHANGE ANY DRIVER CODE BELOW THIS LINE
    public static void main(String[] args) {
        Integer[][] matrix = {{1, 2, 3, 4}, {5, 6, 7, 8}, {1, 3, 5, 2}, {-2, 0, 6, -3}};
        System.out.println("Given Matrix: ");
        Arr.print2D(matrix);

        System.out.println("\nExpected Output:");
        System.out.print("| 14 | 22 |\n| 2  | 10 |\n");

        System.out.print("\nYour Output:\n");
        Integer[][] returnedArray = compressMatrix(matrix);
        Arr.print2D(returnedArray);
    }
}