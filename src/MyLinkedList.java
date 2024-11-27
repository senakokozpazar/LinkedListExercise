public class MyLinkedList {
    private MyNode root;
    private int size;

    public MyLinkedList() {
    }

    public void addStudent(Student student){
        //liste boş mu?
        if(root == null){
            root = new MyNode(student);
        } else{
            MyNode current = root;
            while (current.next != null)
                current = current.next;
                current.next = new MyNode(student);
        }
        size ++;
    }

    public void searchGpa(double gpa){
        //listeyi gez
        //pointer oluştur
        MyNode current = root;
        while(current != null){
            if(current.getStudent().getGpa() > gpa){
                System.out.println(current.getStudent().toString());
                current = current.next;
            }
        }

    }

    public void printData(){
        //listeyi gez
        MyNode current = root;
        while(current != null){
            System.out.println(current.getStudent().toString());
            current = current.next;
        }

    }
}
