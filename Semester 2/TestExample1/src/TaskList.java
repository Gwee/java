/**
 * Created by guy on 05/06/2016.
 */
public class TaskList {
    private Task[] tasks;
    private int counter;
    public TaskList(int n){
        this.counter = n;
        tasks = new Task[n];
    }

    @Override
    public String toString() {
        String retStr = "[ ";
        for (int i = 0; i < counter; i++) {
            if (!tasks[i].isDone() && tasks[i]!=null){
                retStr+= tasks[i];
            }
        }
        retStr+="]";
        return retStr;
    }
    public void addTask(Task ... tsk){
        for (int i = 0; i < tsk.length; i++) {
                tasks[i] = tsk[i];
        }
    }

    //best clone example
    public TaskList clone() throws CloneNotSupportedException{
        TaskList retTaskList = (TaskList) super.clone();
        retTaskList.tasks = (Task[]) retTaskList.tasks.clone();
        for (int i = 0; i < counter; i++) {
            retTaskList.tasks[i] = (Task) retTaskList.tasks[i].clone();
        }
        return retTaskList;
    }
    public boolean equals(Object o){
        if (!(o instanceof TaskList && o!=null)){
            return false;
        }
        TaskList t = (TaskList)o;

        for (int i = 0; i < counter; i++) {
            if (!tasks[i].isDone()){
                int j;
            }
        }
        // FIXME: 05/06/2016 COPY FROM INTERNET

        Task[] taskArr1 = new Task[counter];
        Task[] taskArr2 = new Task[((TaskList) o).counter];
        for (int i = 0; i < taskArr1.length; i++) {
            if (taskArr1)
        }
        for (int i = 0; i < tasks.length; i++) {

        }
        for (int i = 0; i < tasks.length; i++) {

        }
    }

}
