package multithreading;


class Age {
    int age;
    boolean isSet = false;
    //synchronized is needed when wait() is present
    public synchronized void setAge(int age) {
        while (isSet){
            // waits until the Consumer has accessed the modified value. Wait() belongs to Object
            try {wait();} catch (Exception e) {}
        }
        System.out.println("Producer pushed:   "+age);
        this.age = age;
        isSet = true;
        notify(); //Notify() belongs to Object
    }

    public synchronized void getAge() {
        while (!isSet){
            try {wait();} catch (Exception e) {}
        }
        System.out.println("Consumer pulled:   "+age);
        isSet = false;
        notify();
    }
}

class Producer implements Runnable {
    Age obj;

    public Producer(Age obj) {
        this.obj = obj;
        Thread t = new Thread(this, "Producer");
        t.start();
    }

    @Override
    public void run() {
        int i = 1;
        while (true) {
            obj.setAge(i++);
            try {Thread.sleep(500); } catch (Exception e) {}
            if (i==11){System.exit(0);}
        }
    }
}

class Consumer implements Runnable {
    Age obj;
    public Consumer(Age obj) {
        this.obj = obj;
        Thread t = new Thread(this, "Consumer");
        t.start();
    }

    @Override
    public void run() {
        while (true) {
            obj.getAge();
            try {Thread.sleep(500);} catch (Exception e) {}
        }
    }
}

class InterThread {
    public static void main(String[] args) {
        Age a = new Age();
        new Producer(a);
        new Consumer(a);
    }

}
