import java.util.Scanner;

public class Duke {
    public static void main(String[] args) {
        String logo = " ____        _        \n"
                + "|  _ \\ _   _| | _____ \n"
                + "| | | | | | | |/ / _ \\\n"
                + "| |_| | |_| |   <  __/\n"
                + "|____/ \\__,_|_|\\_\\___|\n";
        System.out.println("Hello from\n" + logo);
        System.out.println("------------------------------------------------");
        System.out.println("Hello! I'm Duke");
        System.out.println("What can I do for you?\n");
        System.out.println("------------------------------------------------");

        Scanner in = new Scanner(System.in);
        String input = in.nextLine();
        String[] list = new String[100];
        int listCounter = 0;
        while(!input.equals("bye")){
            if(input.equals("list")){
                System.out.println("------------------------------------------------");
                System.out.println("list");
                for(int i=0; i<listCounter;i++){
                    System.out.println(i+1 + ". " +  list[i]);
                }
                System.out.println("------------------------------------------------");
            } else{
                list[listCounter] = input;
                listCounter++;
                System.out.println("------------------------------------------------");
                System.out.println("added: " + input);
                System.out.println("------------------------------------------------");

            }
            in = new Scanner(System.in);
            input = in.nextLine();

        }
        if(input.equals("bye")) {
            System.out.println("------------------------------------------------");
            System.out.println("Bye. Hope to see you again soon!");
            System.out.println("------------------------------------------------");
        }

    }
}
