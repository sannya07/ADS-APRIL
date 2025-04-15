public class ImplementationLL {
    static class Node{
        int val;
        Node next;
    
        public Node(int val){
            this.val=val;
        }
    } 

    static class SLL{
        Node head;
        Node tail;
        int size;
        
        void insertAtEnd(int val){
            Node newNode=new Node(val);
            if(head==null){
                head=tail=newNode;
            }else{
                tail.next=newNode;
                tail=newNode;
            }
            size++;
        }

        void display(){
            Node temp=head;
            while(temp!=null){
                System.out.print(temp.val+"->");
                temp=temp.next;
            }
            System.out.print("null");
        }

        void insertAtHead(int val){
            Node newNode=new Node(val);
            if(head==null){
                head=newNode;
                tail=newNode;
            }else{
                newNode.next=head;
                head=newNode;
            }
            size++;
        }

        // insert at a particular index
        void insert(int index,int val){
            
        }
    }
    public static void main(String[] args) {
        SLL list=new SLL();
        list.insertAtEnd(10);
        list.insertAtEnd(20);
        list.insertAtEnd(30);
        list.insertAtHead(100);
        list.insertAtHead(55);
        list.display();
        System.out.println();
        System.out.println(list.size);
    }
}
