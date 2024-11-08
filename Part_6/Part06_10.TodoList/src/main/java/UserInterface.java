import java.util.Scanner;

public class UserInterface {
    private Scanner scanner;
    private TodoList todoList;

    public UserInterface(TodoList todoList, Scanner scanner) {
        this.scanner = scanner;
        this.todoList = todoList;
    }

    public void start(){
        while(true){
            System.out.println("Command: ");
            String command = scanner.nextLine();
            if(command.equals("stop")){
                break;
            }
            else if(command.equals("add")){
                System.out.print("To add:");
                String toAdd = scanner.nextLine();
                todoList.add(toAdd);
            } else if(command.equals("remove")){
                System.out.print("Which one is remove?");
                int toRemove = scanner.nextInt();
                todoList.remove(toRemove);
            } else if (command.equals("list")) {
                todoList.print();
            }
            else{
                System.out.println("Unknown command");
            }
        }
    }
}
