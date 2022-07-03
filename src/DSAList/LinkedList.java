package DSAList;

public class LinkedList {

    private Node head;

    public void insertAtHead(int data){

        // Kind of Swapping
        // a = b
        // b = c
        // c = a
        Node newNode = new Node(data);
        newNode.setNextNode(this.head);
        this.head = newNode;
    }

    public int length(){
        int len = 0;
        Node current = this.head;
        while (current != null){
            len ++;
            current = current.getNextNode();
        }
        return len;
    }

    public Node find(int data){
            Node current = this.head;

        while (current != null){
            if (current.getData() == data){
                return current;
            }
            current = current.getNextNode();
        }
        return null;
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
        LinkedList list = new LinkedList();

        list.insertAtHead(5);
        list.insertAtHead(10);
        list.insertAtHead(14);
        list.insertAtHead(7);
        list.insertAtHead(8);

        System.out.println(list);
        System.out.println("Length: " + list.length());
        System.out.println("Found 14: " + list.find(14));
        System.out.println("Not Found 99: " + list.find(99));

    }
}
