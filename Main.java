import java.util.ArrayDeque;
import java.util.Scanner;
/*Dear Miss Azhar
I've already sent you first 10 task with last practice tasks on topic ArrayList*/

public class Main {
    public static void main(String[] args){
        //task11();
        //task12();
        //task13();
        //task14();
        //task15();
        //task16();
        //task17();
        //task18();
        //task19();
        //task20();


    }
    public static void task11(){
        ArrayDeque<Integer> deque = new ArrayDeque<>();
        for(int i = 100; i<103; i++){
            deque.offer(i);
        }
        while(!deque.isEmpty()){
            System.out.println("Выходит из очереди: " + deque.peek());
            System.out.println(deque.poll() + " вышел из очереди");
            if(!deque.isEmpty()) {
                System.out.println("Следующий на очереди: " + deque.peek());
                System.out.println();
            }
        }

    }
    public static void task12(){
        ArrayDeque<String> strings = new ArrayDeque<>();
        strings.push("Hello");
        strings.push("Good day");
        strings.push("Hi");

        do {
            String pops = strings.pop();
            System.out.println(pops);
        }while(!strings.isEmpty());
    }
    public static void task13(){
        ArrayDeque<Integer> ints = new ArrayDeque<>();
        ints.addFirst(13);
        ints.addLast(28);
        ints.addFirst(64);
        for(int i : ints) System.out.println(i);
    }
    public static void task14(){
        ArrayDeque<Integer> ints = new ArrayDeque<>();
        boolean a = ints.offerFirst(12);
        boolean b = ints.offerLast(28);
        boolean c = ints.offerFirst(64);

        System.out.println(a);
        System.out.println(b);
        System.out.println(c);

        System.out.println(ints);
    }
    public static void task15(){
        ArrayDeque<Integer> comse25 = new ArrayDeque<>();
        ArrayDeque<Integer> comse95 = new ArrayDeque<>();
        for (int i = 1; i < 4; i++) comse25.add(i);
        System.out.println(comse25.peekFirst());
        System.out.println(comse25.peekLast());
        System.out.println(comse95.peekLast());
        System.out.println(comse95.peekFirst());
        //if deque is empty, then peek method returns null
    }
    public static void task16(){
        ArrayDeque<Integer> ints = new ArrayDeque<>();
        for(int i = 1; i < 4; i++)ints.add(i);
        System.out.println(ints.pollLast());
        System.out.println(ints.pollFirst());
        System.out.println(ints.pollFirst());
        System.out.println(ints.poll());
    }
    public static void task17(){
        ArrayDeque<String> deq = new ArrayDeque<>();
        deq.add("a");
        deq.add("b");
        deq.add("c");
        deq.add("b");
        deq.add("a");
        deq.removeFirstOccurrence("b");
        deq.removeLastOccurrence("a");
        System.out.println(deq);
    }
    public static void task18(){
        ArrayDeque<Integer> d = new ArrayDeque<>();
        d.add(23);
        d.addFirst(31);
        d.addLast(16);
        d.removeLast();
        System.out.println(d.size());
        System.out.println(d.isEmpty());
    }
    public static void task19(){
        ArrayDeque<Integer> d = new ArrayDeque<>();
        for (int i = 0; i < 4; i++) {
            d.add(i);
        }
        d.clear();
        System.out.println(d.peek());
        System.out.print(d.isEmpty());
    }
    public static void addTask(ArrayDeque<String> your, String task, boolean HighPriority){
        if(HighPriority) your.offerFirst(task);
        else your.offerLast(task);
    }
    public static void processTask(ArrayDeque<String> your, String task){
        if(!your.isEmpty()) {
            your.remove(task);
        }else System.out.println("You don't have any task");
    }
    public static void task20(){
        ArrayDeque<String> tasks = new ArrayDeque<>();
        addTask(tasks,"Vacuum a carpet", true);
        addTask(tasks,"Watch a movie",false);
        System.out.println(tasks);
        processTask(tasks,"Vacuum a carpet");
        System.out.println(tasks);
        processTask(tasks,"Watch a movie");
        System.out.println(tasks);
        processTask(tasks,"Play basketball");

    }
}