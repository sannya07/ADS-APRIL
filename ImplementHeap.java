public class ImplementHeap {
    static class MinHeap{
        int[] arr;
        int size;

        public MinHeap(int capacity) {
            arr=new int[capacity];
            size=0;
        }
        public void upheapify(int index){
            if(index==0) return;
            int parent=(index-1)/2;
            if(arr[index]<arr[parent]){
                swap(index,parent);
                upheapify(parent);
            }
        }
        public void swap(int i,int j){
            int temp=arr[i];
            arr[i]=arr[j];
            arr[j]=temp;
        }
        public int size(){
            return size;
        }
        public void add(int val) throws Exception{
            if(size==arr.length) throw new Exception("Heap is full");
            arr[size]=val;
            size++;
            upheapify(size-1);
        }
        public int peek() throws Exception{
            if(size==0) throw new Exception("Heap is empty");
            return arr[0];
        }
        public int remove() throws Exception{
            if(size==0) throw new Exception("Heap is empty");
           
            int peek=arr[0];
            swap(0, size-1);
            size--;
            downheapify(0);
            return peek;
        }
        public void downheapify(int index){
            if(index>=size) return;
            int leftChild=2*index+1;
            int rightChild=2*index+2;
            int minIndex=index;
            if(arr[leftChild]<arr[minIndex] && leftChild<size) minIndex=leftChild;
            if(arr[rightChild]<arr[minIndex] && rightChild<size) minIndex=rightChild;
            if(index==minIndex) return;
            swap(index, minIndex);
            downheapify(minIndex);
        }
    }
    public static void main(String[] args) throws Exception {
        // left child-> 2*i+1
        // right child -> 2*i+2
        // i is parent
        // parent -> child-1/2
        MinHeap pq=new MinHeap(10);
        pq.add(1);
        pq.add(6);
        pq.add(2);
        System.out.println(pq.size());
        pq.add(0);
        System.out.println(pq.peek());
        System.out.println(pq.remove());
        System.out.println(pq.peek());
    }
}
