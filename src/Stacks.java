public class Stacks {

    class Node {
        Node next;
        int value;

        Node(int value) {
            this.value = value;
        }
    }

    private Node top;
    private int length;

    public Stacks(int value) {
        Node newNode = new Node(value);
        top = newNode;
        length = 1;
    }

    public void printStack() {
        Node temp = top;
        System.out.println("The Stack is:");
        while (temp != null) {
            System.out.print(temp.value + " ");
            temp = temp.next;
        }
        System.out.println();
    }

    public void push(int value){
        Node newNode = new Node(value);
        if(length==0){
            top = newNode;
            length=1;
        }
        else{
            newNode.next = top;
            top = newNode;
            length++;
        }
    }

    public Node pop(){
        if(length==0){
            return null;
        }
        Node temp = top;
        top= temp.next;
        temp.next = null;
        length--;
        return temp;
    }
}
