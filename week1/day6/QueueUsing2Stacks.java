public class QueuewithTwoStacks {

    // fill in the definitions for enqueue() and dequeue() 

    public static class QueueTwoStacks {

        private Stack<Integer> inStack = new Stack<>();
        private Stack<Integer> outStack = new Stack<>();
        
        public void enqueue(int item) {
            inStack.push(item);
        }

        public int dequeue() {
            if(inStack.empty() && outStack.empty()) throw new IllegalArgumentException("");
            else if(outStack.empty()){
                while(!inStack.empty()){
                    outStack.push(inStack.pop());
                }
                int k=outStack.pop();
                /*while(!outStack.empty()){
                    inStack.push(outStack.pop());
                }*/
                return k;
            }
            else{
                return outStack.pop();
            }
        }
    }
