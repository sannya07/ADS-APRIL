public class ImplementStackArray {
    public static class Stack{
        int[] arr=new int[5];
        private int index=0;
        // push
        void push(int x) throws Exception{
            if(index==arr.length){
                throw new Exception("Stack is Full");
            }
            arr[index]=x;
            index++;
        }
        // peek
        int peek() throws Exception{
            if(index==0){
                throw new Exception("Stack is Empty");
            }
            return arr[index-1];
        }
        // pop
        int pop() throws Exception{
            if(index==0){
                throw new Exception("Stack is Empty");
            }
            int top=arr[index-1];
            arr[index-1]=0;
            index--;
            return top;
        }
        // display
        void display(){
            for(int i=0;i<=index-1;i++){
                System.out.print(arr[i]+" ");
            }
            System.out.println();
        }
        // size
        int size(){
            return index;
        }
        // isEmpty
        boolean isEmpty(){
            return index==0;
        }
        // isFull
        boolean isFull(){
            return index==arr.length;
        }
    }


    public static void main(String[] args) throws Exception {
        Stack st=new Stack();
        st.push(10);
        st.display();
        st.push(20);
        st.display();
        st.push(30);
        st.display();
        System.out.println("size of stack is "+st.size());
        System.out.println("top element is "+st.peek());
        st.pop();
        st.display();
    }
}