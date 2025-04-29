package Lab8_Heap;

public class Main {
    public static void main(String[] args) {
//        MinHeap heap=new MinHeap(6);
//        heap.insert(17);
//        heap.insert(5);
//        heap.insert(22);
//        heap.insert(10);
//        heap.insert(4);
//        heap.sort();

        MaxHeap max=new MaxHeap(5);
        max.insert(10);
        max.insert(5);
        max.insert(17);
        max.insert(4);
        max.insert(22);
        max.sort();

        System.out.println("done");
    }
}
