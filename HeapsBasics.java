
import java.util.*;

public class HeapsBasics{

public static void main(String[] args) {
    // min heap
    // PriorityQueue<Integer> pq=new PriorityQueue<>();
    // max heap
    PriorityQueue<Integer> pq=new PriorityQueue<>(Collections.reverseOrder());

    pq.add(10);
    System.out.println(pq);
    pq.add(2);
    System.out.println(pq);
    pq.add(1);
    System.out.println(pq);
    pq.remove();
    System.out.println(pq);
    pq.add(7);
    System.out.println(pq);

    // time complexity of the operations in the heap is O(log n) for add, remove, poll and peek
    // and O(1) for isEmpty and size
    // add->the element is added to heap and the minimum element is at the top
    // remove->the minimum element is removed from the heap and the next minimum element is at the top
    // peek->the minimum element is returned from the heap without removing it
    // poll->the minimum element is returned from the heap and removed from the heap
    // clear->the heap is cleared and all elements are removed from the heap
    // size->the number of elements in the heap is returned
    // isEmpty->true if the heap is empty and false if the heap is not empty


}
}