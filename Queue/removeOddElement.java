package Queue;

import java.util.LinkedList;
import java.util.Queue;

public class removeOddElement {
    public static void main(String[] args) {
        Queue<Integer> q= new LinkedList<>();

        q.add(10);
        q.add(20);
        q.add(30);
        q.add(40);
        q.add(50);

        int n=q.size();

        for(int i=0;i<n;i++){
            int ele=q.remove();

            if(ele%2==0){
                q.add(ele);
            }
        }

        System.out.print(q);
    }
}
