package Heaps;

import java.util.PriorityQueue;

public class MinimumCostOfRopes {
      public static int minCost(int[] arr) {
        PriorityQueue<Integer> minHeap= new PriorityQueue<>();
        for(int ele: arr){
            minHeap.add(ele);
        }

        int cost=0;

        while(minHeap.size()>1){
            int first= minHeap.remove();
            int second= minHeap.remove();

            cost+=(first+second);
            minHeap.add(first+second);
        }
        
        return cost;
    }
}
