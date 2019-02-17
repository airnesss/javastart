package pl.sda.javastart.Queue;

import java.util.LinkedList;
import java.util.Queue;

public class ClientApp {
    public static void main(String[] args) {
        Queue<Client> clientQueue = new LinkedList<>();

        clientQueue.offer(new Client("Grażyna"));
        clientQueue.offer(new Client("Kokoszko"));
        clientQueue.offer(new Client("PituPitu"));
        clientQueue.offer(new Client("Dumbo"));

        //PEEK pobiera element z kolejki ale go nie usuwa
        System.out.println("Metoda peek()(1)" + clientQueue.peek());
        System.out.println("Metoda peek()(2)" + clientQueue.peek());
//POLL pobiera element z kolejki i go usuwa , zwraca NULL gdy kolejka jest pusta
        System.out.println("metoda poll()(1)" + clientQueue.poll());
        System.out.println("metoda poll()(2)" + clientQueue.poll() + "\n");

        System.out.println("Stan kolejki: " + clientQueue);
        System.out.println("Peek " + clientQueue.peek());
        System.out.println("Stan kolejki " + clientQueue);
        System.out.println("Poll " + clientQueue.poll());
        System.out.println("Stan kolejki " + clientQueue.poll());
    }
}
