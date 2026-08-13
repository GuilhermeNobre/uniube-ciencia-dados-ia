package aula1;

public class Main {
    public static void main(String[] args) {
        Node node1 = new Node(10, null);
        Node node2 = new Node(20, node1);
        Node node3 = new Node(30, node2);

        for (Node i = node3; i != null; i = i.getNext()) {
            System.out.println(i.getValue());
            if (i.getNext() == null) {
                i.setNext(node3); // Create a cycle by linking the last node back to the first node
            }
        }

    }


}