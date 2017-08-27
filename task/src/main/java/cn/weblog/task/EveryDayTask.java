package cn.weblog.task;

public class EveryDayTask extends BaseTask{

    private int maxCompleteCount;


    public EveryDayTask(String name, TaskType taskType, Reward reward, Quote quote, int maxCompleteCount) {
        super(name, taskType, reward, quote);
        this.maxCompleteCount = maxCompleteCount;
    }

    public int getMaxCompleteCount() {
        return maxCompleteCount;
    }

    public void setMaxCompleteCount(int maxCompleteCount) {
        this.maxCompleteCount = maxCompleteCount;
    }
}
