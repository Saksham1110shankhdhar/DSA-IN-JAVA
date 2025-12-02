package Heaps;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.PriorityQueue;



public class kClosedpointToOrigin {
    class triplet implements Comparable<triplet> {
        int x;
        int y;
        int dist;
        triplet(int x, int y, int dist){
            this.x=x;
            this.y=y;
            this.dist=dist;
        }
        public int compareTo(triplet other){
            return Integer.compare(this.dist, other.dist);
        }
    }
     public ArrayList<ArrayList<Integer>> kClosest(int[][] points, int k) {
        PriorityQueue<triplet> maxHeap= new PriorityQueue<>(Collections.reverseOrder());
         for(int i=0; i<points.length; i++){
                int x=points[i][0];
                int y=points[i][1];
                int dist=x*x+y*y;

                maxHeap.add(new triplet(x,y,dist));
                if(maxHeap.size()>k){
                    maxHeap.remove();
                }
         }

         ArrayList<ArrayList<Integer>> ans= new ArrayList<>();

         while(maxHeap.size()>0){
            triplet t= maxHeap.remove();
            ArrayList<Integer> a= new ArrayList<>();
            a.add(t.x);
            a.add(t.y);
            ans.add(a);
         }
         return ans;
    }
    
}
