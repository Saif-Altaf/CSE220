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
        if(size==0){
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
        if (heapArray[leftChildIndex] < heapArray[rightChildIndex]) {
            minIndex = leftChildIndex;
        } else {
            minIndex = rightChildIndex;
        }
        while (heapArray[index] > heapArray[minIndex] && minIndex <= size) {
            var temp = heapArray[index];
            heapArray[index] = heapArray[minIndex];
            heapArray[minIndex] = temp;
            index = minIndex;
            if (heapArray[index * 2 + 1] < heapArray[index * 2 + 2]) {
                minIndex = index * 2 + 1;
            } else {
                minIndex = index * 2 + 2;
            }
        }
    }

    public void sort() {
        int [] sorted=new int[size];
        int i=0;
        while(size!=0) {
            sorted[i++] = extractMin();
        }

        for(int arr:sorted){
            System.out.print(arr+" ");
        }
    }
}
