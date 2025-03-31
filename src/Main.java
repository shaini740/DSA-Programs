public class Main {
    public static void main(String[] args) {
//////////////////////////  Linked List  ////////////////////////////////////////////
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

////////////////////// Doubly Linked List //////////////////////////////////////////////////////
        DoublyLinkedList doublyLinkedList = new DoublyLinkedList(1);
        doublyLinkedList.append(2);
        doublyLinkedList.append(3);
        doublyLinkedList.append(4);
        doublyLinkedList.prepend(5);
        doublyLinkedList.prepend(6);
        doublyLinkedList.printDoublyLinkedList();

        System.out.println("The Node removed at the First is "+doublyLinkedList.removeFirst().value);
        doublyLinkedList.printDoublyLinkedList();

        System.out.println("The Node removed at the Last is "+doublyLinkedList.removeLast().value);
        doublyLinkedList.printDoublyLinkedList();

        System.out.println("The Value of the Node at the Position 2 is "+doublyLinkedList.getNodes(2).value);

        System.out.println("The Value set at the Position 2 is "+doublyLinkedList.setNode(2,10).value);
        doublyLinkedList.printDoublyLinkedList();

        boolean isNodeInserted = doublyLinkedList.insertNode(2,20);
        if(isNodeInserted){
            System.out.println("Node is Inserted");
        }
        doublyLinkedList.printDoublyLinkedList();

        System.out.println("The Node is removed from Position 2  is "+doublyLinkedList.removeNode(2).value);
        doublyLinkedList.printDoublyLinkedList();
    }

}