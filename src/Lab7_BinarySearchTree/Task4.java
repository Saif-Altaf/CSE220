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

    private static Integer mirrorSum(BSTNode leftRoot, BSTNode rightRoot) {
        if (leftRoot == null || rightRoot == null) {
            return 0;
        }
        return leftRoot.elem + rightRoot.elem+ mirrorSum(leftRoot.left, rightRoot.right)+ mirrorSum(leftRoot.right, rightRoot.left);
    }

    //===============================================================


}
