import java.util.Stack;

public class StockSpanProblem {
    public static class Pair {
        int price;
        int index;

        Pair(int price, int index) {
            this.price = price;
            this.index = index;
        }
    }

    public static void main(String[] args) {
        int[] price = {10, 4, 5, 90, 120, 80};
        int[] result = calculate(price);

        for (int span : result) {
            System.out.print(span + " ");
        }
    }

    public static int[] calculate(int[] price) {
        int n = price.length;
        int[] result = new int[n];
        Stack<Pair> st = new Stack<>();

        for (int i = 0; i < n; i++) {
            while (!st.isEmpty() && st.peek().price <= price[i]) {
                st.pop();
            }

            if (st.isEmpty()) {
                result[i] = i + 1;
            } else {
                result[i] = i - st.peek().index;
            }

            st.push(new Pair(price[i], i));
        }

        return result;
    }
}
