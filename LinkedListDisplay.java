public class LinkedListDisplay{
   static class Node{
    int val;
    Node next;

    public Node(int val){
        this.val=val;
    }
   } 

   public static void displayprint(Node head){
    if(head==null) return;

    System.out.println(head.val);
    displayprint(head.next);
   }
   public static void main(String[] args) {
    Node a=new Node(10);
    Node b=new Node(3);
    a.next=b;
    Node c=new Node(100);
    b.next=c;
    Node temp=a;

    // both point to the same address
    // while(temp!=null){
    //     System.out.print(temp.val+" ");
    //     temp=temp.next;
    // }
    displayprint(temp);
   }
}