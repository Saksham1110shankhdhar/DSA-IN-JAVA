package Oops;

class ownArrayList{

    private int arr[];
    private int idx;

    ownArrayList(int capacity){
        arr = new int[capacity];
        
    }

 

    void add(int element){
        if(idx==arr.length){
            increaseCapacity();
        }
        arr[idx++]=element;
    }

    int getIndex(int index) throws Exception{
        if(index<0 || index>=idx){
            throw new Exception(" Index out of bound ");//checked exception
        }
         return arr[index];
    }

     void insertAt(int index,int element) throws Exception{
        if(index<0 || index>=idx){
            throw new Exception(" Index out of bound ");//checked exception
        }
        if(idx==arr.length){
            increaseCapacity();
        }

        for(int i=idx-1;i>=index;i--){
            arr[i+1]=arr[i];
        }
        arr[index]=element;
        idx++;
    }


     void remove()throws Exception{
        if(size()==0){
           throw new Exception("Array is empty");
        }
        idx--;
    }

    void increaseCapacity() {
       int brr[]= new int[(arr.length)*2];

       for(int i=0;i<arr.length;i++){
        brr[i]=arr[i];
       }

       arr=brr;
    }

    void display(){
        for(int i=0;i<idx;i++){
            System.out.print(arr[i]+" ");
        }
    }

    int capacity(){
        return arr.length;
    }

    int size(){
        return idx;
    }   


}

public class MyArrayList {
    public static void main(String args[]) throws Exception{

        ownArrayList list = new ownArrayList(5);
       // list.remove();
        list.add(10);
        list.add(20);
         list.add(14);
        list.add(25);
          

        list.display();

        System.out.println();

        System.out.println("size and capacity "+list.size()+" "+list.capacity());

        

        list.add(100);

        System.out.println();

        list.display();

        System.out.println();
        

        System.out.println("size and capacity "+list.size()+" "+list.capacity());

        list.add(200);

         list.display();

        System.out.println();
        

        System.out.println("size and capacity "+list.size()+" "+list.capacity());

        System.out.println(list.getIndex(7));


    }
    
    
}
