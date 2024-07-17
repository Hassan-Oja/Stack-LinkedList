public class Stack_Linkedlist {
    Node top;

    int size ;
    public Stack_Linkedlist() {
        this.top = null;
        this.size = 0;
    }
    public boolean isEmpty() {
        if (top == null) {
            return true;
        }
        return false;
    }
    public void push(int data) {
        Node newnode = new Node(data);
        if (!isEmpty()) {
            newnode.next = top;
        }
        top = newnode;
        size++;
    }
    public int pop() {
        if (isEmpty()) {
            throw new RuntimeException("Your Stack is Empty");
        }
        int element = top.data;
        top = top.next;
        size--;
        return element;
    }
    public void display() {
        if (isEmpty()) {
            throw new RuntimeException("Your Stack is Empty");
        }
        Node temp = top;
        while (temp != null) {
            System.out.print(temp.data);
            temp = temp.next;
            if (temp != null) {
                System.out.print("->");
            }
        }
        System.out.println();
    }
    public int max() {
        if (isEmpty()) {
            throw new RuntimeException("Your Stack is Empty");
        }
        int max = top.data;
        Node temp = top;
        while (temp != null) {
            if (max < temp.data) {
                max = temp.data;
            }
            temp = temp.next;
        }
        return max;
    }
    public int min() {
        if (isEmpty()) {
            throw new RuntimeException("Your Stack is Empty");
        }
        int min = top.data;
        Node temp = top;
        while (temp != null) {
            if (min > temp.data) {
                min = temp.data;
            }
            temp = temp.next;
        }
        return min;
    }
    public int peek() {
        return top.data;
    }

    public int size (){
        return size;
    }
    public int getLen(){
        int length = 0;
        Node temp = top;
        while (temp != null) {
            length++;
            temp = temp.next;
        }
        return length;
    }
    public void clear() {
        top = null;
        size = 0;
    }
}
