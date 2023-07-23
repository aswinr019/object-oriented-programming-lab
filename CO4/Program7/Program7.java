/*
  Producer/Consumer using ITC.
*/

import java.util.ArrayList;

class Producer implements Runnable {

  private ArrayList<Integer> buffer;
  private int capacity;

  public Producer(ArrayList<Integer> buffer, int capacity) {
    this.buffer = buffer;
    this.capacity = capacity;
  }

  public void run() {
    int value = 0;

    while (true) {
      synchronized (buffer) {
        while (buffer.size() == capacity) {

          try {
            buffer.wait();
          } catch (InterruptedException e) {
            System.out.println("Exception occured!");
          }
        }
        System.out.printf("Produced %d\n", value);
        buffer.add(value);
        value++;
        buffer.notify();
      }
    }
  }
}

class Consumer implements Runnable {

  private ArrayList<Integer> buffer;

  public Consumer(ArrayList<Integer> buffer) {
    this.buffer = buffer;
  }

  public void run() {

    while (true) {
      synchronized (buffer) {
        while (buffer.size() == 0) {

          try {
            buffer.wait();
          } catch (InterruptedException e) {
            System.out.println("Exception occured!");
          }
        }
        int value = buffer.remove(0);
        System.out.printf("Consumed %d\n", value);
        buffer.notify();
      }
    }
  }
}

class Program7 {

  public static void main(String args[]) {

    ArrayList<Integer> buffer = new ArrayList<>();
    int capacity = 10;

    Runnable producer = new Producer(buffer, capacity);
    Runnable consumer = new Consumer(buffer);

    Thread threadOne = new Thread(producer);
    Thread threadTwo = new Thread(consumer);

    threadOne.start();
    threadTwo.start();
  }
}

