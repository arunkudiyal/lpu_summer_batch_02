package com.company;

public class MaxHeap {
    public int[] Heap;
    public int maxSize;                // The total amount of elements that can be store in the heap
    public int size;                   // The total number of elements in the heap
    MaxHeap(int maxSize) {
        this.maxSize = maxSize;
        this.Heap = new int[maxSize];
        this.size = 0;
    }
    // Helper Function to find the index of the parent, the left child and the right child for a given index
    public int parent(int index) { return (index - 1) / 2; }
    public int left(int index) { return (2 * index) + 1; }
    public int right(int index) { return (2 * index) + 2; }
    public boolean isLeaf(int index) {
        if(index > size/2 && index <= size) return true;
        return false;
    }
    public void swap(int f_pos, int s_pos) {
        int temp;
        temp = Heap[f_pos];
        Heap[f_pos] = Heap[s_pos];
        Heap[s_pos] = temp;
    }
    public void insert(int element) {
        int pos = size;
        Heap[pos] = element;
        while(Heap[pos] > Heap[parent(pos)]) {
            swap(pos, parent(pos));
            pos = parent(pos);
        }
        ++size;
    }
    public void maxHeapify(int pos) {
        if(isLeaf(pos)) return;
        // to check if the heap properties are violated or not
        if(Heap[pos] < Heap[left(pos)] || Heap[pos] < Heap[right(pos)]) {
            if(Heap[left(pos)] > Heap[right(pos)]) {
                swap(pos, left(pos));
                maxHeapify(left(pos));
            } else {
                swap(pos, right(pos));
                maxHeapify(right(pos));
            }
        }
    }
    public int extractMax() {
        int deleted = Heap[0];
        Heap[0] = Heap[--size];
        // the heap properties are violated...
        maxHeapify(0);
        return deleted;
    }
    public void display() {
        // size = 7, i/2 = 3; i = 0, 1, 2
        for(int i=0; i < size; i++)
            System.out.print(Heap[i] + " ");
        System.out.println();
        for(int i=0; i < size/2; i++) {
            System.out.print("Parent Element - " + Heap[i] + " | ");
            System.out.print("Left Child - " + Heap[left(i)] + " | ");
            System.out.print("Right Child - " + Heap[right(i)] + " | ");
            System.out.println();
        }
    }
    public static void main(String[] args) {
        MaxHeap heap = new MaxHeap(1000);     // maxSize = 50; size = 0; Heap[50];
        heap.insert(45);
        heap.insert(40);
        heap.insert(35);
        heap.insert(30);
        heap.insert(25);
        heap.insert(20);
        heap.insert(15);
        // heap.display();
        heap.extractMax();
        System.out.println(heap.size);
        heap.display();
    }
}