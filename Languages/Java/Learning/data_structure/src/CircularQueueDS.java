public class CircularQueueDS {
    public static void main(String[] args) {

        CircularQueue q1 = new CircularQueue(5);
        q1.enqueue(4);
        q1.printQueue();


    }
}

class CircularQueue{
    int maxSize;
    int size;
    int nextValidSlot;
    int [] queue;

    public CircularQueue(int maxSize) {
        this.maxSize = maxSize;
        queue = new int[maxSize];
        this.size = 0;
        this.nextValidSlot = 0;
    }

    public void enqueue(int val){

        queue[nextValidSlot] = val;
        nextValidSlot = (nextValidSlot + 1) % maxSize;
        if(size < maxSize){
            size++;
        }
    }

    public int getMaxSize() {
        return maxSize;
    }

    public int getSize() {
        return size;
    }

    public int getNextValidSlot() {
        return nextValidSlot;
    }

    public void printQueue(){
        int temp = nextValidSlot;
        for (int i = 0; i<size; i++){
            if (size== maxSize) {
                System.out.println(temp + ": " + queue[temp] + " \n");
                temp = (temp + 1) % maxSize;
            }else{
                System.out.println(i + ": " + queue[i] + " \n");
            }

        }
    }
}
