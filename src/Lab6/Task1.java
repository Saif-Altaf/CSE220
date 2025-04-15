package Lab6;

// Complete the convertMirror method
public class Task1 {

    //======================TASK#1======================
    // This method takes only 1 parameter which is root
    // You'll need to create a new Mirrored Tree and return the new root
    public static BTNode convertMirror(BTNode root) {
        if (root == null) {
            return root;
        }
        convertMirror(root.left);
        BTNode tempLeft=root.left;
        root.left=root.right;
        root.right=tempLeft;
        return root;
    }
    //==================================================

}
