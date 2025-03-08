// Task 05: Game Arena
class Task5 {

    public static void playGame(Integer[][] arena) {
        int points = 0;
        for (int row = 0; row < arena.length; row++) {
            for (int column = 0; column < arena[0].length; column++) {
                if (arena[row][column] != 0 && arena[row][column] % 50 == 0) {
                    int up = row - 1;
                    int down = row + 1;
                    int left = column - 1;
                    int right = column + 1;
                    if (up >= 0) {
                        if (arena[up][column] == 2) {
                            points += 2;
                        }
                    }
                    if (down < arena.length) {
                        if (arena[down][column] == 2) {
                            points += 2;
                        }
                    }
                    if (left >= 0) {
                        if (arena[row][left] == 2) {
                            points += 2;
                        }
                    }
                    if (right < arena[0].length) {
                        if (arena[row][right] == 2) {
                            points += 2;
                        }
                    }
                }
            }
        }
        if (points >= 10) {
            System.out.println("Points Gained: " + points + ". Your team has survived the game.");
        } else {
            System.out.println("Points Gained: " + points + ". Your team is out.");
        }
    }

    //DO NOT CHANGE ANY DRIVER CODE BELOW THIS LINE
    public static void main(String[] args) {
        Integer[][] arena = {
                {0, 2, 2, 0},
                {50, 1, 2, 0},
                {2, 2, 2, 0},
                {1, 100, 2, 0}
        };
        System.out.println("Given Arena: ");
        Arr.print2D(arena);

        System.out.println("\nExpected Output:");
        System.out.print("Points Gained: 6. Your team is out.\n");

        System.out.print("\nYour Output:\n");
        playGame(arena);

        System.out.print("\n======================\n");

        Integer[][] arena1 = {
                {0, 2, 2, 0, 2},
                {1, 50, 2, 1, 100},
                {2, 2, 2, 0, 2},
                {0, 200, 2, 0, 0}
        };
        System.out.println("\nGiven Arena: ");
        Arr.print2D(arena1);

        System.out.println("\nExpected Output:");
        System.out.print("Points Gained: 14. Your team has survived the game.\n");

        System.out.print("\nYour Output:\n");
        playGame(arena1);
    }
}