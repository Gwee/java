import java.util.Date;

/**
 * Created by guy on 05/06/2016.
 */
public class Program {

    public static void main(String[] args) {
        TaskList taskList = new TaskList(4);
        Task tsk1 = new Task("1st Task",new Date(13/4/15));
        Task tsk2 = new Task("2nd Task", new Date(14/5/16));
        taskList.addTask(tsk1,tsk2);
        TaskList newTaskList = taskList.clone();
        System.out.println(taskList.toString());

    }
}
