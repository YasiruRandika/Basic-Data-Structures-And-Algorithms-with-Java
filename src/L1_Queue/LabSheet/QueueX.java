package L1_Queue.LabSheet;

/*
* Create the class QueueX to get the idea of how Queue works
* */
public class QueueX {
    private int maxSize;
    private int queArray[];
    private int front;
    private int rear;
    private int nItems;

    public QueueX(int maxSize) {
        this.maxSize = maxSize;
        queArray = new int[this.maxSize];
        front = 0;
        rear = -1;
        nItems = 0;
    }

    /*Inset Elements for Linear Queue*/
    /*
    public void insert(int i) {
        if (rear == maxSize - 1) {
            System.out.println("*** Queue is Full ***\n");
        } else {
            queArray[++rear] = i;
            nItems ++;
        }
    }*/

    /*Insert elements for Ciruclar Queue*/
    public void insert(int i) {
        if (nItems == maxSize) {
            System.out.println("*** Queue is Full ***\n");
        } else {
           if (rear == maxSize - 1) {
               rear = -1;
           }

           queArray[++rear] = i;
           nItems++;
        }
    }

    /*Remove items from Linear Queue*/
    /*
    public int remove() {
        if (nItems == 0) {
            System.out.println("*** Queue is Empty ***\n");
            return -99;
        } else {
            nItems --;
            return queArray[front++];
        }
    }*/

    /*Remove items from Circular Queue*/
    public int remove() {
        if (nItems == 0) {
            System.out.println("*** Queue is Empty ***\n");
            return -99;
        } else {
            int temp = queArray[front++];
            if (front == maxSize) {
                front = 0;
            }
            nItems--;
            return temp;
        }
    }

    public double peek() {
        if (nItems == 0) {
            System.out.println("*** Queue is Empty ***\n");
            return -99;
        } else {
            return queArray[front];
        }
    }

    public boolean isEmpty() {
        if (nItems == 0) {
            return true;
        } else {
            return false;
        }
    }

    public boolean isFull() {
        if (nItems == maxSize - 1) {
            return true;
        } else {
            return false;
        }
    }

    public boolean isPeekFront() {
        if (front == 0) {
            return true;
        } else {
            return false;
        }
    }

    public int size() {
        return nItems;
    }
}

