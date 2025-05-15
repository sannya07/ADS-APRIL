import java.util.Stack;

public class NextGreaterElement {
    public static int[] findNextGreaterElement(int[] arr) {
        int n = arr.length;
        int[] result = new int[n];
        Stack<Integer> st = new Stack<>();

        // Traverse from the end of the array
        for (int i = n - 1; i >= 0; i--) {
            // Remove all elements smaller than or equal to current
            while (!st.isEmpty() && st.peek() <= arr[i]) {
                st.pop();
            }

            // If stack is empty, no greater element
            result[i] = st.isEmpty() ? -1 : st.peek();

            // Push current element for the next iterations
            st.push(arr[i]);
        }

        return result;
    }

    public static void main(String[] args) {
        int[] arr = {1, 3, 2, 1, 8, 6, 3, 4};
        int[] ans = findNextGreaterElement(arr);

        // Print the result
        for (int i = 0; i < ans.length; i++) {
            System.out.print(ans[i] + " ");
        }

        // Uncomment to compare with brute-force approach
        /*
        int[] res = new int[arr.length];
        for (int i = 0; i < arr.length; i++) {
            res[i] = -1;
            for (int j = i + 1; j < arr.length; j++) {
                if (arr[j] > arr[i]) {
                    res[i] = arr[j];
                    break;
                }
            }
        }

        System.out.println("\nBrute-force result:");
        for (int value : res) {
            System.out.print(value + " ");
        }
        */
    }
}
