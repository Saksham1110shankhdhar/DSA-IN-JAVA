package LearningArrayLists;

import java.util.ArrayList;

public class ArrayLists {
    public static void main(String[] args) {
        
        ArrayList<Integer> arr = new ArrayList<>();

        arr.add(10);
        arr.add(20);
        arr.add(30);
        arr.add(40);

        System.out.println(arr);

         arr.set(0, 100); // change array list

        for(int i=0;i<arr.size();i++){
            System.out.print(arr.get(i)+ " ");
        }

        System.out.println();

        // i=1 2 3 4 5 ... 

        
       
    }
}
