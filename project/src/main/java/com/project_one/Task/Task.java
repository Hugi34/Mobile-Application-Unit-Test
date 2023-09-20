package com.project_one.Task;

import lombok.EqualsAndHashCode;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import lombok.ToString;

/**
 * This class represents a task in the task list.
 */
    @Getter
    @Setter
    @EqualsAndHashCode
    @NoArgsConstructor
    @ToString
public class Task {
        private int id; // id of the task
        private String name; // name of the task
        private String description; // description of the task

        /**
         * Constructor for the task class.
         * @param id id of the task
         * @param name name of the task
         * @param description description of the task
         */
        public Task(int id, String name, String description){
            this.id = 0; //Id of the task
            this.name = ""; //Name of the task
            this.description = ""; //Description of the task
        }


    
}
