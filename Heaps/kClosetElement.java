package Heaps;

import java.util.Collections;
import java.util.PriorityQueue;

public class kClosetElement {
    class pair implements Comparable<pair>{
        int ele;
        int diff;
        pair(int ele, int diff){
            this.ele=ele;
            this.diff=diff;
        }

        public int compareTo(pair other){
            if(this.diff==other.diff){
                return Integer.compare( other.ele,this.ele);
            }
            return Integer.compare(this.diff,other.diff);
        }
    }
    int[] printKClosest(int[] arr, int k, int x) {
        PriorityQueue<pair> maxHeap= new PriorityQueue<>(Collections.reverseOrder());
         for(int ele:arr){
            int diff=Math.abs(x-ele);
            if(diff>0)maxHeap.add(new pair(ele,diff));

            if(maxHeap.size()>k){
                maxHeap.remove();
            }
         }

         int []ans= new int[k];
         int i=k-1;

         while(maxHeap.size()>0){
            pair top=maxHeap.remove();
            ans[i--]=top.ele;
         }

         return ans;


        
    }
}
