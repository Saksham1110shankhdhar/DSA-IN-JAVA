package Stack;

class Node{
    int data;
    Node next;
    Node(int data){
        this.data=data;
    }
}

class MyStack{
    Node head;
    int size;

    void push(int ele){
        Node newNode= new Node(ele);
        newNode.next=head;
        head=newNode;
        size++;
    }

    int pop() throws Exception{
        if(size==0){
            throw new Exception("Stack is Empty");
        }
        int val=head.data;
        head=head.next;
        size--;
        return val;
    }

    int peek()throws Exception{
        if(size==0){
            throw new Exception("Stack is Empty");
        }
       
        return  head.data;
    }

    void display(){
        Node temp=head;

        while(temp!=null){
            System.out.print(temp.data+"->");
            temp=temp.next;;
        }
        System.out.print("Null");
    }
}

public class ImplementationStackViaLL {
    public static void main(String[] args) throws Exception {
        MyStack st= new MyStack();

        st.push(1);
        st.push(2);
        st.push(3);
        st.push(4);
        st.push(5);

        st.display();

        st.pop();

        System.out.println();
        st.display();

        System.out.println();

       System.out.println( st.peek());
        st.display();
    }
}
