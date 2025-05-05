package Lab8_Heap;

public class Main {
    public static void main(String[] args) {
        //Task1 tester
        MinHeap heap = new MinHeap(5);
        heap.insert(17);
        heap.insert(5);
        heap.insert(22);
        heap.insert(10);
        heap.insert(4);
        heap.sort();
        System.out.println("<---Task 1 (sorted)result");

        //Task2 tester
        MaxHeap max = new MaxHeap(5);
        max.insert(10);
        max.insert(5);
        max.insert(17);
        max.insert(4);
        max.insert(22);
        max.sort();
        System.out.println("<---Task 2 (sorted)result");

        //Task3 tester
        int[] tasks = {2, 4, 7, 1, 6};
        int m = 4;
        for (int arr : task3(tasks, m)) {
            System.out.print(arr + " ");
        }
        System.out.println("<---Task 3 result");

        //Task4 tester
        int[] nums = {4, 10, 2, 8, 6, 7};
        int k = 3;
        for (int arr : task4(nums, k)) {
            System.out.print(arr + " ");
        }
        System.out.println("<---Task 4 result");
    }


    public static int[] task3(int[] tasks, int m) {
        MinHeap output = new MinHeap(m);
        for (int i = 0; i < m; i++) {
            output.insert(0);
        }
        for (int i = 0; i < tasks.length; i++) {
            int temp = output.extractMin();
            output.insert(temp + tasks[i]);
        }
        return output.returnHeapArray();
    }

    public static int[] task4(int[] nums, int k) {
        int[] resultArray = new int[k];
        MaxHeap heap = new MaxHeap(nums.length);
        for (int i = 0; i < nums.length; i++) {
            heap.insert(nums[i]);
        }
        for (int j = 0; j < k; j++) {
            resultArray[j] = heap.extractMax();
        }
        return resultArray;
    }
}
