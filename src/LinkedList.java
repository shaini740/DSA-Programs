public class LinkedList {

    class Node{
        Node next;
        int value;

        Node(int value){
            this.value= value;
        }
    }
    private Node head;
    private Node tail;
    private int length;

    LinkedList(int value){
        Node newNode= new Node(value);
        head = newNode;
        tail = newNode;
        length=1;
    }

    public void printLinkedList(){
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
            head= newNode;
            tail = newNode;
            length=1;
        }
        else {
            tail.next = newNode;
            newNode.next = null;
            tail = newNode;
        }
        length++;
    }


    public void prepend(int value){
        Node newNode  = new Node(value);
        if(length==0){
            head = newNode;
            tail = newNode;
            length=1;
        }
        else{
            newNode.next = head;
            head = newNode;
        }
        length++;
    }

    public Node removeFirst(){
        if(length==0){
            return null;
        }
        Node temp = head;
        head = temp.next;
        temp.next = null;
        length--;
        return temp;
    }

    public Node removeLast(){
        if(length==0){
            return null;
        }
        Node temp = head;
        Node pre = head;
        while(temp.next!=null){
            pre = temp;
            temp=temp.next;
        }
        tail = pre;
        tail.next = null;
        length--;
        return temp;
    }

    public Node getNodes(int index){
        if(index<0 && index>length){
            return null;
        }
        Node temp = head;
        for(int i=0;i<index;i++){
            temp = temp.next;
        }
        return temp;
    }

    public boolean setValues(int index, int values){
        if(index<0 && index>length){
            return false;
        }
        Node temp =getNodes(index);
        temp.value = values;
        return true;
    }

    public boolean insertNodes(int index, int value){
        if(index<0 && index>length){
            return false;
        }
        if(index==0){
            prepend(value);
            return true;
        }
        if(index==length){
            append(value);
            return false;
        }
        Node newNode = new Node(value);
        Node pre = getNodes(index-1);
        Node temp = pre.next;
        pre.next = newNode;
        newNode.next = temp;
        length++;
        return true;
    }

    public Node removeNode(int index){
       if(index<0 && index>length){
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
       temp.next = null;
       length--;
       return temp;
    }

}
