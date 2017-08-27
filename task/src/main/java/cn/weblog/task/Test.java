package cn.weblog.task;

import cn.weblog.task.quote.Line;
import cn.weblog.task.reward.PointReward;
import cn.weblog.task.type.BaseType;
import cn.weblog.task.type.DayType;
import com.google.gson.Gson;

import java.util.ArrayList;
import java.util.List;

public class Test {

    public static void main(String[] args) {


        // TODO:  2017年08月28日05:17:03

        /**
         * 任务模块抽象化设计关系
         * TaskType类只维护不同任务的类型名称 以及Id   （存db时候存储对应的id）
         * Reward 类记录任务奖励 ，基类只记录不同奖励类型的id ,子类实现的时候自己拓展具体的奖励内容
         *
         * 关于PointReward类这样定义的原因(为什么不直接放在BaskTask里定义)：
         * 因为此处将奖励细分，任务完成后的奖励会有不同种类的东西，例如这里实现的是积分奖励，我们只关心这个积分有多少，
         * 如果是其他奖励，如优惠卷，那么我们就该在对应的子类里添加一个优惠价对象(比如 优惠价金额，哪些商品能使用，什么时候过期，等等)
         *
         *
         *
         * */
        TaskType taskType = new DayType("每日任务", 2);

        TaskType taskType2 = new BaseType("基础任务", 1);

        Reward reward = new PointReward(1, 5);

        Reward reward2 = new PointReward(1, 20);

        Reward reward3 = new PointReward(1, 50);



        List<Line> lines =new ArrayList<Line>();

        lines.add(new Line("1.任务说明1111"));

        lines.add(new Line("1.任务说明22222"));

        lines.add(new Line("3.任务说明22222","images/text"));

        Quote quote = new Quote(lines);

        BaseTask taskModel1 = new EveryDayTask("每日登陆奖励", taskType, reward, quote, 1);

        BaseTask taskModel2 = new EveryDayTask("发表博客", taskType, reward2, quote, 2);

        BaseTask taskModel3 = new BaseTask("发表博客", taskType2, reward3, quote);

        Gson gson = new Gson();

        List<BaseTask> list =new ArrayList<BaseTask>();

        list.add(taskModel1);
        list.add(taskModel2);
        list.add(taskModel3);

        System.out.println(gson.toJson(list));

    }

}
