public class DoublyLinkedList {

    class Node{
         Node next;
        Node prev;
        int value;

        Node(int value){
            this.value = value;
        }
    }

    private Node head;
    private Node tail;
    private int length;

    DoublyLinkedList(int value){
        Node newNode = new Node(value);
        head = newNode;
        tail = newNode;
        length=1;
    }

    public void printDoublyLinkedList(){
        System.out.println("The Doubly Linked LIst Is  : ");
        Node temp = head;
        while(temp!=null){
            System.out.print(temp.value+" ");
            temp = temp.next;
        }
        System.out.println();
    }

    public void append(int value){
        Node newNode = new Node(value);
        if(length==0){
            head = newNode;
            tail = newNode;
            length=1;
        }
        else{
            tail.next = newNode;
            newNode.prev = tail;
            newNode.next = null;
            tail = newNode;
            length++;
        }
    }

    public void prepend(int value){
        Node newNode = new Node(value);
        if(length==0){
            head = newNode;
            tail = newNode;
            length=1;
        }
        else{
            newNode.next = head;
            head.prev = newNode;
            newNode.prev = null;
            head  = newNode;
            length++;
        }
    }

    public Node removeFirst(){
        if(length==0){
            return null;
        }
        Node temp = head;
        head = temp.next;
        head.prev = null;
        temp.next = null;
        length--;
        return temp;
    }

    public Node removeLast(){
        if(length==0){
            return null;
        }
        Node temp = tail;
        tail = temp.prev;
        tail.next = null;
        temp.prev = null;
        length--;
        return temp;
    }

    public Node getNodes(int index){
        if(index<0 && index>length){
            return null;
        }
        Node temp = head;
        if(index <length/2){
            for(int i=0;i<index;i++){
                temp = temp.next;
            }
            return temp;
        }
            temp = tail;
            for(int i=length-1;i>index;i--){
                temp = temp.prev;
            }
            return temp;
    }

    public Node setNode(int index, int value){
        if(index<0 && index>length) {
            return null;
        }
        Node temp = getNodes(index);
        temp.value = value;
        return temp;
    }

    public boolean insertNode(int index,int value){
        if(index<0 && index>length){
            return false;
        }
        if(index==0){
            prepend(value);
            return true;
        }
        if(index==length){
            append(value);
            return true;
        }
        Node newNode = new Node(value);
        Node pre = getNodes(index-1);
        Node temp = pre.next;
        newNode.prev = pre;
        newNode.next = temp;
        pre.next = newNode;
        temp.prev = newNode;
        length++;
        return true;
    }

    public Node removeNode(int index){
        if(index<0 && index>10){
            return null;
        }
        if(index==0){
            removeFirst();
        }
        if(index==length){
            removeLast();
        }

        Node pre = getNodes(index-1);
        Node temp = pre.next;
        pre.next = temp.next;
        temp.next.prev = pre;
         length--;
         return temp;
    }
}
