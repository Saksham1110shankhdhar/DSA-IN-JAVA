package Heaps;

import java.util.PriorityQueue;

public class NearlySorted {
     public void nearlySorted(int[] arr, int k) {
        PriorityQueue<Integer> minHeap= new PriorityQueue<>();
        
        int i=0;
        
        for(int ele:arr){
            minHeap.add(ele);
            if(minHeap.size()>k)arr[i++]=minHeap.remove();
            
        }
        
        while(minHeap.size()>0) arr[i++]=minHeap.remove();
        
    }
}
