package DoublyLinkedList;

public class DoublyLinkedList {
    private Node first;
    private Node last;

    public DoublyLinkedList() {
    }

    public boolean isEmpty(){
        return first == null;
    }

    public void insertAtFront(Student student){

        Node newNode = new Node(student);

        if(isEmpty()){
            first = last = newNode;
        } else{
            newNode.setNext(first);
            first.setPrev(newNode);
            first = newNode;
        }
    }

    public void insertAtBack(Student student){

        Node newNode = new Node(student);

        if(isEmpty()){
            first=last=newNode;
        } else{
            newNode.setPrev(last);
            last.setNext(newNode);
            last = newNode;
        }

    }

    public boolean removeFromBack(){

        if(isEmpty())//liste bo�sa
            return false;
        else {
            if(first == last) //listede tek eleman var demek
                first = last = null;
            else {//listede birden fazla eleman varsa
                last = last.getPrev();
                last.setNext(null);
            }
            return true;
        }

    }

    public boolean removeFromFront(){

        if(isEmpty())
            return false;
        else {
            if(first == last)
                first = last = null;
            else {//listede birden fazla eleman varsa
                first = first.getNext(); // Yeni baş düğüm bir sonraki düğüm olur.
                first.setPrev(null);
            }
            return true;
        }
    }

    public void outputList(){
        if (isEmpty()) {
            System.out.println("List is empty.");
        }

        Node current = first; // Listenin başından başla.
        while (current != null) {
            System.out.println(current.getItem()); // Düğümün verisini yazdır.
            current = current.getNext(); // Sonraki düğüme geç.
        }
    }

    public void outputListBackward(){
        if (isEmpty()) {
            System.out.println("List is empty.");
        }

        Node current = last; // Listenin başından başla.
        while (current != null) {
            System.out.println(current.getItem()); // Düğümün verisini yazdır.
            current = current.getPrev(); // Sonraki düğüme geç.
        }
    }
}
