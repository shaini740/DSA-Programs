public class Main {
    public static void main(String[] args) {


        LinkedList linkedList = new LinkedList(1);

        linkedList.append(2);
        linkedList.append(3);

        linkedList.prepend(4);
        linkedList.prepend(7);
        linkedList.append(8);

        System.out.println("Linked List before removing Nodes : ");
        linkedList.printLinkedList();

        System.out.println("After Setting the values as 5 in the posistion 2 :");
        linkedList.setValues(2,5);
        linkedList.printLinkedList();

        boolean isValueInserted = linkedList.insertNodes(2,10);
        if(isValueInserted){
            System.out.println("The Node is Inserted at the position 2");
        }
        else{
            System.out.println("Not able to insert : ");
        }
        linkedList.printLinkedList();
        linkedList.removeNode(2);
        System.out.println("After remving the Node at position 2");
        linkedList.printLinkedList();

        System.out.println("The Nodes at the Position 2 is "+linkedList.getNodes(2).value);

        linkedList.removeFirst();
        linkedList.removeLast();

        System.out.println("Linked List After removing first and last Node :");
        linkedList.printLinkedList();
    }
}