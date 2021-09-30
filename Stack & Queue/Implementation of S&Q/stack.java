public class stack {
    private int[] arr;
    private int tos;
    private int size;
    private int maxSize;

    protected void initilize(int len) {
        this.arr = new int[len];
        this.tos = -1;
        this.size = 0;
        this.maxSize = len;
    }

    public stack() {
        initilize(5);
    }

    public stack(int size) {
        initilize(size);
    }

    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("[");
        for (int i = tos; i >= 0; i--) {
            sb.append(this.arr[i]);
            if (i != 0)
                sb.append(", ");
        }
        sb.append("]");
        return sb.toString();
    }

    private void stackIsEmptyException() throws Exception {
        if (this.size == 0)
            throw new Exception("stackIsEmptyException: -1");
    }

    private void stackIsOverflowException() throws Exception {
        if (this.size == this.maxSize)
            throw new Exception("stackIsOverflowException: -1");
    }

    // O(1)
    public int size() {
        return this.size;
    }

    public int maxSize() {
        return this.maxSize;
    }

    // O(1)
    public boolean isEmpty() {
        return this.size == 0;
    }

    private void push_(int data) {
        this.arr[++this.tos] = data;
        this.size++;
    }

    // O(1)
    public void push(int data) throws Exception {
        stackIsOverflowException();
        push_(data);
    }

    // O(1)
    public int top() throws Exception {
        stackIsEmptyException();
        return this.arr[this.tos];
    }

    private int pop_() {
        int rv = this.arr[this.tos];
        this.arr[this.tos--] = 0;
        this.size--;
        return rv;
    }

    // O(1)
    public int pop() throws Exception {
        stackIsEmptyException();
        return pop_();
    }

    // Using LinkedList
    private Node head;

    public void push1(int x) {
        if (head == null)
            head = new Node(x, x, null);
        else
            head = new Node(x, Math.min(x, head.min), head);
    }

    public void pop1() {
        head = head.next;
    }

    public int top1() {
        return head.val;
    }

    public int getMin() {
        return head.min;
    }

    private class Node {
        int val;
        int min;
        Node next;

        private Node(int val, int min, Node next) {
            this.val = val;
            this.min = min;
            this.next = next;
        }
    }

}