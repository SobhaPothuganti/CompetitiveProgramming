public class LargestinStack {

    // fill in the definitions for push(), pop(), and getMax()
    static Stack<Integer> s1=new Stack<>();
    static Stack<Integer> s2=new Stack<>();
    public static class MaxStack {

        public void push(int item) {
            if(s2.empty() || s2.peek()<=item) s2.push(item);
            s1.push(item);
        }

        public int pop() {
            if (s1.empty())throw new EmptyStackException();
            int k=s1.pop();
            if(s2.peek() == k) s2.pop();
            return k;
        }

        public int getMax() {
            return s2.peek();
        }
    }
