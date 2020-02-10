import java.util.ArrayList;
import java.util.Scanner;

public class Duke {
    public static void printSeparator() {
        System.out.println("------------------------------------------------");
    }
    public static void printWelcomeMessage(){
        String logo = " ____        _        \n"
                + "|  _ \\ _   _| | _____ \n"
                + "| | | | | | | |/ / _ \\\n"
                + "| |_| | |_| |   <  __/\n"
                + "|____/ \\__,_|_|\\_\\___|\n";
        System.out.println("Hello from\n" + logo);
        printSeparator();
        System.out.println("Hello! I'm Duke");
        System.out.println("What can I do for you?\n");
        printSeparator();

    }
    public static void main(String[] args) {
        printWelcomeMessage();
        Scanner in = new Scanner(System.in);
        String input = in.nextLine();
        ArrayList<Task> taskList = new ArrayList<Task>();
        while(!input.equals("bye")){
            if(input.equals("list")) {
                printSeparator();
                System.out.println("list");
                for (int i = 0; i < taskList.size(); i++) {
                    System.out.println(i + 1 + ". " + "[" + taskList.get(i).getStatusIcon() + "] " + taskList.get(i));
                }
                printSeparator();
            }else if(input.startsWith("done")){
                int doneIndex = Integer.parseInt(input.substring(5));
                taskList.get(doneIndex-1).markAsDone();
                printSeparator();
                System.out.println("Nice! I've marked this task as done: ");
                System.out.println("["+ taskList.get(doneIndex-1).getStatusIcon() + "] " + taskList.get(doneIndex-1).toString());
                printSeparator();

            } else{
                Task task = new Task(input);
                taskList.add(task);
                printSeparator();
                System.out.println("added: " + input);
                printSeparator();

            }
            in = new Scanner(System.in);
            input = in.nextLine();

        }

        printSeparator();
        System.out.println("Bye. Hope to see you again soon!");
        printSeparator();


    }
}
