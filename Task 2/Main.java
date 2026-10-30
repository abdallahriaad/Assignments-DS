
public class Main {

    public static void main(String[] args) {
        /* Question 1 - Remove All Adjacent Duplicates in String  */
        // SolutionQ1 solution = new SolutionQ1();
        // Scanner in = new Scanner(System.in);

        // System.out.print("Enter a string: ");
        // String input = in.nextLine();
        // String output = solution.removeDuplicates(input);
        // System.out.println("Input: " + input);
        // System.out.println("Output: " + output);
        //120221864 - Abdallah Riad

        /*Question 2 - Evaluate Reverse Polish Notation */
        // SolutionQ2 solution = new SolutionQ2();
        // String arr[] = {"4","13","5","/","+","4","+"}; 
        // System.out.println(solution.evalRPN(arr));

        //120221864 - Abdallah Riad

        
        /*Question 3 - Number of Recent Calls */
        // SolutionQ3 counter = new SolutionQ3(10);
        // System.out.println(counter.ping(1));
        // System.out.println(counter.ping(100));
        // System.out.println(counter.ping(200));
        // System.out.println(counter.ping(3000));
        // System.out.println(counter.ping(3001));
        // System.out.println(counter.ping(3002));

        //120221864 - Abdallah Riad

        /*Question 4 - Design Circular Queue */
        SolutionQ4 myCircularQueue = new SolutionQ4(3);
        myCircularQueue.enQueue(1);
        myCircularQueue.enQueue(2);
        myCircularQueue.enQueue(3); 
        System.out.println(myCircularQueue.enQueue(4));
        System.out.println(myCircularQueue.deQueue());
        System.out.println(myCircularQueue.enQueue(4));
        System.out.println(myCircularQueue.Rear());
        
        //120221864 - Abdallah Riad
    }
}
