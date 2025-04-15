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
            if(index==0){
                insertAtHead(val);
                return;
            }
            if(index==size){
                insertAtEnd(val);
                return;
            }
            if(index>size){
                System.out.println("invalid index");
            }
            Node temp=new Node(val);
            Node x=head;
            for(int i=0;i<index-1;i++){
                x=x.next;
            }
            temp.next=x.next;
            x.next=temp;
            size++;
        }

        int get(int index) throws Exception{
            if(index==size-1) return tail.val;
            if(index>=size || index<0){
                throw new Exception("Invalid index");
            }
            Node temp=head;
            for(int i=1;i<=index;i++){
                temp=temp.next;
            }
            return temp.val;
        }

        void deleteAtHead() throws Error{
            if(head==null) throw new Error("List is empty!!");
            head=head.next;
            size--;
        }

        void deleteAtTail() throws Error{
            if(head==null) throw new Error("List is empty!!");
            if(head==tail){
                head=tail=null;
            }else{
                Node current=head;
                while(current.next.next!=null){
                    current=current.next;
                }
                current.next=null;
            }
            size--;
        }

        // delete at a particular index
        void delete(int index)throws Error{
            if(head==null) throw new Error("List is empty!!");
            if(index>=size || index<0) throw new Error("invalid index");
            Node temp=head;
            for(int i=1;i<=index-1;i++){
                temp=temp.next;
            }
            temp.next=temp.next.next;
            size--;
        }
    }
    public static void main(String[] args) {
        SLL list=new SLL();
        // list.deleteAtHead();
        list.insertAtEnd(10);
        list.insertAtEnd(20);
        list.insertAtEnd(30);
        list.insertAtHead(100);
        list.insertAtHead(55);
        list.insert(2, 99);
        // to get an element in a linked list time complexity is O(N)
        try {
            list.get(2);
            list.display();
            System.out.println();
            System.out.println(list.size);
            System.out.println(list.get(2));
            list.deleteAtHead();
            list.display();
        } catch (Exception e) {
            System.out.println(e.getMessage());
        }
        list.deleteAtTail();
        System.out.println();
        list.delete(3);
        list.display();
        System.out.println();
        System.out.println(list.size);
    }
}
