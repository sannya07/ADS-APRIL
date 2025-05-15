public class ImplementationStacksLinkedList {
    public static class Node{
        int data;
        Node next;
        Node(int data) {
            this.data=data;
            this.next=null;
        }
    }
    public static class LLStack{
        Node head=null;
        private int size=0;

        // push
        void push(int x){
            Node temp=new Node(x);
            temp.next=head;
            head=temp;
            size++;
        }
        void displayRec(Node temp){
            if(temp==null) return;
            displayRec(temp.next);
            System.out.println(temp.data);
        }
        // display
        void display(){
            displayRec(head);
        }
        // size
        int size(){ //getter
            return size;
        }
        // pop
        int pop(){
            if(head==null) {
                System.out.println("Stack is empty");
                return -1;
            }
            int poped=head.data;
            head=head.next;
            return poped;
        }
        // peek
        int peek(){
            return head.data;
        }
        // isEmpty
        boolean isEmpty(){
            if(size==0) return true;
            return false;
        }
        
    }
    public static void main(String[] args) {
        // why is array implementation better?
        // size-> for every element space taken is one block
        // display is easier and size is fixed

        // disadvantage -> size is fixed. stack can overflow


    }
}
