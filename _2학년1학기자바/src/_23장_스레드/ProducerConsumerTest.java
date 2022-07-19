package _23��_������;

class Buffer {
    private int data;

    public synchronized int get() {
        return data;
    }
    public synchronized void put(int data) {
        this.data = data;
    }
}

class Producer implements Runnable {
    private Buffer buffer;

    public Producer(Buffer buffer) {
        this.buffer = buffer;
    }

    public void run() {
        for(int i = 0; i < 10; i++) {
            buffer.put(i);
            System.out.println("������: " + i + "�� �ɟ��� �����Ͽ����ϴ�.");

            try {
                Thread.sleep((int) (Math.random() * 100));
            } catch (InterruptedException e) {
            }
        }
    }
}

class Consumer implements Runnable {
    private Buffer buffer;

    public Consumer(Buffer drop) {
        this.buffer = drop;
    }
    public void run() {
        for(int i = 0; i < 10; i++) {
            int data = buffer.get();
            System.out.println("�Һ���: " + data + "�� �ɟ��� �Һ��Ͽ����ϴ�.");
            try {
                Thread.sleep((int) (Math.random() * 100));
            } catch (InterruptedException e) {
            }
        }
    }
}
public class ProducerConsumerTest {
    public static void main(String[] args) {
        Buffer buffer = new Buffer();
        (new Thread(new Producer(buffer))).start();
        (new Thread(new Consumer(buffer))).start();

    }
}
