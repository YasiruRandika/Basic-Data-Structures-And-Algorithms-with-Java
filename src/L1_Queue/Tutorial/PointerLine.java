package L1_Queue.Tutorial;

public class PointerLine {
    private int jobArr[];
    private int nItems;
    private int maxSize;
    private int rear;
    private int front;

    public PointerLine(int size) {
        jobArr = new int[size];
        this.maxSize = size;
        front = 0;
        rear = -1;
    }

    public void insert(int jobId) {
        if (nItems == maxSize) {
            System.out.println("***Print Queue is Full ***\n");
        } else {
            if (rear == maxSize - 1) {
                rear = -1;
            }

            jobArr[++rear] = jobId;
            nItems++;
        }
    }

    public void remove() {
        if (nItems == 0) {
            System.out.println("*** Queue is Empty ***\n");
        } else {
            int temp = jobArr[front++];
            if (temp % 2 == 0) {
                System.out.println(temp + " (PC 1)");
            } else {
                System.out.println(temp + " (PC 2)");
            }
            if (front == maxSize) {
                front = 0;
            }
            nItems--;
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
}
