package cn.weblog.task.pojo;

import java.util.Date;

public class UserExecuteTask {

    private Integer id;

    private Integer userId;

    private Integer taskId;

    private String taskName;

    private String dayNo;   //  格式为：2017-01-01

    private Date createTime;


    public UserExecuteTask(Integer userId, Integer taskId, String taskName, String dayNo, Date createTime) {
        this.userId = userId;
        this.taskId = taskId;
        this.taskName = taskName;
        this.dayNo = dayNo;
        this.createTime = createTime;
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public Integer getUserId() {
        return userId;
    }

    public void setUserId(Integer userId) {
        this.userId = userId;
    }

    public Integer getTaskId() {
        return taskId;
    }

    public void setTaskId(Integer taskId) {
        this.taskId = taskId;
    }

    public String getTaskName() {
        return taskName;
    }

    public void setTaskName(String taskName) {
        this.taskName = taskName;
    }

    public String getDayNo() {
        return dayNo;
    }

    public void setDayNo(String dayNo) {
        this.dayNo = dayNo;
    }

    public Date getCreateTime() {
        return createTime;
    }

    public void setCreateTime(Date createTime) {
        this.createTime = createTime;
    }
}
