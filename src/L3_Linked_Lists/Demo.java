package L3_Linked_Lists;

public class Demo {
    public static void main(String[] args) {
        /*
        * Linked list class demo
        * Using three Student objects
        * */
        //Create linked list to insert three students
        LinkedList linkedList = new LinkedList();
        Student student1 = new Student("Nipuna", 53.5);
        Student student2 = new Student("Aravinda", 78.0);
        Student student3 = new Student("Prashani", 69.5);

        //Inserts three students to the linked list
        linkedList.insertFirst(student1);
        linkedList.insertFirst(student2);
        linkedList.insertFirst(student3);

        //Display the linked list
        linkedList.displayList();

        //Delete the first link from the linked list
        linkedList.deleteFirst();

        //Display the linked list
        linkedList.displayList();

        //Insert after some student
        linkedList.insertAfter("Nipuna", student3);

        /*
        * Display the linked list
        * Here the order should be Aravinda, Nipuna and then Prashani*/
        linkedList.displayList();

        /*
        * Likewise we can also use the Doubly-Linked list and Double ended List to store the values
        * The same proceduer happens but those two lists have their own features
        * Please go through the Doubly-Linke list and Double End list
        * */
    }
}
