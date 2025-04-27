package Lab6_BinaryTree;

// Complete the levelSum method
public class Task6 {

    //===================================TASK#6===================================
    // This method takes only 1 parameter which is root of the given tree
    // This method returns an Integer
    // At times you may need to typeCast root.elem to Integer
    // You can use extra helper private static methods with extra extra params as per need
    public static Integer levelSum(BTNode root) {
        return levelSum(root, 0);
    }

    public static Integer levelSum(BTNode root, int lvl) {
        if (root == null) {
            return 0;
        }
        if ((Integer) root.elem % 2 == 0) {
            return -(Integer) root.elem + levelSum(root.left, lvl + 1) + levelSum(root.right, lvl + 1);
        } else {
            return (Integer) root.elem - (levelSum(root.left, lvl + 1) + levelSum(root.right, lvl + 1));
        }
    }
    //============================================================================

}