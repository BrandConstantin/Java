package queues_and_stacks;

import java.util.LinkedList;
import java.util.Stack;

/**
 *
 * @author BrandConstantin
 */
public class Queues_and_Stacks {
    
    LinkedList queue;
    
    //make a queue instance
    public Queues_and_Stacks(){
        queue = new LinkedList();
    }
    
    public boolean isEmpty(){
        return queue.isEmpty();
    }
    
    public int size(){
        return queue.size();
    }
    
    public void enqueue(int n){
        queue.addLast(n);
    }
    
    public int dequeue(){
        return (int) queue.remove(0);
    }
    
    public int firstItem(){
        return (int) queue.get(0);
    }

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Queues_and_Stacks numberQueue = new Queues_and_Stacks();
        
        numberQueue.enqueue(5);
        numberQueue.enqueue(7);
        numberQueue.enqueue(2);
        numberQueue.enqueue(8);
        numberQueue.enqueue(1);
        numberQueue.enqueue(5);
        
        System.out.println(numberQueue.size());
        System.out.println("First out " + numberQueue.dequeue());
        System.out.println("First item " + numberQueue.firstItem());
        System.out.println(numberQueue.isEmpty());
        System.out.println(numberQueue.size());
        
        System.out.println("------------------------------------------------");
        Stack<Integer> stacky = new Stack<>();
        
        stacky.push(3);
        stacky.push(5);
        
        System.out.println(stacky.pop());
        System.out.println(stacky.peek());
        System.out.println(stacky.pop());
        System.out.println(stacky.size());
    }
    
}
