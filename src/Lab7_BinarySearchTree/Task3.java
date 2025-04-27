// Complete the sumOfLeaves method
package Lab7_BinarySearchTree;

public class Task3 {

    //===================================TASK#3======================
    // This method takes only 2 parameters
    // 1st one is root
    // 2nd one is the sum initiliazed as 0
    // You'll need to return the sum of the leaf nodes
    public static Integer sumOfLeaves(BSTNode root, Integer sum) {
        // TO DO
        if (root == null) {
            return sum;
        }
        if (root.left == null && root.right == null) {
            sum += root.elem;
            return sum;
        }
        return sumOfLeaves(root.left, sum) + sumOfLeaves(root.right, sum);
    }
    //===============================================================

}
