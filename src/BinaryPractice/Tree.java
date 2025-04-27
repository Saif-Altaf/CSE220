//package BinaryPractice;
//
//public class Tree {
//    private Node root;
//
//    public void insert(int val) {
//        Node node = new Node(val);
//        if (isEmpty()) {
//            root = node;
//            return;
//        }
//        Node current = root;
//        while (true) {
//            if(current.leftChild==null){
//                current.leftChild.val=val;
//                return;
//            }
//            if(current.rightChild==null){
//                current.rightChild.val=val;
//                return;
//            }
//            current=current.leftChild;
//        }
//    }
//
//    public boolean find(int val) {
//
//        if (val == root.val) {
//            return true;
//        }
//
//        Node current = root;
//        while (current != null) {
//            if (val < current.val) {
//                if (current.leftChild.val == val) {
//                    return true;
//                }
//                current = current.leftChild;
//            } else {
//                if (current.rightChild.val == val) {
//                    return true;
//                }
//                current = current.rightChild;
//            }
//        }
//        return false;
//    }
//
//    public boolean isEmpty() {
//        return root == null;
//    }
//
//    private class Node {
//        public int val;
//        public Node leftChild;
//        public Node rightChild;
//
//        public Node(int val) {
//            this.val = val;
//        }
//    }
