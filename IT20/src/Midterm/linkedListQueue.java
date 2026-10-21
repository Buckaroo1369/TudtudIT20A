package Midterm;

public class linkedListQueue {
    private class Node {
        int data;
        Node next;
        
        Node (int data) {
        this.data = data;
    }
    
    private Node front;
    private Node rear;
    
    public void enqueue(int value) {
        Node newNode = new Node(value);
        
        if (rear == null) {
        front = rear = newNode;
        return;
        }
        
        rear.next = newNode;
        rear = newNode;
    }
    
    public int dequeue() {
        if (front== null) {
            System.out.println("Queue is empty!"); 
            return -1;
        }
        int value = front.data;
        front = front.next;
        
        if (front == null) {
            rear = null;
        }
        return value;
        
    }
    public static void main(String[] args) { 
        linkedListQueue q = new linkedListQueue();
    
        q.enqueue(10);
        
    }
}