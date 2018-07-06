public class DeleteNode {
    public static class LinkedListNode {

        public int value;
        public LinkedListNode next;

        public LinkedListNode(int value) {
            this.value = value;
        }
    }

    public static void deleteNode(LinkedListNode nodeToDelete) {
        if(nodeToDelete.next == null) throw new IllegalArgumentException("");
        else {
            nodeToDelete.value=nodeToDelete.next.value;
            nodeToDelete.next=nodeToDelete.next.next;
        }
    }

