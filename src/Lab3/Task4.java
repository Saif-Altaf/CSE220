// Task 04: Matrix Compression
class Task4 {

    //Complete this method so that it gives the Expected Output
    public static Integer[][] compressMatrix(Integer[][] matrix) {
        Integer[][] newArray = new Integer[2][2];
        for (int row = 0; row < newArray.length; row++) {
            int sum = 0;

            for (int i = 0; i < matrix.length; i++) {
                int r = matrix.length / 2, c = matrix[0].length / 2;
                for (int j = 0; j < matrix[0].length; j++) {
                    while (r > 0 || c > 0) {
                        sum += matrix[i][j];
                    }
                }

            }


        }
        //For this task you'll need to create new 2D array

        //TO DO

        //remove the line below and return the newly created Compressed 2D matrix
        return null;
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