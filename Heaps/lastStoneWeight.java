package Heaps;

import java.util.Collections;
import java.util.PriorityQueue;

public class lastStoneWeight {
    public int solve(int[] stones) {
        PriorityQueue<Integer> maxHeap= new PriorityQueue<>(Collections.reverseOrder());
        for(int ele:stones){
            maxHeap.add(ele);
        }

        int weight=0;

        while(maxHeap.size()>1){
            int first=maxHeap.remove();
            int second=maxHeap.remove();

           
            if (first != second) {
                weight=first - second;
                maxHeap.add(weight);
            }
        }
           if (!maxHeap.isEmpty()) {
            weight = maxHeap.peek();          // update weight to the last stone
           } else {
            weight = 0;
         }

          return weight;
    }
}
