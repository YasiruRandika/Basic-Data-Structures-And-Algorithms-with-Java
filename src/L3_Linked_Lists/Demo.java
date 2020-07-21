package L3_Linked_Lists;

public class Demo {
    public static void main(String[] args) {
        LinkedList linkedList = new LinkedList();
        Student student1 = new Student("Nipuna", 53.5);
        Student student2 = new Student("Aravinda", 78.0);
        Student student3 = new Student("Prashani", 69.5);

        linkedList.insertFirst(student1);
        linkedList.insertFirst(student2);
        linkedList.insertFirst(student3);

        linkedList.displayList();
    }
}
