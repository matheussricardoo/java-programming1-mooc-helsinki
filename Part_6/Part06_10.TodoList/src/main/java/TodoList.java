import java.util.ArrayList;

public class TodoList {
    private ArrayList<String> taskList = new ArrayList<>();

    public TodoList(){
        this.taskList = new ArrayList<>();
    }

    public void add(String task){
        taskList.add(task);
    }

    public void remove(int number){
        taskList.remove(number - 1);
    }

    public void print(){
        int id = 1;
        for (String task : taskList){
            System.out.println(id + ": " + task);
            id++;
        }

    }

}
