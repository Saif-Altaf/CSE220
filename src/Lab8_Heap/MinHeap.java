package Lab8_Heap;

public class MinHeap {
    private int[] heapArray;
    private int size;

    public MinHeap(int capacity) {
        this.heapArray = new int[capacity];

    }

    public void insert(int value) {
        if (size == heapArray.length) {
            System.out.println("Array is full");
        }
        heapArray[size++] = value;
        swim();
    }

    public void swim() {
        var index = size - 1;
        var parentIndex = (index - 1) / 2;
        while (heapArray[index] < heapArray[parentIndex]) {
            var temp = heapArray[index];
            heapArray[index] = heapArray[parentIndex];
            heapArray[parentIndex] = temp;
            index = (index - 1) / 2;
            parentIndex = (index - 1) / 2;
        }
    }

    public int extractMin() {
        if (size == 0) {
            System.out.println("Cannot extract min value as heap Array is empty");
            return -1;
        }
        int temp = heapArray[0];
        heapArray[0] = heapArray[size - 1];
        size--;
        sink();
        return temp;
    }

    public void sink() {
        var index = 0;
        var leftChildIndex = index * 2 + 1;
        var rightChildIndex = index * 2 + 2;
        var minIndex = index;
        if (leftChildIndex > size) {
            minIndex = index;
        } else if (rightChildIndex > size) {
            minIndex = leftChildIndex;
        } else {
            if (heapArray[leftChildIndex] <= heapArray[rightChildIndex]) {
                minIndex = leftChildIndex;
            }
            if (heapArray[rightChildIndex] <= heapArray[leftChildIndex]) {
                minIndex = rightChildIndex;
            }
        }
        while (heapArray[index] > heapArray[minIndex] && minIndex < size) {
            var temp = heapArray[index];
            heapArray[index] = heapArray[minIndex];
            heapArray[minIndex] = temp;
            index = minIndex;
            if (index * 2 + 1 > size) {
                minIndex = index;
            } else if (index * 2 + 2 > size) {
                minIndex = index * 2 + 1;
            } else {
                if (heapArray[index * 2 + 1] < heapArray[index * 2 + 2]) {
                    minIndex = index * 2 + 1;
                }
                if (heapArray[index * 2 + 2] < heapArray[index * 2 + 1]) {
                    minIndex = index * 2 + 2;
                }
            }
        }
    }

    public void sort() {
        while (size > 0) {
            heapArray[size - 1] = extractMin();
        }
        for (int arr : heapArray) {
            System.out.print(arr + " ");
        }
    }
    public int[] returnHeapArray(){
        return heapArray;
    }
}
