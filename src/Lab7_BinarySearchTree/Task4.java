// Complete the sumOfLeaves method
package Lab7_BinarySearchTree;

public class Task4 {

    //===================================TASK#4======================
    // This method takes only one parameter
    // it is root of the given tree
    // You can use extra helper private static methods as per need
    public static Integer mirrorSum(BSTNode root) {
        return mirrorSum(root.left, root.right);
    }

    private static Integer mirrorSum(BSTNode root1, BSTNode root2) {
        if (root2 == null || root1 == null) {
            return 0;
        }
         int sum = mirrorSum(root1.left, root2.right) + mirrorSum(root1.right, root2.left);
        return sum + root1.elem + root2.elem;
    }
    //===============================================================


}
