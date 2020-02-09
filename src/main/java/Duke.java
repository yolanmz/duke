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
        String[] list = new String[100];
        int listCounter = 0;
        while(!input.equals("bye")){
            if(input.equals("list")){
                printSeparator();
                System.out.println("list");
                for(int i=0; i<listCounter;i++){
                    System.out.println(i+1 + ". " +  list[i]);
                }
                printSeparator();
            } else{
                list[listCounter] = input;
                listCounter++;
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
