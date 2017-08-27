package cn.weblog.task.serivce.impl;

import cn.weblog.task.BaseTask;
import cn.weblog.task.mapper.TaskMapper;
import cn.weblog.task.pojo.Task;
import cn.weblog.task.serivce.TaskService;

import java.util.List;

public class TaskSeriveImpl implements TaskService {


    private TaskMapper taskMapper;

    public List<BaseTask> getTask() {
        return null;
    }

    public List<BaseTask> getTaskAndResult(Integer userId) {
        return null;
    }
}
