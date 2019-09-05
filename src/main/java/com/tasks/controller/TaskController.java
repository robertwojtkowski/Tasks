package com.tasks.controller;



import com.tasks.domain.TaskDto;
import org.springframework.web.bind.annotation.*;

import java.util.ArrayList;
import java.util.List;

@RestController
@RequestMapping("/v1/task")
public class TaskController {

    @RequestMapping(method = RequestMethod.GET, value = "getTasks")
    public List<TaskDto> getTasks(){
        return new ArrayList<>();
    }

    @RequestMapping(method = RequestMethod.GET, value = "getTask/{id}")
    public TaskDto getTask(@PathVariable("id") Long id){
        return new TaskDto( id, "Test title", "test content");
    }

    @RequestMapping(method = RequestMethod.DELETE, value = "deleteTask/{id}")
    public void deleteTask(@PathVariable("id") Long id){

    }

    @RequestMapping(method = RequestMethod.PATCH, value = "/updateTask")
    public TaskDto updateTask(@RequestBody TaskDto taskDto){
        return new TaskDto(1L, "Edited test tittle", "Test Content");
    }

    @RequestMapping(method = RequestMethod.POST, value = "/createTask")
    public void createTask(@RequestBody TaskDto taskDto){

    }
}
