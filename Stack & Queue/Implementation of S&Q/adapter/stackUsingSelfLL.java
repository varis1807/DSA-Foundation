//package adapter;

public class stackUsingSelfLL {

    public static class stack {
        private class Node {
            int data;
            Node next;

            Node(int data) {
                this.data = data;
            }
        }

        private Node head = null;
        private Node tail = null;
        private int size = 0;

        private void addFirst(int data) {
            Node node = new Node(data);
            if (this.size == 0)
                this.head = this.tail = node;
            else {
                node.next = this.head;
                this.head = node;
            }

            this.size++;
        }

        public Node getFirst() {
            return this.head;
        }

        private Node removeFirst() {
            Node node = this.head;
            if (this.size == 1)
                this.head = this.tail = null;
            else {
                this.head = node.next;
            }
            node.next = null;
            this.size--;
            return node;
        }

        public int size() {
            return this.size;
        }

        public boolean isEmpty() {
            return this.size == 0;
        }

        public void push(int data) {
            this.addFirst(data);
        }

        public int top() {
            return this.getFirst().data;
        }

        public int pop() {
            return this.removeFirst().data;
        }

    }

    public static void main(String[] args) {
        stack st = new stack();

       st.push(10);
       st.push(20);
       st.push(30);      
       System.out.println(st.top());
       st.pop();
       System.out.println(st.top());
       st.pop();
       System.out.println(st.top());

       
    }

}