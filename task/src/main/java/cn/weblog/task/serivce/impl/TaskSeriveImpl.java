package cn.weblog.task.serivce.impl;

import cn.weblog.task.mapper.TaskMapper;
import cn.weblog.task.pojo.Task;
import cn.weblog.task.serivce.TaskService;

import java.util.List;

public class TaskSeriveImpl implements TaskService {


    private TaskMapper taskMapper;

    public List<Task> getTask() {

        return taskMapper.getTask();

    }

    public List<Task> getTaskAndResult(Integer userId) {

        List<Task> allTasks= this.getTask();

        for (Task task : allTasks) {




        }

        return null;
    }
}
