package cn.weblog.task.pojo;

public class Task {


    private Integer id;

    private String name;

    private String icon;   //任务名称旁边显示的icon图标路径

    private Integer taskType;   //数据库存储时的任务类型 对应TaskType的id;

    private Integer rewardType;  //奖励类型 对应Reward

    private Integer isOpen;    // 0默认关闭 1开启

    private String quote;      //任务说明：[{"name":"1.首先您需要登录我们的博客",}{"name":"2.连续签到,奖励丰富","img":"images/quote.png"}]


    public Task(String name, String icon, Integer taskType, Integer rewardType, Integer isOpen, String quote) {
        this.name = name;
        this.icon = icon;
        this.taskType = taskType;
        this.rewardType = rewardType;
        this.isOpen = isOpen;
        this.quote = quote;
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getIcon() {
        return icon;
    }

    public void setIcon(String icon) {
        this.icon = icon;
    }

    public Integer getTaskType() {
        return taskType;
    }

    public void setTaskType(Integer taskType) {
        this.taskType = taskType;
    }

    public Integer getRewardType() {
        return rewardType;
    }

    public void setRewardType(Integer rewardType) {
        this.rewardType = rewardType;
    }

    public Integer getIsOpen() {
        return isOpen;
    }

    public void setIsOpen(Integer isOpen) {
        this.isOpen = isOpen;
    }

    public String getQuote() {
        return quote;
    }

    public void setQuote(String quote) {
        this.quote = quote;
    }
}
