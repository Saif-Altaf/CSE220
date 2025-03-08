//Task 01: Zigzag Walk
class Task1 {

    public static void walkZigzag(Integer[][] matrix) {

        for (int column = 0; column < matrix[0].length; column++) {
            if (column == 0 || column % 2 == 0) {
                for (int row = 0; row < matrix.length; row++) {
                    if (row == 0 || row % 2 == 0) {
                        System.out.print(matrix[row][column] + " ");
                    }
                }
            } else {
                for (int row = matrix.length - 1; row >= 0; row--) {
                    if (row % 2 != 0) {
                        System.out.print(matrix[row][column] + " ");
                    }
                }
            }
            System.out.println();
        }
    }

    //DO NOT CHANGE ANY DRIVER CODE BELOW THIS LINE
    public static void main(String[] args) {
        Integer[][] floor1 = {
                {3, 8, 4, 6, 1},
                {7, 2, 1, 9, 3},
                {9, 0, 7, 5, 8},
                {2, 1, 3, 4, 0},
                {1, 4, 2, 8, 6}
        };
        System.out.println("Given Matrix: ");
        Arr.print2D(floor1);
        System.out.println("\nExpected Output:");
        System.out.print("3 9 1\n1 2\n4 7 2\n4 9\n1 8 6\n");
        System.out.print("\nYour Output:\n");
        walkZigzag(floor1);

        System.out.print("\n======================\n");

        Integer[][] floor2 = {
                {3, 8, 4, 6, 1},
                {7, 2, 1, 9, 3},
                {9, 0, 7, 5, 8},
                {2, 1, 3, 4, 0},
        };
        System.out.println("\nGiven Matrix: ");
        Arr.print2D(floor2);
        System.out.println("\nExpected Output:");
        System.out.print("3 9\n1 2\n4 7\n4 9\n1 8\n");
        System.out.print("\nYour Output:\n");
        walkZigzag(floor2);

    }
}