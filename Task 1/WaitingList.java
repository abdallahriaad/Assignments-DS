// Part C - Java LinkedList Task 1
import java.util.LinkedList;
public class WaitingList {
 public static void main(String[] args) {
        LinkedList<String> waitingList = new LinkedList<>();

        waitingList.addLast("Ahmad");
        waitingList.addLast("Sami"); 
        waitingList.addLast("Khaled");
        System.out.println("Last after added students: " + waitingList);

        waitingList.addFirst("Abdallah");
        waitingList.addFirst("Mahmoud"); 
        System.out.println("Last after added first student (priority): " + waitingList);

        String ServeNextStudent = waitingList.removeFirst();
        System.out.println("The student has been served: " + ServeNextStudent);
        System.out.println("Last after remove first student: " + waitingList);

        waitingList.remove("Sami");
        System.out.println("Last after remove Sami: " + waitingList);

        System.out.println("The Current list is: " + waitingList);
    }
}
