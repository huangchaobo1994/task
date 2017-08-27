package cn.weblog.task;

public  class BaseTask {

    private String name;

    private TaskType taskType;

    private Reward reward;

    private Quote quote;

    public BaseTask(String name, TaskType taskType, Reward reward, Quote quote) {
        this.name = name;
        this.taskType = taskType;
        this.reward = reward;
        this.quote = quote;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public TaskType getTaskType() {
        return taskType;
    }

    public void setTaskType(TaskType taskType) {
        this.taskType = taskType;
    }

    public Reward getReward() {
        return reward;
    }

    public void setReward(Reward reward) {
        this.reward = reward;
    }

    public Quote getQuote() {
        return quote;
    }

    public void setQuote(Quote quote) {
        this.quote = quote;
    }
}
