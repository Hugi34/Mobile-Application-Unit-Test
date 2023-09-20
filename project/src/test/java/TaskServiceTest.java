import org.junit.Test;

import com.project_one.Task.Task;
import com.project_one.Task.TaskService;

/**
 * Test class for TaskService
 */
public class TaskServiceTest {

    /**
     * Test method for addTask
     */
    @Test
    public void testAddTask() {
        Task task = new Task(1, "Wash Car.", "Wash the Car."); //New Task
        TaskService taskService = new TaskService(); //New TaskService
        taskService.addTask(task); //Add task to taskService
    }

    /**
     * Test method for removeTask
     */
    @Test
    public void testRemoveTask() {
        Task task = new Task(1, "Wash Car.", "Wash the Car."); //New Task
        TaskService taskService = new TaskService(); //New TaskService
        taskService.addTask(task); //Add task to taskService
        taskService.removeTask(1); //Remove task from taskService
    }
   

}
