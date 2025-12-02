package Heaps;

import java.util.PriorityQueue;

public class priorityQueueBasics {
    public static void main(String[] args) {
        PriorityQueue<Integer> minHeap= new PriorityQueue<>();
        minHeap.add(3);
        minHeap.add(7);
        minHeap.add(4);
        minHeap.add(2);
        minHeap.add(6);
        minHeap.add(1);
        minHeap.add(8);
        minHeap.add(5);
        minHeap.add(0);

        System.out.println(minHeap);
    }
}
