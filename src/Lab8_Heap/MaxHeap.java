package Lab8_Heap;

public class MaxHeap {
    private int[] heapArray;
    private int size;

    public MaxHeap(int capacity) {
        this.heapArray = new int[capacity];
    }

    public void insert(int value) {
        if (size == heapArray.length) {
            throw new IllegalStateException("Array is full");
        }
        heapArray[size++] = value;
        swim();
    }

    public void swim() {
        var index = size - 1;
        var parentIndex = (index - 1) / 2;
        while (heapArray[index] > heapArray[parentIndex] && index > 0) {
            var temp = heapArray[index];
            heapArray[index] = heapArray[parentIndex];
            heapArray[parentIndex] = temp;
            index = (index - 1) / 2;
            parentIndex = (index - 1) / 2;
        }
    }

    public int extractMax() {
        if (size == 0) {
            throw new IllegalStateException("Array is empty");
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
        var maxIndex = index;
        if (leftChildIndex > size) {
            maxIndex = index;
        } else if (rightChildIndex > size) {
            maxIndex = leftChildIndex;
        } else {
            if(heapArray[leftChildIndex]>heapArray[rightChildIndex]){
                maxIndex=leftChildIndex;
            }
            if(heapArray[rightChildIndex]>heapArray[leftChildIndex]){
                maxIndex=rightChildIndex;
            }
        }
        while (heapArray[index] < heapArray[maxIndex] && maxIndex < size ) {
            var temp = heapArray[index];
            heapArray[index] = heapArray[maxIndex];
            heapArray[maxIndex] = temp;
            index = maxIndex;
            if (index * 2 + 1 > size) {
                maxIndex = index;
            } else if (index * 2 + 2 > size) {
                maxIndex = index * 2 + 1;
            } else {
                if(heapArray[index * 2 + 1]>heapArray[index * 2 + 2]){
                    maxIndex=index * 2 + 1;
                }
                if(heapArray[index * 2 + 2]>heapArray[index * 2 + 1]){
                    maxIndex=index * 2 + 2;
                }
            }
        }
    }

    public void sort() {
        while(size>0){
            heapArray[size-1]=extractMax();
        }
        for (int arr : heapArray) {
            System.out.print(arr + " ");
        }
    }
}
