package cn.weblog.task.serivce;



import cn.weblog.task.BaseTask;


import java.util.List;

public interface TaskService {


    /**
     * BaseTask只是基类，实际情况可能更多会返回其子类
     * */


    List<BaseTask> getTask();



    List<BaseTask> getTaskAndResult(Integer userId);

}
