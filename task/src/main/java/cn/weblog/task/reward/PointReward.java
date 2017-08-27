package cn.weblog.task.reward;

import cn.weblog.task.Reward;

public class PointReward extends Reward{


    private int amount;   //奖励的积分数量

    public PointReward(int id, int amount) {
        super(id);
        this.amount = amount;
    }
}
