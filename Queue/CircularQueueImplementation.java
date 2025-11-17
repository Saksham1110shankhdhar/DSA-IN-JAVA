package Queue;

class CircularQueue{
    private int []arr;
    private int f;
    private int r;
    private int size;
    CircularQueue(int n){
        arr= new int[n];
    }

    int size(){
        return size;
    }

    void add(int ele)throws Exception{
        if(size==arr.length){
            throw new Exception("Queue is full");
        }
        arr[r++]=ele;
        if(r==arr.length){
            r=0;
        }
        size++;
    }

    int remove()throws Exception{
        if(size==0){
            throw new Exception("Queue is empty");
        }
        int peek=arr[f];
        f++;
        if(f==arr.length){
            f=0;
        }
        size--;

        return peek;
    }

    int peek()throws Exception{
        if(size==0){
            throw new Exception("Queue is empty");
        }
        return arr[f];
    }
}

public class CircularQueueImplementation {
    public static void main(String[] args)throws Exception{
        CircularQueue q= new CircularQueue(5);
        q.add(10);
        q.add(20);
        q.add(30);
        q.add(40);
    }
}
