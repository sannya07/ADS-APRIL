import java.util.ArrayList;
import java.util.List;
import java.util.PriorityQueue;
public class SortKsortedArray {
    // sort a nearly sorted array
    public static void main(String[] args) {
        int[] arr={6,5,3,2,8,10,9};
        int k=3;
        List<Integer> ans=new ArrayList<>();
        PriorityQueue<Integer> pq=new PriorityQueue<>();
        for(int ele:arr){
            pq.add(ele);
            if(pq.size()>k){
                ans.add(pq.poll());
            }
        }
        while(!pq.isEmpty()){
            ans.add(pq.poll());
        }
        System.out.println(ans);
        
    }


}
