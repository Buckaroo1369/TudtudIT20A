package Midterm;

public class stackArray {
    
   private int[] stack;
   private int top;
   private int capacity;
   
   public stackArray(int capacity){
       this.capacity = capacity;
       this.stack = new int[capacity];
       this.top = -1;
   }
   
   public static void main(String[] args){
       stackArray stack = new stackArray(13);
       
       stack.push(1);
       stack.push(2);
       stack.push(3);
       stack.push(4);
       stack.push(5);
       stack.push(6);
       stack.push(7);
       stack.push(8);
       stack.push(9);
       stack.push(10);
       stack.push(11);
       
   }
   
   public void push(int value) {
       if (isFull()) {
           System.out.println("Stack Overflow! Stack is full.");
           return;
       }
       top++;
       stack[top] = value;
       System.out.println("Pushed at " + top + ": " + value);
   }
   
   public int peek(){
       if (isEmpty()) {
           System.out.println("Stack is empty.");
           return -1;
       }
       return stack[top];
   }
   
   public int pop(){
       if (isEmpty()) {
           System.out.println("Stack Underflow! Stack is empty.");
           return -1;
       }
       
       int value = stack[top];
       top--;
       return value;
   }
   
  public boolean isEmpty() {
       return top == -1;
   }
  
  public boolean isFull() {
      return top == capacity -1;
  }
  
  public void display() {
      if (isEmpty()) {
          System.out.println("Stack is empty.");
          return;
      }
      System.out.println("Stack elements:");
      for (int i = top; i >= 0; i++) {
          System.out.println(stack[i]);
      }
  }
    
    
}
