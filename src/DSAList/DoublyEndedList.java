package DSAList;

public class DoublyEndedList {
    private Node head;
    private Node tail;

    public void insertAtTail(int data){
        Node newNode = new Node(data);
        if (this.head == null){
            this.head = newNode;
            this.tail = newNode;
        }

        if (this.tail != null){
            this.tail.setNextNode(newNode);
            this.tail = newNode;
        }
    }

    @Override
    public String toString(){
        String result = "{";
        Node current = this.head;

        while (current != null){
            result += current.toString() + ",";
            current = current.getNextNode();
        }
        result+= "}";
        return result;
    }

    public static void main(String[] Args){
        DoublyEndedList list = new DoublyEndedList();

        list.insertAtTail(5);
        list.insertAtTail(10);
        list.insertAtTail(14);
        list.insertAtTail(7);
        list.insertAtTail(8);

        System.out.println(list);

    }

}
