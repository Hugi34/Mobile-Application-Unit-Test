package com.project_one.Task;

import java.util.HashMap;
import java.util.Map;

/**
 * This class represents a task service.
 */
public class TaskService {
     private Map<Integer, Task> taskMap = new HashMap<>(); //Map of tasks
     
    /**
     * Constructor for the task service class.
     * @param task  task to be added
     */
     public void addTask (Task task){
         if(task != null && task.getId() != 0){ //If task is not null and task id is not 0
             taskMap.put(task.getId(), task); //Add task to map
         }
     }

     /**
      * This method removes a task from the map.
      * @param id id of the task to be removed
      */
     public void removeTask (int id){
             taskMap.remove(id); //Remove task from map
     }

    
}
