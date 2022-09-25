class MyCircularQueue {
  public MyCircularQueue(int k) {
    data = new int[k];
    read = 0;
    write = 0;
    cap = k;
  }

  public boolean enQueue(int value) {
    if (isFull()) {
      return false;
    }
    data[write++ % cap] = value;
    return true;
  }

  public boolean deQueue() {
    if (isEmpty()) {
      return false;
    }
    ++read;
    return true;
  }

  public int Front() {
    if (isEmpty()) {
      return -1;
    }
    return data[read % cap];
  }

  public int Rear() {
    if (isEmpty()) {
      return -1;
    }
    return data[(write - 1) % cap];
  }

  public boolean isEmpty() {
    return write == read;
  }

  public boolean isFull() {
    return write - read == cap;
  }
  
  private int data[];
  private int read;
  private int write;
  private int cap;
}
