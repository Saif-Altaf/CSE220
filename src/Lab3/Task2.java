//Task 02: Decryption Process
class Task2 {

    //Complete this method so that it gives the Expected Output
    public static Integer[] decryptMatrix(Integer[][] matrix) {
        Integer[] array = new Integer[matrix[0].length - 1];
        int i = array.length - 1;

        for (int column = matrix[0].length - 1; column > 0; column--) {
            int sum1 = 0, sum2 = 0;
            for (int row = 0; row < matrix.length; row++) {
                sum1 += matrix[row][column];
                sum2 += matrix[row][column - 1];
            }
            array[i] = sum1 - sum2;
            i--;
        }
        return array;


        //For this task you'll need to create new arrays
        //we recommend you to use Integer type.
        //example:  Integer[] array = new Integer[5]

        //TO DO
        //DELETE the following return statement when you're ready to return the 2D array


    }

    //DO NOT CHANGE ANY DRIVER CODE BELOW THIS LINE
    public static void main(String[] args) {
        Integer[][] matrix = {
                {1, 3, 1},
                {6, 4, 2},
                {5, 1, 7},
                {9, 3, 3},
                {8, 5, 4}
        };
        System.out.println("Given Matrix: ");
        Arr.print2D(matrix);
        System.out.println("\nExpected Output:\n[ -13 1 ]");
        Integer[] returned_val_1 = decryptMatrix(matrix);
        System.out.print("\nYour Output:\n");
        Arr.print(returned_val_1);

    }
}