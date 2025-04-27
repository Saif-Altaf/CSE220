//Task 02: Container with Most Water
package Lab1_LinkedList;

class Task2 {

    //Complete this method so that it gives the Expected Output
    public static void mostWater(Integer[] height) {
        int maxArea = 0;
        int left = 0;
        int right = height.length - 1;
        while (left != right) {
            int area = 0;
            if (height[left] < height[right]) {
                area = (height[left]) * (right - left);
                left++;
            } else {
                area = (height[right]) * (right - left);
                right--;
            }
            if (area > maxArea) {
                maxArea = area;
            }
        }
        System.out.println(maxArea);
    }

    //DO NOT CHANGE ANY DRIVER CODE BELOW THIS LINE
    public static void main(String[] args) {
        Integer[] array = {1, 8, 6, 2, 5, 4, 8, 3, 7};
        System.out.println("Given Array: ");
        Arr.print(array);
        System.out.println("\nExpected Output:");
        System.out.print("49");
        System.out.print("\nYour Output:\n");
        mostWater(array);

    }
}
