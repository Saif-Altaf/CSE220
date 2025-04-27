// Complete the sumOfLeaves method
package Lab7_BinarySearchTree;

public class Task2 {

    //===================================TASK#2===================================
    // This method takes only 2 parameters
    // 1st one is root
    // 2nd one is an Integer
    // You'll need to find the path from the root to a node containing the Integer
    // return the path as a String
    public static String findPath(BSTNode root, Integer key) {
        String s = "";
        return findPath(root, key, s);
    }

    private static String findPath(BSTNode root, Integer key, String s) {
        if (root == null) {
            return "No Path Found";
        }
        if(key== root.elem){
            s+=root.elem;
            return s;
        }
        if(key<root.elem){
            s+=root.elem+" ";
            return findPath(root.left,key,s);
        }
        s+=root.elem+" ";
        return findPath(root.right,key,s);
    }
//============================================================================

}
