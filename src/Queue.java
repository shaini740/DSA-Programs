public class Queue {

    class Node{
        Node next;
        int value;

        Node(int value){
            this.value = value;
        }
    }

    private Node first;
    private Node last;
    private int length;

    Queue(int value){
        Node newNode = new Node(value);
        first = newNode;
        last = newNode;
        length=1;
    }

    public void printQueue(){
      Node temp = first;
      System.out.println("The Queue is : ");
      while(temp!=null){
          System.out.print(temp.value+" ");
          temp = temp.next;
      }
      System.out.println();
    }


    public void Enqueue(int value){
        Node newNode = new Node(value);
        if(length==0){
            first = newNode;
            last = newNode;
            length=1;
        }
        else{
            last.next = newNode;
            last = newNode;
            length++;
        }
    }

    public Node Dequeue(){
        if(length==0){
            return null;
        }
        Node temp = first;
        first = temp.next;
        temp.next = null;
        length--;
        return temp;
    }
}
