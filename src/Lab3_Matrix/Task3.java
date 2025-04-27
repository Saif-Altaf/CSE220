package Lab3_Matrix;

// Task 03: Row Rotation Policy of BRACU Classroom
class Task3 {

    public static Integer rowRotation(Integer examWeek, String[][] matrix) {
        for (int i = 0; i < 2; i++) {
            String[] temp = matrix[matrix.length - 1];
            for (int row = matrix.length - 1; row >= 0; row--) {
                if (row == 0) {
                    matrix[0] = temp;
                } else {
                    matrix[row] = matrix[row - 1];
                }
            }
        }

        for (int r = 0; r < matrix.length; r++) {
            for (int c = 0; c < matrix[0].length; c++) {
                if (c == matrix[0].length - 1) {
                    System.out.print("| " + matrix[r][c] + "  |");
                } else {
                    System.out.print("| " + matrix[r][c] + "  ");
                }
            }
            System.out.println();
        }

        for (int r = 0; r < matrix.length; r++) {
            for (int c = 0; c < matrix[0].length; c++) {
                if (matrix[r][c].equals("AA")) {
                    return r + 1;
                }
            }
        }
        return 0;
    }

    //DO NOT CHANGE ANY DRIVER CODE BELOW THIS LINE
    public static void main(String[] args) {
        String[][] seatStatus = {
                {"A", "B", "C", "D", "E"},
                {"F", "G", "H", "I", "J"},
                {"K", "L", "M", "N", "O"},
                {"P", "Q", "R", "S", "T"},
                {"U", "V", "W", "X", "Y"},
                {"Z", "AA", "BB", "CC", "DD"}
        };
        System.out.println("Given Seat Status: ");
        Arr.print2D(seatStatus);

        System.out.println("\nExpected Output:");
        System.out.println("| U  | V  | W  | X  | Y  | ");
        System.out.println("| Z  | AA | BB | CC | DD | ");
        System.out.println("| A  | B  | C  | D  | E  | ");
        System.out.println("| F  | G  | H  | I  | J  | ");
        System.out.println("| K  | L  | M  | N  | O  | ");
        System.out.println("| P  | Q  | R  | S  | T  | ");
        System.out.println("Your friend AA will be on row 2");

        System.out.print("\nYour Output:\n");
        Integer examWeek = 3;
        //This following should print modified seat status after rotation and return the current exam week
        Integer rowNumber = rowRotation(examWeek, seatStatus);
        //The following should print Your friend AA will be on row 2
        System.out.println("Your friend AA will be on row " + rowNumber);
    }
}