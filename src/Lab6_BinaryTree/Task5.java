package Lab6_BinaryTree;

// Complete the subtractSummation method
public class Task5 {

    //===================================TASK#5===================================
    // This method takes only 1 parameter which is root of the given tree
    // This method returns an Integer
    // At times you may need to typeCast root.elem to Integer
    // You can use extra helper private static methods with extra extra params as per need
    public static Integer subtractSummation(BTNode root) {
        return sumOfLeft(root.left) - sumOfRight(root.right);
    }

    public static Integer sumOfLeft(BTNode root) {
        if (root == null) {
            return 0;
        }
        return (Integer) root.elem + sumOfLeft(root.left) + sumOfLeft(root.right);
    }

    public static Integer sumOfRight(BTNode root) {
        if (root == null) {
            return 0;
        }
        return (Integer) root.elem + sumOfRight(root.left) + sumOfRight(root.right);
    }
    //============================================================================

}