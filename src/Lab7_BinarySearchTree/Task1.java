// Complete the lowestCommonAncestor method
package Lab7_BinarySearchTree;

public class Task1 {

    //======================TASK#1======================
    // This method takes only 3 parameter first one is root
    // and second & third parameter are as 2 integers
    // You'll need to find the lowest common ancestor of them and return it
    public static Integer lowestCommonAncestor(BSTNode root, Integer x, Integer y) {
        if (root == null) {
            return -1;
        }
        if (root.elem == x && (root.left.elem == y || root.right.elem == y)) {
            return x;
        }
        if (root.elem == y && (root.left.elem == x || root.right.elem == x)) {
            return y;
        }
        if ((x > root.elem && y < root.elem) || (x < root.elem && y > root.elem)) {
            return root.elem;
        }
        if (x < root.elem && y < root.elem) {
            return lowestCommonAncestor(root.left, x, y);
        }
        return lowestCommonAncestor(root.right, x, y);
    }
    //==================================================

}
