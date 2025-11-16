package Queue;

import java.util.LinkedList;
import java.util.Queue;

public class traversalInAQueue {
    public static void main(String[] args) {
        Queue<Integer> q= new LinkedList<>();

        q.add(10);
        q.add(20);
        q.add(30);
        q.add(40);
        q.add(50);

        int n=q.size();

        for(int i=1;i<=n;i++){
            System.out.print(q.peek()+" ");
            q.add(q.remove());

        }

        int sum=0;
        for(int i=1;i<=n;i++){
            sum+=q.peek();
            q.add(q.remove());
            
        }

        System.out.println(sum);
    }
}
